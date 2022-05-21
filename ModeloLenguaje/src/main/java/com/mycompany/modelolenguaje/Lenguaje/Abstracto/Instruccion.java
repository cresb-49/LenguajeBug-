package com.mycompany.modelolenguaje.Lenguaje.Abstracto;

import com.mycompany.modelolenguaje.Lenguaje.Almacenamiento.Scope;

public abstract class Instruccion {
    public int linea;
    public int columna;

    public Instruccion(int linea,int columna){
        this.linea = linea;
        this.columna = columna;
    }

    abstract public Object ejecutar(Scope scope);
    abstract public void graficar(Scope scope);
    abstract public void agregarInstruccion(Instruccion instruccion);
}
