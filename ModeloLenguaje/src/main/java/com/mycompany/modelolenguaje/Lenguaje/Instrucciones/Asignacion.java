package com.mycompany.modelolenguaje.Lenguaje.Instrucciones;

import com.mycompany.modelolenguaje.Lenguaje.Abstracto.Exprecion;
import com.mycompany.modelolenguaje.Lenguaje.Abstracto.Instruccion;
import com.mycompany.modelolenguaje.Lenguaje.Almacenamiento.Scope;

/**
 *
 * @author carlo
 */
public class Asignacion extends Instruccion{
    public String id;
    public Exprecion valor;
    
    public Asignacion(String id,Exprecion valor,int linea,int columna) {
        super(linea, columna);
        this.id = id;
        this.valor = valor;
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
    public String toString() {
        return "Asignacion{linea="+this.linea+", columna=" +this.columna+ ", id=" + id + ", valor=" + valor + '}';
    }

    @Override
    public void agregarInstruccion(Instruccion instruccion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
