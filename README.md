```markdown
# Compilador - Trabajo Final TC 2025  
Proyecto en Java + Maven + ANTLR4

Este proyecto implementa un compilador para un lenguaje simple, siguiendo la consigna del Trabajo Final de Teoría de la Computación (TC).  

Incluye:
- ✔ Análisis Léxico  
- ✔ Análisis Sintáctico  
- ✔ Manejo de errores léxicos y sintácticos  
- ⏳ Construcción del AST (próximo paso)  
- ⏳ Análisis Semántico  
- ⏳ Generación de Código (si corresponde)
---
## 📁 Estructura del Proyecto
```
src/
├── main/
│   ├── java/
│   │   └── com/compilador/
│   │       ├── App.java
│   │       ├── MiniLenguajeErrorListener.java
│   │       ├── MiniLenguajeLexer.java          (generado automáticamente)
│   │       ├── MiniLenguajeParser.java         (generado automáticamente)
│   │       ├── MiniLenguajeBaseVisitor.java    (generado automáticamente)
│   │       └── ... demás archivos generados
│   │
│   └── antlr4/
│       └── com/compilador/
│           └── MiniLenguaje.g4     ← tu gramática
│
└── test/ (no se usa de momento)

```

---

## 🛠 Requerimientos

- Java 11+  
- Maven 3+  
- ANTLR 4.9.3 (vía Maven plugin)  

---

## ▶️ Compilar el Proyecto

El proyecto usa el plugin ANTLR para generar automáticamente el Lexer y Parser.

Ejecutar:

```bash
mvn clean compile
````

Esto:

* Limpia código previo
* Genera los archivos ANTLR (`MiniLenguajeLexer.java`, `MiniLenguajeParser.java`, etc.)
* Compila todo el proyecto

---

## ▶️ Ejecutar el Compilador

Para correr el programa principal:

```bash
mvn exec:java -Dexec.mainClass="com.compilador.App"
```

El archivo de entrada se toma por defecto de:

```
src/main/input/input.txt
```

---

## 📄 ¿Qué hace actualmente el proyecto?

### ✔ Análisis Léxico

* Genera la tabla de tokens
* Reporta errores léxicos
* Usa un `ErrorListener` personalizado

### ✔ Análisis Sintáctico

* Genera el árbol de análisis sintáctico (parse tree)
* Reporta errores sintácticos
* Muestra el `toStringTree()` del parser

### ⏳ Por implementar

* AST propio
* Análisis Semántico
* Tabla de símbolos
* Chequeo de tipos
* Generación de código intermedio

---

## 🧹 Archivos ignorados

Los archivos generados por ANTLR **NO deben subirse al repo**.

Ver `.gitignore` incluido, que ignora:

* `/target`
* `.antlr/`
* `*.tokens`
* `*.interp`
* Archivos generados automáticamente por ANTLR

---

## 💡 Consejos

* **Nunca edites los archivos generados por ANTLR**

* Solo editá:

  * Tu gramática (`MiniLenguaje.g4`)
  * Tu código en `App.java`
  * Listeners/visitors hechos por vos

* Si ANTLR genera archivos duplicados, asegurate de:

  * Desactivar extensión de ANTLR en VS Code
  * Mantener solo una versión de la gramática
  * Limpiar y compilar con Maven

---

## 👨‍🏫 Contacto

Este proyecto sigue la consigna del trabajo final de la cátedra Teoría de la Computación (TC).

```

---

# ⚙️ `.gitattributes` (evita problemas de fin de línea en Windows/Linux)

Creá un archivo:

```

Compilador2025/demo/.gitattributes

````

Contenido:

```gitattributes
# Normalizar saltos de línea
* text=auto

# Asegurar que los archivos .g4 usen LF
*.g4 text eol=lf

# Asegurar que los archivos Java usen LF
*.java text eol=lf
````

