package com.mycompany.modelolenguaje.Gramatica;

/**
 * Token
 */
public class Token {
    public int linea;
    public int columna;
    public String lexema;
    public Object value;
    
    /**
     * @param linea
     * @param columna
     * @param lexema
     * @param value
     */
    public Token(int linea, int columna, String lexema, Object value) {
        this.linea = linea;
        this.columna = columna;
        this.lexema = lexema;
        this.value = value;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    
    @Override
    public String toString() {
        return "Token [columna=" + columna + ", linea=" + linea + ", lexema=" + lexema + ", value=" + value + "]";
    }    
}