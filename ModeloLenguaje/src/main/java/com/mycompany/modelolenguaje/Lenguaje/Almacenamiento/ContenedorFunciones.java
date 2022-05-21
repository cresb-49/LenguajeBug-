package com.mycompany.modelolenguaje.Lenguaje.Almacenamiento;

import com.mycompany.modelolenguaje.Lenguaje.Instrucciones.Funcion;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author carlo
 */
public class ContenedorFunciones {
    private List<Map<String,Funcion>> funciones;
    public ContenedorFunciones(){
        this.funciones = new ArrayList<>();
        this.funciones.add(new HashMap<>());
    }
    
    public boolean has(String id){
        for (Map<String, Funcion> funcione : funciones) {
            if(funcione.containsKey(id)){
                return true;
            }
        }
        return false;
    }
    
    public Funcion get(String id){
        for (Map<String, Funcion> funcione : funciones) {
            if(funcione.containsKey(id)){
                return funcione.get(id);
            }
        }
        return null;
    }
    
    public void set(String id, Funcion funcion){
        this.funciones.get(0).put(id, funcion);
    }
    
    public boolean hasLocal(String id){
        return this.funciones.get(0).containsKey(id);
    }
    
    public void agregarRefOtrosArchivos(){
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
