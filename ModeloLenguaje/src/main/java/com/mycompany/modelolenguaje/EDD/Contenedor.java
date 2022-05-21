package com.mycompany.modelolenguaje.EDD;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author carlo
 */
public class Contenedor<T> {
    private Map<String,Map<String,T>> map;

    public Contenedor() {
        this.map = new HashMap<>();
    }
    
    public boolean has(String key1,String key2){
        if(this.map.containsKey(key1)){
            if(this.map.get(key1).containsKey(key2)){
                return true;
            }
        }
        return false;
    }
    
    public boolean has2(String key1){
        return this.map.containsKey(key1);
    }
    
    public T get(String key1,String key2){
        return this.map.get(key1).get(key2);
    }
    
    public Map<String,T> get2(String key1){
        return this.map.get(key1);
    }
    
    public void set(String key1, String key2,T valor){
        if(this.map.containsKey(key1)){
            this.map.get(key1).put(key2, valor);
        }else{
            this.map.put(key1, new HashMap<>());
            this.map.get(key1).put(key2, valor);
        }
    }
    
}
