package com.mycompany.modelolenguaje.Lenguaje.Abstracto;
/**
 *
 * @author carlo
 */
public class Retorno {
    public static enum Tipo{
        DOUBLE,BOOLEAN,STRING,INT,CHAR,VOID,ERROR,OBJETO
    }
    public static final String[] TipoString = {"double", "boolean", "string", "int", "char","void","error","objeto"};
    public Object valor;
    public int tipo;
    
    public Retorno(Object valor,int tipo){
        this.valor = valor;
        this.tipo = tipo;
    }
}
