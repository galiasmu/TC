# Estructura del compilador — explicación completa

Este documento explica cómo está armado el compilador: cada componente, su rol, y cómo se conectan entre sí a lo largo del pipeline de compilación.

## 1. Panorama general — el pipeline

Un compilador es una cadena de transformaciones: texto plano → tokens → árbol de sintaxis → AST propio → validado semánticamente → código de tres direcciones → código optimizado. Cada flecha es una clase distinta en el proyecto:

```
archivo.txt
    │  MiniLenguajeLexer (generado por ANTLR desde MiniLenguaje.g4)
    ▼
Tokens (CommonTokenStream)
    │  MiniLenguajeParser (generado por ANTLR)
    ▼
Parse Tree (árbol de ANTLR, genérico)
    │  ASTBuilder (Visitor propio)
    ▼
AST propio (NodoAST y subclases)
    │  AnalizadorSemantico
    ▼
AST validado + errores/warnings + TablaDeSimbolos
    │  TACGenerator
    ▼
TAC (List<String>, código de tres direcciones)
    │  optimizar() (adentro de TACGenerator)
    ▼
TAC optimizado
```

Todo esto lo orquesta `App.java`, que es el `main()` — llama a cada fase en orden y va imprimiendo/guardando resultados.

## 2. Recorrido capa por capa

### Capa 0 — La gramática: `MiniLenguaje.g4`

Es el único archivo que **no es Java**, es la definición formal del lenguaje en sintaxis ANTLR4. Tiene dos partes bien separadas:

- **Reglas del lexer** (parte de abajo del archivo, en MAYÚSCULAS): definen los *tokens* — las unidades mínimas con significado. Por ejemplo `TIPO : 'int' | 'double' | ...`, `ID : [a-zA-Z_][a-zA-Z0-9_]*`, `MAS : '+'`. El orden importa: ANTLR prueba las reglas de arriba hacia abajo y en caso de empate gana la más larga, por eso las palabras reservadas (`IF`, `WHILE`, `FOR`...) están *antes* que `ID` — si no, `if` matchearía como identificador.
- **Reglas del parser** (parte de arriba, en minúsculas): definen la *gramática* — cómo se combinan los tokens en estructuras válidas. La regla raíz es `programa : (instruccion | funcion)* EOF`. Cada alternativa de `instruccion` tiene una etiqueta `#NombreAlgo` (ej. `#InstrFor`, `#InstrBreak`) que hace que ANTLR genere una clase de contexto específica para esa alternativa — así en Java se puede distinguir "esto es un for" de "esto es un if" sin parsear texto a mano.

De este único archivo, el plugin de Maven (`antlr4-maven-plugin`, configurado en `pom.xml`) genera automáticamente 6 archivos Java cada vez que se compila: `MiniLenguajeLexer.java`, `MiniLenguajeParser.java`, `MiniLenguajeListener.java`/`MiniLenguajeBaseListener.java`, `MiniLenguajeVisitor.java`/`MiniLenguajeBaseVisitor.java`. **Nunca se editan a mano** — se pisan en cada `mvn compile`.

### Capa 1 — Léxico y Sintáctico: se disparan desde `App.java`

```java
CharStream input = CharStreams.fromFileName(archivo);
MiniLenguajeLexer lexer = new MiniLenguajeLexer(input);
CommonTokenStream tokens = new CommonTokenStream(lexer);
MiniLenguajeParser parser = new MiniLenguajeParser(tokens);
ParseTree tree = parser.programa();
```

- `MiniLenguajeLexer` transforma el `char` por `char` en tokens (`ID`, `NUMERO`, `MAS`, etc.), aplicando las reglas léxicas del `.g4`.
- `MiniLenguajeErrorListener` (la única clase escrita a mano para esta capa) reemplaza el listener default de ANTLR — así los errores léxicos y sintácticos salen con formato propio ("Error LÉXICO en línea X:Y - ..."), y se agrega **dos veces**: una al lexer con `"LÉXICO"` y otra al parser con `"SINTÁCTICO"`, para saber en qué fase pasó el error.
- `MiniLenguajeParser` arma el *parse tree* llamando a `parser.programa()`, que dispara reglas recursivamente (`instruccion` → `expresion` → `atomo`, etc.) según la gramática.
- Si `parser.getNumberOfSyntaxErrors() > 0`, `App.java` corta ahí — no tiene sentido seguir con AST/semántico si el programa ni siquiera es sintácticamente válido.

### Capa 2 — El AST propio: `NodoAST.java` + subclases + `ASTBuilder.java`

Acá está la decisión de diseño más importante del proyecto: el *parse tree* de ANTLR es genérico y verboso (tiene un nodo por cada regla gramatical, incluso las que no aportan info semántica). Por eso se construye un **AST propio**, más liviano y pensado para las fases siguientes.

`NodoAST` es la clase abstracta base (`linea`, `columna`, y el método `toString(prefijo)` para imprimir el árbol con indentación). De ahí cuelgan dos familias:

- **Nodos-sentencia** (representan una instrucción): `ProgramaNodo`, `FuncionNodo`, `DeclaracionVariableNodo`, `AsignacionNodo`, `ReturnNodo`, `IfNodo`, `WhileNodo`, `ForNodo`, `BreakNodo`, `ContinueNodo`, y los de array (`DeclaracionArrayNodo`, `AsignacionArrayNodo`).
- **Nodos-expresión**: `ExpresionNodo` (genérico: una `etiqueta` — operador o literal — y una lista de `hijos`), y dos subclases especiales que extienden `ExpresionNodo` porque necesitan datos extra: `AccesoArrayNodo` (guarda `nombreArray` + `indice`) y `LlamadaNodo` (guarda `nombreFuncion`, y reusa `hijos` para los argumentos).

`ASTBuilder` es un `Visitor` (patrón Visitor de ANTLR: `extends MiniLenguajeBaseVisitor<NodoAST>`) que recorre el parse tree y por cada nodo del parser devuelve el nodo equivalente del AST propio. Por ejemplo `visitInstrFor(ctx)` lee `ctx.forInit()`, `ctx.expresion()`, `ctx.forUpdate()`, `ctx.bloque()` del contexto generado por ANTLR y arma un `ForNodo`. El caso más delicado es `construirExpresionRec`, que resuelve las expresiones por **forma** (cuántos hijos tiene el contexto y de qué tipo) en vez de por regla, porque la gramática de expresiones usa alternativas etiquetadas de precedencia (`expresion OR expresion`, `expresion AND expresion`, etc.) que todas caen en el mismo `ExpresionContext`.

### Capa 3 — Semántico: `AnalizadorSemantico.java` + `TablaDeSimbolos.java`

Acá el compilador deja de mirar "¿está bien escrito?" y empieza a mirar "¿tiene sentido?". Dos piezas:

**`TablaDeSimbolos`** — una pila (`Deque<Map<String, Simbolo>>`) de ámbitos. `entrarAmbito()`/`salirAmbito()` empujan/sacan un mapa nuevo; `buscar(nombre)` recorre la pila de adentro hacia afuera (así una variable local tapa a una global con el mismo nombre). Cada `Simbolo` guarda nombre, tipo, categoría (`variable`/`funcion`/`parametro`), si fue usado (para warnings), y dos pares de campos opcionales agregados sobre la marcha: `esArray`/`tamanioArray` para arrays, y `tiposParametros` para funciones (así se puede validar una llamada sin tener que volver a mirar el AST de la función).

**`AnalizadorSemantico`** recorre el AST con `analizarSentenciaEnFuncion(fun, nodo)`, que es básicamente una cadena larga de `if (nodo instanceof X)`. Puntos clave:

- Cada bloque (`if`, `while`, `for`) hace `tabla.entrarAmbito()` antes de analizar su cuerpo y `tabla.salirAmbito()` después — así una variable declarada adentro de un `if` no existe afuera.
- `inferirTipoExpresion(expr)` es el corazón: recorre una `ExpresionNodo` recursivamente y devuelve su tipo (`"int"`, `"double"`, `"bool"`, `"error"`...). Tiene casos especiales *antes* del caso genérico para `LlamadaNodo` y `AccesoArrayNodo` (si no estuvieran antes, una llamada sin argumentos se confundiría con un identificador suelto).
- `inferirTipoLlamada` valida existencia de la función, cantidad de argumentos, y tipo de cada argumento uno por uno contra `tiposParametros`.
- `profundidadLoop` es un contador simple (no una pila) que sube al entrar a un `while`/`for` y baja al salir — sirve para rechazar `break`/`continue` fuera de un bucle sin tener que pasar un parámetro extra por toda la recursión.
- Al final, `generarWarningsNoUsadas()` recorre todos los símbolos de la tabla y marca como warning los que nunca se usaron.

### Capa 4 — Generación de código intermedio: `TACGenerator.java`

Traduce el AST a **TAC** (Three Address Code / código de tres direcciones): instrucciones simples tipo `t0 = a + b`, `if t0 goto L1`, `goto L2`, cada una con a lo sumo un operador. Se generan como `List<String>` (no una clase de instrucción tipada — por eso `InstruccionTAC.java` existe pero no se usa, es una idea que se abandonó en el camino).

- `generarSentencia(nodo)` es el equivalente TAC de `analizarSentenciaEnFuncion`: una cadena de `if (nodo instanceof X)`.
- `generarExpresion(expr)` devuelve *dónde quedó guardado* el resultado de una expresión — un literal, una variable, o un temporal nuevo (`t0`, `t1`, ...) si hubo que calcular algo. Se llama recursivamente: para `a + b`, primero resuelve `a` y `b` (cada uno puede ser una llamada, un acceso a array, u otra expresión), y después emite `tN = izq + der`.
- `if`/`while`/`for` se traducen a saltos (`goto`) y etiquetas (`L0`, `L1`...) generadas con `nuevaLabel()`. El `for` es el más elaborado: tiene 4 labels (inicio, cuerpo, actualización, fin) en vez de los 3 del `while`, porque `continue` en un `for` tiene que pasar por la actualización antes de volver a chequear la condición.
- `loopLabels` es una pila de `String[2]` (`{continueLabel, breakLabel}`) — cada `while`/`for` apila sus labels al entrar y los saca al salir, así `break`/`continue` siempre saltan al bucle *más interno* que los contiene, sin importar cuántos niveles de anidamiento haya.
- Las llamadas a función generan el esquema clásico de la materia: un `param x` por cada argumento (evaluados de izquierda a derecha) y un `t = call nombreFuncion, cantidadDeArgumentos` al final.

### Capa 5 — Optimización: adentro de `TACGenerator` (método `optimizar`)

Trabaja sobre el `List<String>` ya generado, con expresiones regulares (no sobre el AST). Tres pasadas encadenadas:

1. `propagarYFoldearConstantes`: si `t0 = 3` y después aparece `t0` en otra línea, lo reemplaza por `3` (propagación), y si una línea queda como `3 + 5` la resuelve a `8` (constant folding).
2. `eliminarTempsMuertos`: si un temporal nunca se lee después de ser asignado, borra esa línea (dead code elimination).

> Nota: existe además una clase `TACOptimizer.java` con la misma idea implementada de forma más prolija — pero **no la usa nadie**. `App.java` llama a `TACGenerator.generarOptimizado()`, que tiene su propia implementación interna. Es código muerto duplicado, herencia de una refactorización a medio hacer.

### Capa 6 — Salida: `App.java`

Orquesta todo lo anterior en orden, imprime cada fase por consola con colores ANSI (verde=éxito, amarillo=warning, rojo=error), y guarda el TAC y el TAC optimizado en `target/tac.txt` y `target/tac_opt.txt`.

## 3. Ejemplo de punta a punta

Para seguir el hilo con un caso concreto: `for (int i = 0; i < 10; i = i + 1) { suma = suma + i; }`

1. **Lexer**: produce tokens `FOR ( TIPO ID = NUMERO ; ID < NUMERO ; ID = ID + NUMERO ) { ID = ID + ID ; }`.
2. **Parser**: arma un `InstrForContext` con sub-contextos `forInit`, `expresion` (condición), `forUpdate`, `bloque`.
3. **ASTBuilder.visitInstrFor**: arma un `ForNodo` con `inicializacion = DeclaracionVariableNodo(i, 0)`, `condicion = ExpresionNodo("<", [i, 10])`, `actualizacion = AsignacionNodo(i, i+1)`, `cuerpo = [AsignacionNodo(suma, suma+i)]`.
4. **AnalizadorSemantico**: entra a un ámbito nuevo, declara `i` como `int`, valida que la condición sea `bool` (el resultado de `<` siempre lo es), sube `profundidadLoop`, analiza el cuerpo, valida la actualización.
5. **TACGenerator**: genera `i = 0`, después `L0:`, `t0 = i < 10`, `if t0 goto L1`, `goto L2`, `L1:` (cuerpo: `t1 = suma + i`, `suma = t1`), `L2:` (actualización: `t2 = i + 1`, `i = t2`), `goto L0`, `L3:` (fin).

## 4. Chequeo final contra la consigna

| Requisito | Estado |
|---|---|
| Léxico (tokens, errores, tabla) | ✅ |
| Sintáctico (parser, AST, errores, visualización) | ✅ |
| Semántico (ámbitos, tipos, errores/warnings distinguidos) | ✅ |
| TAC (aritmética/lógica, if-else, bucles, llamadas+retorno) | ✅ |
| ≥3 optimizaciones | ✅ (propagación de constantes, constant folding, dead code elimination) |
| Salidas con colores + archivos | ✅ |
| Subconjunto de C++ completo (tipos, control, funciones, arrays extra) | ✅ |
| Java + ANTLR4 | ✅ |
| Repositorio con código, gramática, ejemplos, URL | ✅ (código y ejemplos sí; falta confirmar que el repo esté en **público** en GitHub) |
| Informe Técnico en PDF | ✅ |
| Manual de Usuario | ✅ |
