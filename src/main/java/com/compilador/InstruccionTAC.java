package com.compilador;

public class InstruccionTAC {
    public final String op;

    public InstruccionTAC(String op) {
        this.op = op;
    }

    @Override
    public String toString() {
        return op;
    }
}
