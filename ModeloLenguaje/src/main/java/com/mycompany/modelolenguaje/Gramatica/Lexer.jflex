package com.mycompany.modelolenguaje.Gramatica;

import java_cup.runtime.*;

%%
%class LexerBug
%unicode
%public
%line
%column
%cup

%{
    private int stringColumnInit = 0; 
    private StringBuffer string = new StringBuffer();
    private StringBuffer coment_simple = new StringBuffer();
    private StringBuffer coment_multi = new StringBuffer();
    private StringBuffer char_val = new StringBuffer();
    private Token actual;

    // public LexerBug(java.io.Reader in) {
    //     this.zzReader = in;
    // }

%}

%eofval{
    this.actual = new Token((yyline+1),(yycolumn+1),"EOF","EOF");
    //System.out.println(this.actual.toString());
    return new java_cup.runtime.Symbol(ParserBugSym.EOF,(yyline+1),(yycolumn+1),this.actual);
%eofval}

LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]
WhiteSpace     = {LineTerminator} | [ \t\f]

/* comments */
Comment = {TraditionalComment} | {EndOfLineComment} | {DocumentationComment}
TraditionalComment   = "/*" [^*] ~"*/" | "/*" "*"+ "/"
// Comment can be the last line of the file, without line terminator.
EndOfLineComment     = "//" {InputCharacter}* {LineTerminator}?
EndOfLineComment     = "//" [^\n]*
DocumentationComment = "/**" {CommentContent} "*"+ "/"
CommentContent       = ( [^*] | \*+ [^/*] )*

Identifier = [:jletter:] [:jletterdigit:]*

Number = [0-9]
Entero = {Number}+
Decimal = {Entero}[.]{Entero}

RefFile = {Identifier}[.]("bug")


%state STRING
%state CHAR

%%


<YYINITIAL> {
    {Comment}       {
                        /*Reconocimiento de los comentarios*/
                    }
    {RefFile}       {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),yytext());
                        //System.out.println(this.actual.toString());
                        return new Symbol(ParserBugSym.REFFILE, this.actual);
                    }
    "print"         {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),yytext());
                        //System.out.println(this.actual.toString());
                        return new Symbol(ParserBugSym.PRINT, this.actual);
                    }
    "true"          {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),true);
                        //System.out.println(this.actual.toString());
                        return new Symbol(ParserBugSym.TRUE, this.actual);
                    }
    "false"         {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),false);
                        //System.out.println(this.actual.toString());
                        return new Symbol(ParserBugSym.FALSE, this.actual);
                    }
    "if"            {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),yytext());
                        //System.out.println(this.actual.toString());
                        return new Symbol(ParserBugSym.IF, this.actual);
                    }
    "else"          {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),yytext());
                        //System.out.println(this.actual.toString());
                        return new Symbol(ParserBugSym.ELSE, this.actual);
                    }
    "while"         {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),yytext());
                        //System.out.println(this.actual.toString());
                        return new Symbol(ParserBugSym.WHILE, this.actual);
                    }
    "for"           {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),yytext());
                        //System.out.println(this.actual.toString());
                        return new Symbol(ParserBugSym.FOR, this.actual);
                    }
    "break"         {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),yytext());
                        //System.out.println(this.actual.toString());
                        return new Symbol(ParserBugSym.BREAK, this.actual);
                    }
    "continue"      {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),yytext());
                        //System.out.println(this.actual.toString());
                        return new Symbol(ParserBugSym.CONTINUAR, this.actual);
                    }
    "return"        {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),yytext());
                        //System.out.println(this.actual.toString());
                        return new Symbol(ParserBugSym.RETURN, this.actual);
                    }
    "import"        {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),yytext());
                        //System.out.println(this.actual.toString());
                        return new Symbol(ParserBugSym.IMPORTAR, this.actual);
                    }
    "incerteza"     {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),yytext());
                        //System.out.println(this.actual.toString());
                        return new Symbol(ParserBugSym.INCERTEZA, this.actual);
                    }
    "double"        {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),yytext());
                        //System.out.println(this.actual.toString());
                        return new Symbol(ParserBugSym.DOUBLE, this.actual);
                    }
    "boolean"       {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),yytext());
                        //System.out.println(this.actual.toString());
                        return new Symbol(ParserBugSym.BOOL, this.actual);
                    }
    "string"        {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),yytext());
                        //System.out.println(this.actual.toString());
                        return new Symbol(ParserBugSym.STRING, this.actual);
                    }
    "int"           {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),yytext());
                        //System.out.println(this.actual.toString());
                        return new Symbol(ParserBugSym.INT, this.actual);
                    }
    "char"          {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),yytext());
                        //System.out.println(this.actual.toString());
                        return new Symbol(ParserBugSym.CHAR, this.actual);
                    }
    "void"          {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),yytext());
                        //System.out.println(this.actual.toString());
                        return new Symbol(ParserBugSym.VOID, this.actual);
                    }    
    {Identifier}    {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),yytext());
                        //System.out.println(this.actual.toString());
                        return new Symbol(ParserBugSym.ID, this.actual);
                    }
    {Decimal}       {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),Double.parseDouble(yytext()));
                        //System.out.println(this.actual.toString());
                        return new Symbol(ParserBugSym.DECIMAL, this.actual);
                    }
    {Entero}        {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),Integer.parseInt(yytext()));
                        //System.out.println(this.actual.toString());
                        return new Symbol(ParserBugSym.ENTERO, this.actual);
                    }
    "!="            {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),yytext());
                        //System.out.println(this.actual.toString());
                        return new Symbol(ParserBugSym.DIF, this.actual);
                    }
    "=="            {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),yytext());
                        //System.out.println(this.actual.toString());
                        return new Symbol(ParserBugSym.EQUAL, this.actual);
                    }
    "="             {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),yytext());
                        //System.out.println(this.actual.toString());
                        return new Symbol(ParserBugSym.EQ, this.actual);
                    }
    "~"             {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),yytext());
                        //System.out.println(this.actual.toString());
                        return new Symbol(ParserBugSym.INCER, this.actual);
                    }
    "<="            {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),yytext());
                        //System.out.println(this.actual.toString());
                        return new Symbol(ParserBugSym.MEI, this.actual);
                    }
    ">="            {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),yytext());
                        //System.out.println(this.actual.toString());
                        return new Symbol(ParserBugSym.MAI, this.actual);
                    }
    "<"             {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),yytext());
                        //System.out.println(this.actual.toString());
                        return new Symbol(ParserBugSym.MEQ, this.actual);
                    }
    ">"             {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),yytext());
                        //System.out.println(this.actual.toString());
                        return new Symbol(ParserBugSym.MAQ, this.actual);
                    }
    "&&"            {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),yytext());
                        //System.out.println(this.actual.toString());
                        return new Symbol(ParserBugSym.AND, this.actual);
                    }
    "||"            {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),yytext());
                        //System.out.println(this.actual.toString());
                        return new Symbol(ParserBugSym.OR, this.actual);
                    }
    "|&"            {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),yytext());
                        //System.out.println(this.actual.toString());
                        return new Symbol(ParserBugSym.XOR, this.actual);
                    }
    "!"             {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),yytext());
                        //System.out.println(this.actual.toString());
                        return new Symbol(ParserBugSym.NOT, this.actual);
                    }
    "++"            {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),yytext());
                        //System.out.println(this.actual.toString());
                        return new Symbol(ParserBugSym.SUMAR, this.actual);
                    }
    "--"            {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),yytext());
                        //System.out.println(this.actual.toString());
                        return new Symbol(ParserBugSym.RESTAR, this.actual);
                    }
    [*]             {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),yytext());
                        //System.out.println(this.actual.toString());
                        return new Symbol(ParserBugSym.MUL, this.actual);
                    }
    [/]             {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),yytext());
                        //System.out.println(this.actual.toString());
                        return new Symbol(ParserBugSym.DIV, this.actual);
                    }
    [%]             {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),yytext());
                        //System.out.println(this.actual.toString());
                        return new Symbol(ParserBugSym.MOD, this.actual);
                    }
    [+]             {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),yytext());
                        //System.out.println(this.actual.toString());
                        return new Symbol(ParserBugSym.MAS, this.actual);
                    }
    [-]             {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),yytext());
                        //System.out.println(this.actual.toString());
                        return new Symbol(ParserBugSym.MENOS, this.actual);
                    }
    [(]             {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),yytext());
                        //System.out.println(this.actual.toString());
                        return new Symbol(ParserBugSym.PAR_A, this.actual);
                    }
    [)]             {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),yytext());
                        //System.out.println(this.actual.toString());
                        return new Symbol(ParserBugSym.PAR_C, this.actual);
                    }
    [\[]            {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),yytext());
                        //System.out.println(this.actual.toString());
                        return new Symbol(ParserBugSym.COR_A, this.actual);
                    }
    [\]]            {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),yytext());
                        //System.out.println(this.actual.toString());
                        return new Symbol(ParserBugSym.COR_C, this.actual);
                    }
    [{]             {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),yytext());
                        //System.out.println(this.actual.toString());
                        return new Symbol(ParserBugSym.LL_A, this.actual);
                    }
    [}]             {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),yytext());
                        //System.out.println(this.actual.toString());
                        return new Symbol(ParserBugSym.LL_C, this.actual);
                    }
    [.]             {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),yytext());
                        //System.out.println(this.actual.toString());
                        //return new Symbol(ParserBugSym.DOT, this.actual);
                        return new Symbol(ParserBugSym.ERROR, this.actual);
                    }
    [,]             {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),yytext());
                        //System.out.println(this.actual.toString());
                        return new Symbol(ParserBugSym.COMA, this.actual);
                    }
    [:]             {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),yytext());
                        //System.out.println(this.actual.toString());
                        //return new Symbol(ParserBugSym.DDOT, this.actual);
                        return new Symbol(ParserBugSym.ERROR, this.actual);
                    }
    [;]             {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),yytext());
                        //System.out.println(this.actual.toString());
                        return new Symbol(ParserBugSym.PUNTO_COMA, this.actual);
                    }
    [\"]            {
                        this.stringColumnInit = (yycolumn+1);
                        this.string.setLength(0); 
                        yybegin(STRING); 
                    }
    "'"             {
                        yybegin(CHAR); 
                    }
    /* whitespace */
    {WhiteSpace}                   { /* ignore */ }
}


<STRING>    {
      \"                            { 
                                        yybegin(YYINITIAL);
                                        this.actual = new Token((yyline+1),(yycolumn+1),string.toString(),string.toString());
                                        //System.out.println(this.actual.toString());
                                        return new Symbol(ParserBugSym.CADENA, this.actual);
                                    }
      [^\n\r\"\\]+                   { string.append( yytext()); }
      \\t                            { string.append('\t'); }
      \\n                            { string.append('\n'); }

      \\r                            { string.append('\r'); }
      \\\"                           { string.append('\"'); }
      \\                             { string.append('\\'); }
}

<CHAR>    {
    "'"                             { 
                                        yybegin(YYINITIAL);
                                        this.actual = new Token((yyline+1),(yycolumn+1),char_val.toString(),char_val.toString());
                                        //System.out.println(this.actual.toString());
                                        return new Symbol(ParserBugSym.CARACTER, this.actual);
                                    }
    [^'\n\r\"\\]("'")              { 
                                        yybegin(YYINITIAL);
                                        char_val.append( yytext().charAt(0));
                                        this.actual = new Token((yyline+1),(yycolumn+1),char_val.toString(),char_val.toString());
                                        //System.out.println(this.actual.toString());
                                        return new Symbol(ParserBugSym.CARACTER, this.actual);
                                    }
    \\t("'")                        { 
                                        yybegin(YYINITIAL);
                                        char_val.append('\t');
                                        this.actual = new Token((yyline+1),(yycolumn+1),char_val.toString(),char_val.toString());
                                        //System.out.println(this.actual.toString());
                                        return new Symbol(ParserBugSym.CARACTER, this.actual);
                                    }
    \\n("'")                        { 
                                        yybegin(YYINITIAL);
                                        char_val.append('\n');
                                        this.actual = new Token((yyline+1),(yycolumn+1),char_val.toString(),char_val.toString());
                                        //System.out.println(this.actual.toString());
                                        return new Symbol(ParserBugSym.CARACTER, this.actual);
                                    }
    \\r("'")                        { 
                                        yybegin(YYINITIAL);
                                        char_val.append('\r');
                                        this.actual = new Token((yyline+1),(yycolumn+1),char_val.toString(),char_val.toString());
                                        //System.out.println(this.actual.toString());
                                        return new Symbol(ParserBugSym.CARACTER, this.actual);
                                    }
    \\\"("'")                       { 
                                        yybegin(YYINITIAL);
                                        char_val.append('\"');
                                        this.actual = new Token((yyline+1),(yycolumn+1),char_val.toString(),char_val.toString());
                                        //System.out.println(this.actual.toString());
                                        return new Symbol(ParserBugSym.CARACTER, this.actual);
                                    }
    \\\'("'")                       { 
                                        yybegin(YYINITIAL);
                                        char_val.append('\'');
                                        this.actual = new Token((yyline+1),(yycolumn+1),char_val.toString(),char_val.toString());
                                        //System.out.println(this.actual.toString());
                                        return new Symbol(ParserBugSym.CARACTER, this.actual);
                                    }
    \\("'")                         { 
                                        yybegin(YYINITIAL);
                                        char_val.append('\\');
                                        this.actual = new Token((yyline+1),(yycolumn+1),char_val.toString(),char_val.toString());
                                        //System.out.println(this.actual.toString());
                                        return new Symbol(ParserBugSym.CARACTER, this.actual);
                                    }
}

[^]                 { 
                        String des ="El simbolo/cadena no existe en el lenguaje";
                        System.out.println(des);
                        Token error = new Token((yyline+1),(yycolumn+1),yytext(),yytext());
                        return new Symbol(ParserBugSym.ERROR, error);
                    }