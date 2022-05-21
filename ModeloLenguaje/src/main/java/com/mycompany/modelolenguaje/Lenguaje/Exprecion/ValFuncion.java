package com.mycompany.modelolenguaje.Lenguaje.Exprecion;

import com.mycompany.modelolenguaje.Lenguaje.Abstracto.Exprecion;
import com.mycompany.modelolenguaje.Lenguaje.Abstracto.Retorno;
import com.mycompany.modelolenguaje.Lenguaje.Almacenamiento.Scope;
import java.util.List;

/**
 *
 * @author carlo
 */
public class ValFuncion extends Exprecion{
    private String id;
    private List<Exprecion> parametros;
    
    public ValFuncion(String id, List<Exprecion> parametros, int linea, int columna) {
        super(linea, columna);
        this.id = id;
        this.parametros = parametros;
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
