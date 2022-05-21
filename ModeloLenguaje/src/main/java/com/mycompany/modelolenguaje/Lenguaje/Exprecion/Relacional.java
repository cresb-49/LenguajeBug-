package com.mycompany.modelolenguaje.Lenguaje.Exprecion;

import com.mycompany.modelolenguaje.Lenguaje.Abstracto.Exprecion;
import com.mycompany.modelolenguaje.Lenguaje.Abstracto.Retorno;
import com.mycompany.modelolenguaje.Lenguaje.Almacenamiento.Scope;

/**
 *
 * @author carlo
 */
public class Relacional extends Exprecion {

    public enum OpcionRelacional {IGUAL,DIFERENTE,MENOR,MAYOR,MENOR_IGUAL,MAYOR_IGUAL,INCERTEZA,}
    public String[] OpcionOperacionString ={"==","!=","<",">","<=",">=","~"};
    private Exprecion izquierda;
    private Exprecion derecha;
    private int tipo;

    public Relacional(Exprecion izquierda, Exprecion derecha, int tipo, int linea, int columna) {
        super(linea, columna);
        this.izquierda = izquierda;
        this.derecha = derecha;
        this.tipo = tipo;
    }
    
    @Override
    public Object ejecutar(Scope scope) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Retorno graficar(Scope scope) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
