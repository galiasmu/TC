package com.compilador;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.RecognitionException;

public class MiniLenguajeErrorListener extends BaseErrorListener {

    private final String fase;

    public MiniLenguajeErrorListener(String fase) {
        this.fase = fase;
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line,
                            int charPositionInLine,
                            String msg,
                            RecognitionException e) {

        System.err.printf("Error %s en línea %d:%d - %s%n",
                fase, line, charPositionInLine, msg);
    }
}
