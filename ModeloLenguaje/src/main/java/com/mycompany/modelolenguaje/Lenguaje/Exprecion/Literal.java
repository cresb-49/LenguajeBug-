/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modelolenguaje.Lenguaje.Exprecion;

import com.mycompany.modelolenguaje.Lenguaje.Abstracto.Exprecion;
import com.mycompany.modelolenguaje.Lenguaje.Abstracto.Retorno;
import com.mycompany.modelolenguaje.Lenguaje.Almacenamiento.Scope;

/**
 *
 * @author carlo
 */
public class Literal extends Exprecion{
    private Object valor;
    private int tipo;

    public Literal(Object valor, int tipo, int linea, int columna) {
        super(linea, columna);
        this.valor = valor;
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
