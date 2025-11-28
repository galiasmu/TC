package com.compilador;

import java.io.IOException;
import java.util.List;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

public class App 
{
    public static void main( String[] args )
    {
        // Por defecto usa el input del proyecto
        String archivoEntrada = "src/main/input/input.txt";

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

            System.out.println("\n===== ERRORES SEMÁNTICOS =====");
            if (sem.getErrores().isEmpty()) {
                System.out.println("Ninguno");
            } else {
                sem.getErrores().forEach(System.out::println);
            }

            System.out.println("\n===== WARNINGS SEMÁNTICOS =====");
            if (sem.getWarnings().isEmpty()) {
                System.out.println("Ninguno");
            } else {
                sem.getWarnings().forEach(System.out::println);
            }

            // 13) Generación de código intermedio (TAC)

            System.out.println("\n===== TRES DIRECCIONES (TAC) =====");
            TACGenerator tac = new TACGenerator();
            List<String> codigo = tac.generar(ast);
            codigo.forEach(System.out::println);



        } catch (IOException e) {
            System.err.println("Error al leer archivo: " + archivoEntrada);
            e.printStackTrace();
        }
    }
}
