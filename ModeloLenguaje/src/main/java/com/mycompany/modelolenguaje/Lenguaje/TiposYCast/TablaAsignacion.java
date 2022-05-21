package com.mycompany.modelolenguaje.Lenguaje.TiposYCast;

import com.mycompany.modelolenguaje.Lenguaje.Abstracto.Retorno.Tipo;

/**
 *
 * @author carlo
 */
public class TablaAsignacion {
    public static final Tipo [][] tablaAsignacion ={
    /*              DOUBLE       BOOLEAN      STRING         INT         CHAR        VOID      ERROR     OBJETO*/
    /*DOUBLE*/  {Tipo.DOUBLE ,Tipo.DOUBLE ,Tipo.ERROR  ,Tipo.DOUBLE ,Tipo.DOUBLE,Tipo.ERROR,Tipo.ERROR,Tipo.ERROR},
    /*BOOLEAN*/ {Tipo.ERROR  ,Tipo.BOOLEAN,Tipo.ERROR  ,Tipo.ERROR  ,Tipo.ERROR ,Tipo.ERROR,Tipo.ERROR,Tipo.ERROR},
    /*STRING*/  {Tipo.STRING ,Tipo.STRING ,Tipo.STRING ,Tipo.STRING ,Tipo.STRING,Tipo.ERROR,Tipo.ERROR,Tipo.ERROR},
    /*INT*/     {Tipo.INT    ,Tipo.INT    ,Tipo.ERROR  ,Tipo.INT    ,Tipo.INT   ,Tipo.ERROR,Tipo.ERROR,Tipo.ERROR},
    /*CHAR*/    {Tipo.ERROR  ,Tipo.ERROR  ,Tipo.ERROR  ,Tipo.CHAR   ,Tipo.CHAR  ,Tipo.ERROR,Tipo.ERROR,Tipo.ERROR},
    /*VOID*/    {Tipo.ERROR  ,Tipo.ERROR  ,Tipo.ERROR  ,Tipo.ERROR  ,Tipo.ERROR ,Tipo.ERROR,Tipo.ERROR,Tipo.ERROR},
    /*ERROR*/   {Tipo.ERROR  ,Tipo.ERROR  ,Tipo.ERROR  ,Tipo.ERROR  ,Tipo.ERROR ,Tipo.ERROR,Tipo.ERROR,Tipo.ERROR},
    /*OBJETO*/  {Tipo.ERROR  ,Tipo.ERROR  ,Tipo.ERROR  ,Tipo.ERROR  ,Tipo.ERROR ,Tipo.ERROR,Tipo.ERROR,Tipo.OBJETO}
    };
}
