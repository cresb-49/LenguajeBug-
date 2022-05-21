package com.mycompany.modelolenguaje.Lenguaje.Almacenamiento;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author carlo
 */
public class Heap {
    private Map<String,Object> objetos;
    
    public Heap(){
        this.objetos = new HashMap<>();
    }
    
    public boolean has(String key){
        return objetos.containsKey(key);
    }
    
    public void set(String key, Object value){
        this.objetos.put(key, value);
    }
    
    public void delete(String key){
        this.objetos.remove(key);
    }
}
