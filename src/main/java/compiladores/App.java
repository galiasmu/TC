package compiladores;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(">>> Iniciando Compilador (TP1) <<<");

        // 1. ENTRADA:
        // Para probar rápido, usamos texto directo. 
        // Cuando compile bien, descomenta la línea de abajo para leer archivo.
        CharStream input = CharStreams.fromString("int a = 10; if(a>5) { a = a + 1; }");
        // CharStream input = CharStreams.fromFileName("input/programa.txt");

        // 2. LEXER: 
        // Fíjate que ahora se llama TP1Lexer (coincide con grammar TP1)
        TP1Lexer lexer = new TP1Lexer(input);
        
        // 3. TOKENS:
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        
        // 4. PARSER:
        // Ahora se llama TP1Parser
        TP1Parser parser = new TP1Parser(tokens);
                
        // 5. EJECUCIÓN:
        // "programa" es la regla inicial de tu TP1.g4
        ParseTree tree = parser.programa();
        
        // 6. SALIDA (LISP style tree):
        System.out.println("Árbol generado:");
        System.out.println(tree.toStringTree(parser));
    }
}