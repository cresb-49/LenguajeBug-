package com.mycompany.modelolenguaje.Lenguaje.Instrucciones;

import com.mycompany.modelolenguaje.Lenguaje.Abstracto.Exprecion;
import com.mycompany.modelolenguaje.Lenguaje.Abstracto.Instruccion;
import com.mycompany.modelolenguaje.Lenguaje.Almacenamiento.Scope;
import java.util.List;

/**
 *
 * @author carlo
 */
public class If extends Instruccion{
    private Exprecion condicion;
    private Sentencias codeTrue;
    private Sentencias codeFalse;

    public If(Exprecion condicion, Sentencias codeTrue, Sentencias codeFalse, int linea, int columna) {
        super(linea, columna);
        this.condicion = condicion;
        this.codeTrue = codeTrue;
        this.codeFalse = codeFalse;
    }

    @Override
    public Object ejecutar(Scope scope) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void graficar(Scope scope) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void agregarInstruccion(Instruccion instruccion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
