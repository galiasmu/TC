# 🔥 Compilador TC 2025 – Lenguaje tipo C++  
Proyecto realizado en **Java + Maven + ANTLR4**  
Autores: *[Nombres del equipo]*  
Materia: *Teoría de la Computación (TC)* – Año 2025

---

## 🧩 Descripción General

Este proyecto implementa un **compilador completo** para un subconjunto del lenguaje C++, cumpliendo con la consigna del Trabajo Final de TC 2025.

Incluye todas las fases principales de un compilador:

- ✔ **Análisis Léxico**
- ✔ **Análisis Sintáctico**
- ✔ **Árbol de Sintaxis Abstracta (AST)**
- ✔ **Análisis Semántico**
- ✔ **Tabla de Símbolos**
- ✔ **Generación de Código de Tres Direcciones (TAC)**
- ✔ **Optimizaciones (constant folding, dead code elimination, propagation)**
- ✔ **Coloreado de errores y warnings (ANSI)**
- ✔ **Salida a archivo del TAC y TAC optimizado**

---

# 🧠 Subconjunto de C++ Implementado

### ✔ **Tipos de datos**
- `int`
- `double`
- `char`
- `bool`
- `void` (para funciones)

### ✔ **Estructuras de Control**
- `if` / `if-else`
- `while`
- `for` (⚠ agregado en la gramática si corresponde)
- `break` y `continue` (⚠ si fueron implementados)

### ✔ **Elementos del lenguaje**
- Declaración de variables
- Declaración de funciones
- Parámetros y argumentos
- Expresiones aritméticas
- Expresiones lógicas
- Asignaciones
- Llamadas a funciones
- Retorno de valores (`return`)
- Bloques `{ ... }`

---

# 📁 **Estructura del Proyecto**

src/
├── main/
│ ├── java/com/compilador/
│ │ ├── App.java
│ │ ├── MiniLenguajeErrorListener.java
│ │ ├── ASTBuilder.java
│ │ ├── AnalizadorSemantico.java
│ │ ├── TACGenerator.java
│ │ ├── Optimizer.java
│ │ ├── nodosAST/... (clases de nodos)
│ │ └── Archivos ANTLR generados automáticamente
│ │
│ └── antlr4/com/compilador/
│ └── MiniLenguaje.g4 ← Gramática
│
└── input/
├── input.txt
└── input_optim.txt

yaml
Copy code

---

# ⚙️ **Requerimientos**

- **Java 11+**
- **Maven 3+**
- ANTLR4 integrado por plugin de Maven  
  *(no es necesario instalar ANTLR manualmente)*

---

# ▶️ **Compilar el proyecto**

```bash
mvn clean compile
Esto:

Limpia archivos previos

Genera Lexer/Parser desde .g4

Compila el proyecto completo

▶️ Ejecutar el compilador
Ejecutar con el archivo por defecto:

bash
Copy code
mvn exec:java -Dexec.mainClass="com.compilador.App"
Ejecutar con archivo propio:

bash
Copy code
mvn exec:java -Dexec.mainClass="com.compilador.App" -Dexec.args="src/main/input/input_optim.txt"
🎨 Colores en consola
Verde → éxito / sin errores

Amarillo → warnings

Rojo → errores

Implementado mediante secuencias ANSI.

🔍 Fases implementadas
✔ 1. Léxico
Tabla completa de tokens

Errores léxicos con línea y columna

Listener personalizado

✔ 2. Sintáctico (Parser)
Construcción de parse tree

Impresión con toStringTree

Errores sintácticos custom

✔ 3. AST
Construido con visitor propio

Nodos para:

Expresiones

Sentencias

If/Else

While

Declaraciones

Funciones

✔ 4. Análisis Semántico
Incluye:

Tabla de símbolos por alcance (global/local)

Variables duplicadas

Variables no declaradas

Chequeo básico de tipos

Parámetros y argumentos

Variables no usadas (warning)

✔ 5. TAC – Tres Direcciones
Genera instrucciones de la forma:

cpp
Copy code
t0 = x + 1
if t0 goto L1
goto L2
Se generan instrucciones para:

Expresiones

Asignaciones

If / Else

While

Return

✔ 6. Optimizaciones
Implementadas en Optimizer.java:

Constant Folding
t0 = 3 + 5 → 8

Constant Propagation
t3 = 6; x = t3 → x = 6

Dead Code Elimination
Eliminación de temporales innecesarios

Simplificación de expresiones
x + 0 → x, 1 * z → z, etc.

Salida generada en:

bash
Copy code
target/tac_opt.txt
📤 Archivos generados
Al ejecutar, se generan:

bash
Copy code
target/tac.txt        ← código de tres direcciones original
target/tac_opt.txt    ← código optimizado
🧪 Ejemplos de ejecución
✔ Archivo de entrada (ejemplo optimización)
c
Copy code
int y;
y = 3 + 5;
t = 1 * y;
✔ TAC generado
ini
Copy code
t0 = 3 + 5
y = t0
t1 = 1 * y
t = t1
✔ TAC optimizado
ini
Copy code
y = 8
t = y
🧰 Instalación rápida (Manual de Usuario)
1️⃣ Clonar el repositorio
bash
Copy code
git clone https://github.com/usuario/CompiladorTC2025.git
cd CompiladorTC2025/demo
2️⃣ Compilar
bash
Copy code
mvn clean compile
3️⃣ Ejecutar el compilador
bash
Copy code
mvn exec:java -Dexec.mainClass="com.compilador.App"
4️⃣ Ejecutar con archivo específico
bash
Copy code
mvn exec:java -Dexec.mainClass="com.compilador.App" -Dexec.args="ruta/del/archivo.c"
📘 Interpretación de errores
❌ Error léxico
csharp
Copy code
[LEXICO] Caracter inesperado '@' en línea 4, columna 12
❌ Error semántico
vbnet
Copy code
ERROR: variable 'x' usada sin declarar (línea 12)
⚠ Warning
vbnet
Copy code
WARNING: variable 'cond' declarada pero nunca usada
📄 .gitattributes
gitattributes
Copy code
* text=auto
*.g4 text eol=lf
*.java text eol=lf
👨‍🏫 Notas finales
El compilador cumple todos los puntos de la consigna:

✔ Análisis léxico
✔ Análisis sintáctico
✔ AST
✔ Semántico
✔ TAC
✔ Optimizaciones
✔ Archivos de salida
✔ Colores
✔ Ejemplos
✔ Documentación
✔ Manual de usuario

🧑‍🔧 Autores
Nombre Asmuzi

yaml
Copy code
