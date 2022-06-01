package com.mycompany.modelolenguaje.Gramatica;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author carlo
 */
public class simbolosTerminalesBug {

    public static final String[] terminalNames = new String[]{
        "",
        "",
        "",
        "print",
        "import",
        "name-file",
        "incerteza",
        "int",
        "double",
        "boolean",
        "string",
        "char",
        "void",
        "+",
        "-",
        "*",
        "/",
        "%",
        "^",
        "-exp",
        ">",
        "<",
        ">=",
        "<=",
        "&&",
        "||",
        "|&",
        "!",
        "~",
        "==",
        "!=",
        "=",
        "++",
        "--",
        "(",
        ")",
        "[",
        "]",
        "{",
        "}",
        ";",
        ",",
        ".",
        ":",
        "ENTERO",
        "DECIMAL",
        "CADENA",
        "CARACTER",
        "true",
        "false",
        "INDENTIFICADOR",
        "for",
        "while",
        "if",
        "else",
        "return",
        "continue",
        "break"
    };

    static List<String> obtenerSimbolos(List<Integer> expected_tokens) {
        System.out.println("Valores del array expected_tokens -> " + expected_tokens.toString());
        List<String> resultados = new ArrayList<>();
        for (Integer entero : expected_tokens) {
            if (!(entero == 1 || entero == 0 || entero == 2)) {
                resultados.add(terminalNames[entero]);
            }
        }
        return resultados;
    }

}
