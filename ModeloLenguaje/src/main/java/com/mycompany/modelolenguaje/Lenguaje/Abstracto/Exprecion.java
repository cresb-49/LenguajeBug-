/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modelolenguaje.Lenguaje.Abstracto;

import com.mycompany.modelolenguaje.Lenguaje.Almacenamiento.Scope;

/**
 *
 * @author carlo
 */
public abstract class Exprecion {
    public int linea;
    public int columna;
    
    public Exprecion(int linea,int columna){
        this.linea = linea;
        this.columna = columna;
    }
    
    abstract public Object ejecutar(Scope scope);
    abstract public Retorno graficar(Scope scope);
}
