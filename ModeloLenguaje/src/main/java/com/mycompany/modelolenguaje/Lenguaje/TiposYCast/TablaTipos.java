package com.mycompany.modelolenguaje.Lenguaje.TiposYCast;

import com.mycompany.modelolenguaje.Lenguaje.Abstracto.Retorno.Tipo;

/**
 *
 * @author carlo
 */
public class TablaTipos{
    public static final Tipo[][] castSuma ={
    /*              DOUBLE       BOOLEAN      STRING         INT         CHAR        VOID      ERROR     OBJETO*/
    /*DOUBLE*/  {Tipo.DOUBLE,Tipo.DOUBLE,Tipo.STRING,Tipo.DOUBLE,Tipo.DOUBLE,Tipo.ERROR,Tipo.ERROR,Tipo.ERROR},
    /*BOOLEAN*/ {Tipo.DOUBLE,Tipo.DOUBLE,Tipo.STRING,Tipo.INT   ,Tipo.ERROR ,Tipo.ERROR,Tipo.ERROR,Tipo.ERROR},
    /*STRING*/  {Tipo.STRING,Tipo.STRING,Tipo.STRING,Tipo.STRING,Tipo.STRING,Tipo.ERROR,Tipo.ERROR,Tipo.ERROR},
    /*INT*/     {Tipo.DOUBLE,Tipo.INT   ,Tipo.STRING,Tipo.INT   ,Tipo.INT   ,Tipo.ERROR,Tipo.ERROR,Tipo.ERROR},
    /*CHAR*/    {Tipo.DOUBLE,Tipo.ERROR ,Tipo.STRING,Tipo.INT   ,Tipo.INT   ,Tipo.ERROR,Tipo.ERROR,Tipo.ERROR},
    /*VOID*/    {Tipo.ERROR ,Tipo.ERROR ,Tipo.ERROR ,Tipo.ERROR ,Tipo.ERROR ,Tipo.ERROR,Tipo.ERROR,Tipo.ERROR},
    /*ERROR*/   {Tipo.ERROR ,Tipo.ERROR ,Tipo.ERROR ,Tipo.ERROR ,Tipo.ERROR ,Tipo.ERROR,Tipo.ERROR,Tipo.ERROR},
    /*OBJETO*/  {Tipo.ERROR ,Tipo.ERROR ,Tipo.ERROR ,Tipo.ERROR ,Tipo.ERROR ,Tipo.ERROR,Tipo.ERROR,Tipo.ERROR}
    };
    public static final Tipo[][] castMenos ={
    /*              DOUBLE       BOOLEAN      STRING         INT         CHAR        VOID      ERROR     OBJETO*/
    /*DOUBLE*/  {Tipo.DOUBLE,Tipo.DOUBLE,Tipo.ERROR,Tipo.DOUBLE,Tipo.DOUBLE,Tipo.ERROR,Tipo.ERROR,Tipo.ERROR},
    /*BOOLEAN*/ {Tipo.DOUBLE,Tipo.ERROR ,Tipo.ERROR,Tipo.INT   ,Tipo.ERROR ,Tipo.ERROR,Tipo.ERROR,Tipo.ERROR},
    /*STRING*/  {Tipo.ERROR ,Tipo.ERROR ,Tipo.ERROR,Tipo.ERROR ,Tipo.ERROR ,Tipo.ERROR,Tipo.ERROR,Tipo.ERROR},
    /*INT*/     {Tipo.DOUBLE,Tipo.INT   ,Tipo.ERROR,Tipo.INT   ,Tipo.INT   ,Tipo.ERROR,Tipo.ERROR,Tipo.ERROR},
    /*CHAR*/    {Tipo.DOUBLE,Tipo.ERROR ,Tipo.ERROR,Tipo.INT   ,Tipo.INT   ,Tipo.ERROR,Tipo.ERROR,Tipo.ERROR},
    /*VOID*/    {Tipo.ERROR ,Tipo.ERROR ,Tipo.ERROR,Tipo.ERROR ,Tipo.ERROR ,Tipo.ERROR,Tipo.ERROR,Tipo.ERROR},
    /*ERROR*/   {Tipo.ERROR ,Tipo.ERROR ,Tipo.ERROR,Tipo.ERROR ,Tipo.ERROR ,Tipo.ERROR,Tipo.ERROR,Tipo.ERROR},
    /*OBJETO*/  {Tipo.ERROR ,Tipo.ERROR ,Tipo.ERROR ,Tipo.ERROR ,Tipo.ERROR ,Tipo.ERROR,Tipo.ERROR,Tipo.ERROR}
    };
    public static final Tipo[][] castPor ={
    /*              DOUBLE       BOOLEAN      STRING         INT         CHAR        VOID      ERROR     OBJETO*/
    /*DOUBLE*/  {Tipo.DOUBLE,Tipo.DOUBLE,Tipo.ERROR,Tipo.DOUBLE,Tipo.DOUBLE,Tipo.ERROR,Tipo.ERROR,Tipo.ERROR},
    /*BOOLEAN*/ {Tipo.DOUBLE,Tipo.ERROR ,Tipo.ERROR,Tipo.INT   ,Tipo.ERROR ,Tipo.ERROR,Tipo.ERROR,Tipo.ERROR},
    /*STRING*/  {Tipo.ERROR ,Tipo.ERROR ,Tipo.ERROR,Tipo.ERROR ,Tipo.ERROR ,Tipo.ERROR,Tipo.ERROR,Tipo.ERROR},
    /*INT*/     {Tipo.DOUBLE,Tipo.INT   ,Tipo.ERROR,Tipo.INT   ,Tipo.INT   ,Tipo.ERROR,Tipo.ERROR,Tipo.ERROR},
    /*CHAR*/    {Tipo.DOUBLE,Tipo.ERROR ,Tipo.ERROR,Tipo.INT   ,Tipo.INT   ,Tipo.ERROR,Tipo.ERROR,Tipo.ERROR},
    /*VOID*/    {Tipo.ERROR ,Tipo.ERROR ,Tipo.ERROR,Tipo.ERROR ,Tipo.ERROR ,Tipo.ERROR,Tipo.ERROR,Tipo.ERROR},
    /*ERROR*/   {Tipo.ERROR ,Tipo.ERROR ,Tipo.ERROR,Tipo.ERROR ,Tipo.ERROR ,Tipo.ERROR,Tipo.ERROR,Tipo.ERROR},
    /*OBJETO*/  {Tipo.ERROR ,Tipo.ERROR ,Tipo.ERROR ,Tipo.ERROR ,Tipo.ERROR ,Tipo.ERROR,Tipo.ERROR,Tipo.ERROR}
    };
    public static final Tipo[][] castDiv ={
    /*              DOUBLE       BOOLEAN      STRING         INT         CHAR        VOID      ERROR     OBJETO*/
    /*DOUBLE*/  {Tipo.DOUBLE,Tipo.DOUBLE,Tipo.ERROR,Tipo.DOUBLE,Tipo.DOUBLE,Tipo.ERROR,Tipo.ERROR,Tipo.ERROR},
    /*BOOLEAN*/ {Tipo.DOUBLE,Tipo.ERROR ,Tipo.ERROR,Tipo.DOUBLE,Tipo.ERROR ,Tipo.ERROR,Tipo.ERROR,Tipo.ERROR},
    /*STRING*/  {Tipo.ERROR ,Tipo.ERROR ,Tipo.ERROR,Tipo.ERROR ,Tipo.ERROR ,Tipo.ERROR,Tipo.ERROR,Tipo.ERROR},
    /*INT*/     {Tipo.DOUBLE,Tipo.DOUBLE,Tipo.ERROR,Tipo.DOUBLE,Tipo.DOUBLE,Tipo.ERROR,Tipo.ERROR,Tipo.ERROR},
    /*CHAR*/    {Tipo.DOUBLE,Tipo.ERROR ,Tipo.ERROR,Tipo.DOUBLE,Tipo.DOUBLE,Tipo.ERROR,Tipo.ERROR,Tipo.ERROR},
    /*VOID*/    {Tipo.ERROR ,Tipo.ERROR ,Tipo.ERROR,Tipo.ERROR ,Tipo.ERROR ,Tipo.ERROR,Tipo.ERROR,Tipo.ERROR},
    /*ERROR*/   {Tipo.ERROR ,Tipo.ERROR ,Tipo.ERROR,Tipo.ERROR ,Tipo.ERROR ,Tipo.ERROR,Tipo.ERROR,Tipo.ERROR},
    /*OBJETO*/  {Tipo.ERROR ,Tipo.ERROR ,Tipo.ERROR ,Tipo.ERROR ,Tipo.ERROR ,Tipo.ERROR,Tipo.ERROR,Tipo.ERROR}
    };

    public static final Tipo[][] castMod ={
    /*              DOUBLE       BOOLEAN      STRING         INT         CHAR        VOID      ERROR     OBJETO*/
    /*DOUBLE*/  {Tipo.DOUBLE,Tipo.DOUBLE,Tipo.ERROR,Tipo.DOUBLE,Tipo.DOUBLE,Tipo.ERROR,Tipo.ERROR,Tipo.ERROR},
    /*BOOLEAN*/ {Tipo.DOUBLE,Tipo.ERROR ,Tipo.ERROR,Tipo.DOUBLE,Tipo.ERROR ,Tipo.ERROR,Tipo.ERROR,Tipo.ERROR},
    /*STRING*/  {Tipo.ERROR ,Tipo.ERROR ,Tipo.ERROR,Tipo.ERROR ,Tipo.ERROR ,Tipo.ERROR,Tipo.ERROR,Tipo.ERROR},
    /*INT*/     {Tipo.DOUBLE,Tipo.DOUBLE,Tipo.ERROR,Tipo.DOUBLE,Tipo.DOUBLE,Tipo.ERROR,Tipo.ERROR,Tipo.ERROR},
    /*CHAR*/    {Tipo.DOUBLE,Tipo.ERROR ,Tipo.ERROR,Tipo.DOUBLE,Tipo.DOUBLE,Tipo.ERROR,Tipo.ERROR,Tipo.ERROR},
    /*VOID*/    {Tipo.ERROR ,Tipo.ERROR ,Tipo.ERROR,Tipo.ERROR ,Tipo.ERROR ,Tipo.ERROR,Tipo.ERROR,Tipo.ERROR},
    /*ERROR*/   {Tipo.ERROR ,Tipo.ERROR ,Tipo.ERROR,Tipo.ERROR ,Tipo.ERROR ,Tipo.ERROR,Tipo.ERROR,Tipo.ERROR},
    /*OBJETO*/  {Tipo.ERROR ,Tipo.ERROR ,Tipo.ERROR ,Tipo.ERROR ,Tipo.ERROR ,Tipo.ERROR,Tipo.ERROR,Tipo.ERROR}
    };

    public static final Tipo[][] castPot ={
    /*              DOUBLE       BOOLEAN      STRING         INT         CHAR        VOID      ERROR     OBJETO*/
    /*DOUBLE*/  {Tipo.DOUBLE,Tipo.DOUBLE,Tipo.ERROR,Tipo.DOUBLE,Tipo.DOUBLE,Tipo.ERROR,Tipo.ERROR,Tipo.ERROR},
    /*BOOLEAN*/ {Tipo.DOUBLE,Tipo.ERROR ,Tipo.ERROR,Tipo.DOUBLE,Tipo.ERROR ,Tipo.ERROR,Tipo.ERROR,Tipo.ERROR},
    /*STRING*/  {Tipo.ERROR ,Tipo.ERROR ,Tipo.ERROR,Tipo.ERROR ,Tipo.ERROR ,Tipo.ERROR,Tipo.ERROR,Tipo.ERROR},
    /*INT*/     {Tipo.DOUBLE,Tipo.DOUBLE,Tipo.ERROR,Tipo.INT   ,Tipo.INT   ,Tipo.ERROR,Tipo.ERROR,Tipo.ERROR},
    /*CHAR*/    {Tipo.DOUBLE,Tipo.ERROR ,Tipo.ERROR,Tipo.INT   ,Tipo.INT   ,Tipo.ERROR,Tipo.ERROR,Tipo.ERROR},
    /*VOID*/    {Tipo.ERROR ,Tipo.ERROR ,Tipo.ERROR,Tipo.ERROR ,Tipo.ERROR ,Tipo.ERROR,Tipo.ERROR,Tipo.ERROR},
    /*ERROR*/   {Tipo.ERROR ,Tipo.ERROR ,Tipo.ERROR,Tipo.ERROR ,Tipo.ERROR ,Tipo.ERROR,Tipo.ERROR,Tipo.ERROR},
    /*OBJETO*/  {Tipo.ERROR ,Tipo.ERROR ,Tipo.ERROR ,Tipo.ERROR ,Tipo.ERROR ,Tipo.ERROR,Tipo.ERROR,Tipo.ERROR}
    };

    public static final Tipo[][] castIncerteza ={
    /*              DOUBLE       BOOLEAN      STRING         INT         CHAR        VOID      ERROR     OBJETO*/
    /*DOUBLE*/  {Tipo.BOOLEAN,Tipo.ERROR,Tipo.ERROR  ,Tipo.BOOLEAN,Tipo.ERROR,Tipo.ERROR,Tipo.ERROR,Tipo.ERROR},
    /*BOOLEAN*/ {Tipo.ERROR  ,Tipo.ERROR,Tipo.ERROR  ,Tipo.ERROR  ,Tipo.ERROR,Tipo.ERROR,Tipo.ERROR,Tipo.ERROR},
    /*STRING*/  {Tipo.ERROR  ,Tipo.ERROR,Tipo.BOOLEAN,Tipo.ERROR  ,Tipo.ERROR,Tipo.ERROR,Tipo.ERROR,Tipo.ERROR},
    /*INT*/     {Tipo.BOOLEAN,Tipo.ERROR,Tipo.ERROR  ,Tipo.BOOLEAN,Tipo.ERROR,Tipo.ERROR,Tipo.ERROR,Tipo.ERROR},
    /*CHAR*/    {Tipo.ERROR  ,Tipo.ERROR,Tipo.ERROR  ,Tipo.ERROR  ,Tipo.ERROR,Tipo.ERROR,Tipo.ERROR,Tipo.ERROR},
    /*VOID*/    {Tipo.ERROR  ,Tipo.ERROR ,Tipo.ERROR ,Tipo.ERROR  ,Tipo.ERROR,Tipo.ERROR,Tipo.ERROR,Tipo.ERROR},
    /*ERROR*/   {Tipo.ERROR  ,Tipo.ERROR ,Tipo.ERROR ,Tipo.ERROR  ,Tipo.ERROR,Tipo.ERROR,Tipo.ERROR,Tipo.ERROR},
    /*OBJETO*/  {Tipo.ERROR ,Tipo.ERROR ,Tipo.ERROR ,Tipo.ERROR ,Tipo.ERROR ,Tipo.ERROR,Tipo.ERROR,Tipo.ERROR}
    };
    
    
}
