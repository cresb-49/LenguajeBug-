package com.mycompany.modelolenguaje.Lenguaje.TiposYCast;

import com.mycompany.modelolenguaje.Lenguaje.Abstracto.Retorno.Tipo;

/**
 *
 * @author carlo
 */
public class CasteoImplicito {

    public static Object CAST_IMPLICITO(int tipoVar, int tipoAsig, Object valor) {
        switch (Tipo.values()[tipoVar]) {
            case DOUBLE:
                if (tipoAsig == Tipo.CHAR.ordinal()) {
                    //return GET_CHAR_NUMERIC(String.valueOf(valor));
                } else if (tipoAsig == Tipo.BOOLEAN.ordinal()) {
                    //return GET_BOOLEAN_NUMERIC(Boolean.valueOf(s).valueOf(valor));
                } else if (tipoAsig == Tipo.INT.ordinal()) {
                    return valor;
                } else if (tipoAsig == Tipo.DOUBLE.ordinal()) {
                    return valor;
                }
                break;
            case BOOLEAN:
                return valor;
            case STRING:
                if (tipoAsig == Tipo.CHAR.ordinal()) {
                    return String.valueOf(valor);
                } else if (tipoAsig == Tipo.BOOLEAN.ordinal()) {
                    //return String(GET_BOOLEAN_NUMERIC(valor));
                } else if (tipoAsig == Tipo.INT.ordinal()) {
                    return String.valueOf(valor);
                } else if (tipoAsig == Tipo.DOUBLE.ordinal()) {
                    return String.valueOf(valor);
                }
                return valor;
            case INT:
                if (tipoAsig == Tipo.CHAR.ordinal()) {
                    //return GET_CHAR_NUMERIC(valor);
                } else if (tipoAsig == Tipo.BOOLEAN.ordinal()) {
                    //return GET_BOOLEAN_NUMERIC(valor);
                } else if (tipoAsig == Tipo.INT.ordinal()) {
                    return valor;
                } else if (tipoAsig == Tipo.DOUBLE.ordinal()) {
                    //return Math.trunc(valor);
                }
                break;
            case CHAR:
                if (tipoAsig == Tipo.INT.ordinal()) {
                    //return String.fromCharCode(valor);
                }
                return valor;
        }
        return null;
    }

    public static int GET_BOOLEAN_NUMERIC(boolean state) {
        if (state) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int GET_CHAR_NUMERIC(String caracter) {
        return caracter.codePointAt(0);
    }
}
