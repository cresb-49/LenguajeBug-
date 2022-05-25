package com.mycompany.modelolenguaje.Lenguaje.Instrucciones;

import com.mycompany.modelolenguaje.Lenguaje.Abstracto.Instruccion;
import com.mycompany.modelolenguaje.Lenguaje.Almacenamiento.Scope;

public class Incerteza extends Instruccion{

    public double valor;

    /**
     * @param linea
     * @param columna
     * @param valor
     */
    public Incerteza(int linea, int columna, double valor) {
        super(linea, columna);
        this.valor = valor;
    }

    @Override
    public Object ejecutar(Scope scope) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void graficar(Scope scope) {
        // TODO Auto-generated method stub
    }

    @Override
    public void agregarInstruccion(Instruccion instruccion) {
        // TODO Auto-generated method stub
    }
    
}
