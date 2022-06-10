package com.mycompany.modelolenguaje.Lenguaje.Instrucciones;

import com.mycompany.modelolenguaje.Lenguaje.Abstracto.Instruccion;
import com.mycompany.modelolenguaje.Lenguaje.Almacenamiento.Scope;

/**
 *
 * @author carlo
 */
public class Main extends Instruccion{
    private String archivo;
    private Sentencias sentencias;

    public Main(String archivo, Sentencias sentencias, int linea, int columna) {
        super(linea, columna);
        this.archivo = archivo;
        this.sentencias = sentencias;
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

    @Override
    public String toString() {
        return "Main{" + "archivo=" + archivo + '}';
    }
}
