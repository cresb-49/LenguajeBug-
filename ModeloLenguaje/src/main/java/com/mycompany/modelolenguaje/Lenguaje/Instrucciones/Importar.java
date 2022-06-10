package com.mycompany.modelolenguaje.Lenguaje.Instrucciones;

import com.mycompany.modelolenguaje.Lenguaje.Abstracto.Instruccion;
import com.mycompany.modelolenguaje.Lenguaje.Almacenamiento.Scope;

/**
 *
 * @author carlo
 */
public class Importar extends Instruccion{
    private String id;

    public Importar(String id,int linea, int columna) {
        super(linea, columna);
        this.id = id;
    }

    public String getId() {
        return id;
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
        return "Importar{" + "id=" + id + '}';
    }
    
}
