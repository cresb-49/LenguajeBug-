package com.mycompany.modelolenguaje.Lenguaje.Almacenamiento;

import com.mycompany.modelolenguaje.Lenguaje.Abstracto.Retorno;
import com.mycompany.modelolenguaje.Lenguaje.Abstracto.Retorno.Tipo;
import com.mycompany.modelolenguaje.Lenguaje.TiposYCast.TablaAsignacion;

/**
 *
 * @author carlo
 */
public class Scope {

    private Scope anterior;
    private Stack stack;
    private Heap heap;

    public Scope(Scope anterior) {
        this.anterior = anterior;
    }

    public void declaraVariable(String id, Object valor, int tipo, int tipoObjeto, int linea, int columna) {
        if (this.stack.has(id)) {
            throw new Error("La variable \"" + id + "\" ya esta definida en este ambito");
        } else {
            this.stack.set(id, new Simbolo(valor, id, tipo, tipoObjeto, linea, columna));
        }
    }

    public void asignarValor(String id, Object valor, int tipo) {
        Scope scope = this;
        boolean bandera = true;
        while (scope != null) {
            if (scope.stack.has(id)) {
                Simbolo simbolo = scope.stack.get(id);
                bandera = false;
                if (simbolo != null) {
                    int tipoAsig = (TablaAsignacion.tablaAsignacion[simbolo.tipo][tipo]).ordinal();
                    if (tipoAsig != Tipo.ERROR.ordinal()) {
                        if (tipoAsig == Tipo.OBJETO.ordinal()) {
                            throw new UnsupportedOperationException("Not supported yet.");
                        } else {
                            Simbolo valFinal = null;
                            if (simbolo.tipo == tipoAsig) {
                                simbolo.valor = valFinal;
                            } else {
                                throw new Error("No se puede asignar un valor de tipo \"" + Retorno.TipoString[tipo] + "\" a la variable \"" + id + "\"");
                            }
                        }
                    } else {
                        throw new Error("No se puede asignar un valor de tipo \"" + Retorno.TipoString[tipo] + "\" a la variable \"" + id + "\"");
                    }
                }
            }
            scope = scope.anterior;
        }
        if (bandera) {
            throw new Error("La variable \"" + id + "\" no esta definida en el porgrama");
        }
    }
}
