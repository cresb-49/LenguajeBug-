package com.mycompany.modelolenguaje.Lenguaje.Almacenamiento;

import com.mycompany.modelolenguaje.Lenguaje.Abstracto.Retorno;

/**
 *
 * @author carlo
 */
public class Simbolo {
    public Object valor;
    public String id;
    public int tipo;
    public int tipoObjeto;
    public int linea;
    public int columna;

    public Simbolo(Object valor, String id, int tipo,int tipoObjeto, int linea, int columna) {
        this.valor = valor;
        this.id = id;
        this.tipo = tipo;
        this.tipoObjeto = tipoObjeto;
        this.linea = linea;
        this.columna = columna;
    }

    @Override
    public String toString() {
        return "Simbolo{" + "valor=" + valor + ", id=" + id + ", tipo=" + tipo + ", linea=" + linea + ", columna=" + columna + '}';
    }
}
