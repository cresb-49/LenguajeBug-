package com.mycompany.modelolenguaje.Lenguaje.Exprecion;

import com.mycompany.modelolenguaje.Lenguaje.Abstracto.Exprecion;
import com.mycompany.modelolenguaje.Lenguaje.Abstracto.Retorno;
import com.mycompany.modelolenguaje.Lenguaje.Almacenamiento.Scope;

/**
 *
 * @author carlo
 */
public class Logica extends Exprecion{

    public enum OpcionLogica{AND,OR,XOR,NOT}
    public String[] OpcionLogicaString ={"&&","||","|&","!"};
    
    public static boolean[][] andLogico = {
              /*  0    1 */
        /*0*/{false, false},
        /*1*/{false, true},
    };

    public static boolean[][] orLogico = {
              /*  0   1*/
        /*0*/{false, true},
        /*1*/{true, true},
    };

    public static boolean[][] xorLogico = {
             /* 0      1 */
        /*0*/{false, true},
        /*1*/{true, false},
    };
    
    private Exprecion izquierda;
    private Exprecion derecha;
    private int tipo;

    public Logica(Exprecion izquierda, Exprecion derecha, int tipo, int linea, int columna) {
        super(linea, columna);
        this.izquierda = izquierda;
        this.derecha = derecha;
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
