package com.compilador;

import java.io.IOException;
import java.util.List;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.charset.StandardCharsets;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

public class App {

    // Colores ANSI para consola
    private static final String ANSI_RESET  = "\u001B[0m";
    private static final String ANSI_RED    = "\u001B[31m";
    private static final String ANSI_GREEN  = "\u001B[32m";
    private static final String ANSI_YELLOW = "\u001B[33m";

    public static void main(String[] args) {

        String archivoEntrada = "src/main/input/ejemplo_correcto.txt";

        // Si pasan un archivo por parámetro, usar ese
        if (args.length > 0) {
            archivoEntrada = args[0];
        }

        try {
            // 1) Crear el flujo de caracteres desde el archivo
            CharStream input = CharStreams.fromFileName(archivoEntrada);

            // 2) Crear el lexer
            MiniLenguajeLexer lexer = new MiniLenguajeLexer(input);

            // 3) Agregar listener de errores LÉXICOS
            lexer.removeErrorListeners(); // Saco el default de ANTLR
            lexer.addErrorListener(new MiniLenguajeErrorListener("LÉXICO"));

            // 4) Crear el stream de tokens
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // 5) Llenar el buffer de tokens
            tokens.fill();

            // 6) Imprimir TABLA DE TOKENS
            System.out.println("===== TABLA DE TOKENS =====");
            System.out.printf("%-5s %-20s %-20s %-10s %-10s%n",
                    "#", "TOKEN", "LEXEMA", "LINEA", "COLUMNA");
            System.out.println("--------------------------------------------------------------");

            int index = 0;
            for (Token t : tokens.getTokens()) {
                if (t.getType() == Token.EOF) {
                    continue; // no muestro EOF
                }

                String tokenName = MiniLenguajeLexer.VOCABULARY.getSymbolicName(t.getType());
                String lexema = t.getText();
                int linea = t.getLine();
                int columna = t.getCharPositionInLine();

                System.out.printf("%-5d %-20s %-20s %-10d %-10d%n",
                        index++, tokenName, lexema, linea, columna);
            }

            // ================================
            //  Análisis Sintáctico
            // ================================

            // 7) Crear parser con el mismo stream de tokens
            MiniLenguajeParser parser = new MiniLenguajeParser(tokens);

            // 8) Agregar listener de errores SINTÁCTICOS
            parser.removeErrorListeners(); // saco el default
            parser.addErrorListener(new MiniLenguajeErrorListener("SINTÁCTICO"));

            // 9) Invocar la regla inicial de tu gramática
            ParseTree tree = parser.programa();

            // 10) Mostrar el árbol sintáctico en formato LISP-like
            System.out.println("\n===== ÁRBOL SINTÁCTICO (toStringTree) =====");
            System.out.println(tree.toStringTree(parser));

            // 11) Construir el AST propio con el visitor
            ASTBuilder astBuilder = new ASTBuilder();
            NodoAST ast = astBuilder.visit(tree);

            System.out.println("\n===== AST (formato simplificado) =====");
            System.out.println(ast);

            // 12) Análisis semántico
            AnalizadorSemantico sem = new AnalizadorSemantico();
            sem.analizar(ast);

            List<String> errores = sem.getErrores();
            List<String> warnings = sem.getWarnings();

            System.out.println();
            System.out.println("===== ERRORES SEMÁNTICOS =====");
            if (errores.isEmpty()) {
                System.out.println(ANSI_GREEN + "Sin errores semánticos." + ANSI_RESET);
            } else {
                for (String e : errores) {
                    System.out.println(ANSI_RED + e + ANSI_RESET);
                }
            }

            System.out.println();
            System.out.println("===== WARNINGS SEMÁNTICOS =====");
            if (warnings.isEmpty()) {
                System.out.println(ANSI_GREEN + "Sin warnings semánticos." + ANSI_RESET);
            } else {
                for (String w : warnings) {
                    System.out.println(ANSI_YELLOW + w + ANSI_RESET);
                }
            }

            // 13) Generación de código intermedio (TAC sin optimizar)
            System.out.println("\n===== TRES DIRECCIONES (TAC) =====");
            TACGenerator tacGen = new TACGenerator();
            List<String> tac = tacGen.generar(ast);
            tac.forEach(System.out::println);

            // Guardar TAC a archivo
            guardarEnArchivo("target/tac.txt", tac);

            // 14) Generación de TAC optimizado
            System.out.println("\n===== TRES DIRECCIONES (TAC OPTIMIZADO) =====");
            List<String> tacOpt = tacGen.generarOptimizado(ast);
            tacOpt.forEach(System.out::println);

            // Guardar TAC optimizado a archivo
            guardarEnArchivo("target/tac_opt.txt", tacOpt);

        } catch (IOException e) {
            System.err.println("Error al leer archivo: " + archivoEntrada);
            e.printStackTrace();
        }
    }

    // =================== UTILIDAD PARA ARCHIVOS DE SALIDA ===================

    private static void guardarEnArchivo(String ruta, List<String> lineas) {
        try {
            if (Paths.get(ruta).getParent() != null) {
                Files.createDirectories(Paths.get(ruta).getParent());
            }
            Files.write(Paths.get(ruta), lineas, StandardCharsets.UTF_8);
            System.out.println(ANSI_GREEN + "Archivo generado: " + ruta + ANSI_RESET);
        } catch (IOException e) {
            System.err.println(ANSI_RED +
                    "No se pudo escribir el archivo " + ruta + ": " + e.getMessage()
                    + ANSI_RESET);
        }
    }
}
