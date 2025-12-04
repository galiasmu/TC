package com.compilador;

import java.util.*;
import java.util.regex.*;

/**
 * Optimizador simple de código de tres direcciones (TAC).
 * Aplica:
 *  1) Propagación de constantes + constant folding
 *  2) Simplificación algebraica básica
 *  3) Eliminación de código muerto de temporales tN
 */
public class TACOptimizer {

    // ======= API pública =======

    public List<String> optimize(List<String> original) {
        List<String> tac = new ArrayList<>(original);

        tac = constantPropagationAndFolding(tac);   // 1)
        tac = simplifyExpressions(tac);            // 2)
        tac = deadCodeEliminationTemporaries(tac); // 3)

        return tac;
    }

}