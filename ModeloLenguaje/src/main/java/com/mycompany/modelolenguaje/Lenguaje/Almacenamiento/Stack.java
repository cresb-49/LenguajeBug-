package com.mycompany.modelolenguaje.Lenguaje.Almacenamiento;

import com.mycompany.modelolenguaje.Lenguaje.Almacenamiento.Simbolo;
import java.util.Map;

/**
 *
 * @author carlo
 */
public class Stack {
    private Map<String,Simbolo> variables;
    
    public boolean has(String key){
        return this.variables.containsKey(key);
    }
    
    public Simbolo get(String key){
        return this.variables.get(key);
    }
    
    public void set(String key,Simbolo valor){
        this.variables.put(key, valor);
    }
    
    public void delete(String key){
        this.variables.remove(key);
    }
            
}
