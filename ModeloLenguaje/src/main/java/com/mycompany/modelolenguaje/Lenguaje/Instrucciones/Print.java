package com.mycompany.modelolenguaje.Lenguaje.Instrucciones;

import com.mycompany.modelolenguaje.Lenguaje.Abstracto.Exprecion;
import com.mycompany.modelolenguaje.Lenguaje.Abstracto.Instruccion;
import com.mycompany.modelolenguaje.Lenguaje.Almacenamiento.Scope;
import java.util.List;

/**
 *
 * @author carlo
 */
public class Print extends Instruccion{
    private Exprecion valor;
    private List<Exprecion> parametros;
    private Object consola;

    public Print(Exprecion valor, List<Exprecion> parametros, Object consola, int linea, int columna) {
        super(linea, columna);
        this.valor = valor;
        this.parametros = parametros;
        this.consola = consola;
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
