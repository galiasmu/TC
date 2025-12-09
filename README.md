
---

# Compilador TC – Lenguaje tipo C++

**Proyecto realizado en Java + Maven + ANTLR4**
**Autor:** Gali Asmuzi
**Materia:** Técnicas de Compilación

---

## Descripción General

Este proyecto implementa un **compilador completo** para un subconjunto del lenguaje C++, cumpliendo todos los requisitos del Trabajo Final de la materia.

Incluye todas las fases principales de un compilador:

* ✔ Análisis Léxico
* ✔ Análisis Sintáctico
* ✔ Construcción de AST
* ✔ Análisis Semántico
* ✔ Tabla de Símbolos
* ✔ Generación de Código de Tres Direcciones (TAC)
* ✔ Optimizaciones clásicas
* ✔ Reporte de errores y warnings con colores ANSI
* ✔ Exportación a archivos TAC (original y optimizado)

---

# Subconjunto de C++ Implementado

### ✔ Tipos de datos

* `int`
* `double`
* `char`
* `bool`
* `void`

### ✔ Estructuras de control

* `if` / `if-else`
* `while`
* `for`
* `break`, `continue`

### ✔ Elementos del lenguaje

* Declaración de variables
* Declaración de funciones
* Parámetros y argumentos
* Expresiones aritméticas y lógicas
* Asignaciones
* Llamadas a funciones
* `return`
* Bloques `{ ... }`

---

# 📁 Estructura del Proyecto

```
src/
├── main/
│   ├── java/com/compilador/
│   │   ├── App.java
│   │   ├── MiniLenguajeErrorListener.java
│   │   ├── ASTBuilder.java
│   │   ├── AnalizadorSemantico.java
│   │   ├── TACGenerator.java
│   │   ├── Optimizer.java
│   │   ├── nodosAST/... (clases de nodos)
│   │   └── Archivos ANTLR generados automáticamente
│   └── antlr4/com/compilador/
│       └── MiniLenguaje.g4
└── input/
    ├── input.txt
    └── input_optim.txt
```

---

# Requerimientos

* **Java 11+**
* **Maven 3+**
* ANTLR4 integrado mediante plugin de Maven
  *(no se necesita instalar ANTLR manualmente)*

---

# Compilar el proyecto

### Compilar todo

```bash
mvn clean compile
```

Esto realiza:

* Limpieza de archivos previos
* Generación automática del Lexer/Parser desde `MiniLenguaje.g4`
* Compilación completa del proyecto

---

# ▶️ Ejecutar el compilador

### Ejecutar con el archivo por defecto

```bash
mvn exec:java -Dexec.mainClass="com.compilador.App"
```

### Ejecutar con archivo propio

```bash
mvn exec:java -Dexec.mainClass="com.compilador.App" -Dexec.args="src/main/input/input_optim.txt"
```

---

# 🎨 Colores en consola

* 🟩 **Verde:** éxito, ejecución correcta
* 🟨 **Amarillo:** warnings
* 🟥 **Rojo:** errores

Implementado mediante secuencias ANSI.

---

#  Fases Implementadas

## ✔ 1. Análisis Léxico

* Tabla completa de tokens
* Errores léxicos con línea y columna
* Listener personalizado

## ✔ 2. Análisis Sintáctico (Parser)

* Construcción del parse tree
* Impresión con `toStringTree`
* Manejo de errores sintácticos personalizados

## ✔ 3. Árbol de Sintaxis Abstracta (AST)

* Visitor propio
* Nodos para:

  * Expresiones
  * Sentencias
  * If / Else
  * While
  * Declaraciones
  * Funciones

## ✔ 4. Análisis Semántico

* Tabla de símbolos con manejo de alcances
* Variables duplicadas
* Variables no declaradas
* Chequeo básico de tipos
* Parámetros y argumentos
* Variables no usadas (warning)

## ✔ 5. TAC – Código de Tres Direcciones

Ejemplo de TAC generado:

```
t0 = x + 1
if t0 goto L1
goto L2
```

Se genera TAC para:

* Expresiones
* Asignaciones
* If / Else
* While
* Return

## ✔ 6. Optimizaciones (Optimizer.java)

* **Constant Folding:**
  `3 + 5 → 8`
* **Constant Propagation:**
  `t3 = 6; x = t3 → x = 6`
* **Dead Code Elimination**
* **Simplificación de expresiones:**
  `x + 0 → x`
  `1 * z → z`

Salida generada en:

* `target/tac.txt` — TAC original
* `target/tac_opt.txt` — TAC optimizado

---

# Ejemplo de Ejecución

### Código de entrada
Se pueden utilizar cualquiera de los inputs, el ejemplo_correcto no deberia generar ningun error y ejemplo_multiples_errores deberia devolver errores.

# Instalación Rápida

### 1️⃣ Clonar el repositorio

```bash
git clone https://github.com/usuario/CompiladorTC2025.git
cd CompiladorTC2025/demo
```

### 2️⃣ Compilar

```bash
mvn clean compile
```

### 3️⃣ Ejecutar el compilador

```bash
mvn exec:java -Dexec.mainClass="com.compilador.App"
```

### 4️⃣ Ejecutar con archivo específico

```bash
mvn exec:java -Dexec.mainClass="com.compilador.App" -Dexec.args="ruta/del/archivo.c"
```
