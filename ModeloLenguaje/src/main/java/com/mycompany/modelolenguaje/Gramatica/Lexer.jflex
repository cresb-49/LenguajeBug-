package com.mycompany.modelolenguaje.Gramatica;

import java_cup.runtime.*;

%%
%class LexerBug
%unicode
%public
%line
%column
//%cup

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
    System.out.println(this.actual.toString());
    throw new Error("Fin del analisis lexico");
    //return new java_cup.runtime.Symbol(ParserJavaSym.EOF,yyline+1,yycolumn+1,this.actual);
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


%state STRING
%state CHAR

%%


<YYINITIAL> {
    {Comment}       {
                        /*Reconocimiento de los comentarios*/
                    }
    "true"          {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),true);
                        System.out.println(this.actual.toString());
                    }
    "false"         {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),false);
                        System.out.println(this.actual.toString());
                    }
    "if"            {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),yytext());
                        System.out.println(this.actual.toString());
                    }
    "else"          {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),yytext());
                        System.out.println(this.actual.toString());
                    }
    "while"         {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),yytext());
                        System.out.println(this.actual.toString());
                    }
    "for"           {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),yytext());
                        System.out.println(this.actual.toString());
                    }
    "if"            {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),yytext());
                        System.out.println(this.actual.toString());
                    }
    "break"         {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),yytext());
                        System.out.println(this.actual.toString());
                    }
    "continue"      {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),yytext());
                        System.out.println(this.actual.toString());
                    }
    "return"        {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),yytext());
                        System.out.println(this.actual.toString());
                    }
    "import"        {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),yytext());
                        System.out.println(this.actual.toString());
                    }
    "incerteza"     {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),yytext());
                        System.out.println(this.actual.toString());
                    }
    "double"        {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),yytext());
                        System.out.println(this.actual.toString());
                    }
    "boolean"       {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),yytext());
                        System.out.println(this.actual.toString());
                    }
    "string"        {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),yytext());
                        System.out.println(this.actual.toString());
                    }
    "int"           {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),yytext());
                        System.out.println(this.actual.toString());
                    }
    "char"          {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),yytext());
                        System.out.println(this.actual.toString());
                    }
    "void"          {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),yytext());
                        System.out.println(this.actual.toString());
                    }    
    {Identifier}    {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),yytext());
                        System.out.println(this.actual.toString());
                    }
    {Decimal}       {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),Double.parseDouble(yytext()));
                        System.out.println(this.actual.toString());
                    }
    {Entero}        {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),Integer.parseInt(yytext()));
                        System.out.println(this.actual.toString());
                    }
    "!="            {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),yytext());
                        System.out.println(this.actual.toString());
                    }
    "=="            {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),yytext());
                        System.out.println(this.actual.toString());
                    }
    "="             {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),yytext());
                        System.out.println(this.actual.toString());
                    }
    "~"             {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),yytext());
                        System.out.println(this.actual.toString());
                    }
    "<="            {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),yytext());
                        System.out.println(this.actual.toString());
                    }
    ">="            {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),yytext());
                        System.out.println(this.actual.toString());
                    }
    "<"             {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),yytext());
                        System.out.println(this.actual.toString());
                    }
    ">"             {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),yytext());
                        System.out.println(this.actual.toString());
                    }
    "&&"            {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),yytext());
                        System.out.println(this.actual.toString());
                    }
    "||"            {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),yytext());
                        System.out.println(this.actual.toString());
                    }
    "|&"            {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),yytext());
                        System.out.println(this.actual.toString());
                    }
    "!"             {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),yytext());
                        System.out.println(this.actual.toString());
                    }
    "++"            {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),yytext());
                        System.out.println(this.actual.toString());
                    }
    "--"            {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),yytext());
                        System.out.println(this.actual.toString());
                    }
    [*]             {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),yytext());
                        System.out.println(this.actual.toString());
                    }
    [/]             {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),yytext());
                        System.out.println(this.actual.toString());
                    }
    [%]             {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),yytext());
                        System.out.println(this.actual.toString());
                    }
    [+]             {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),yytext());
                        System.out.println(this.actual.toString());
                    }
    [-]             {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),yytext());
                        System.out.println(this.actual.toString());
                    }
    [(]             {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),yytext());
                        System.out.println(this.actual.toString());
                    }
    [)]             {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),yytext());
                        System.out.println(this.actual.toString());
                    }
    [\[]            {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),yytext());
                        System.out.println(this.actual.toString());
                    }
    [\]]            {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),yytext());
                        System.out.println(this.actual.toString());
                    }
    [{]             {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),yytext());
                        System.out.println(this.actual.toString());
                    }
    [}]             {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),yytext());
                        System.out.println(this.actual.toString());
                    }
    [.]             {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),yytext());
                        System.out.println(this.actual.toString());
                    }
    [,]             {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),yytext());
                        System.out.println(this.actual.toString());
                    }
    [:]             {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),yytext());
                        System.out.println(this.actual.toString());
                    }
    [;]             {
                        this.actual = new Token((yyline+1),(yycolumn+1),yytext(),yytext());
                        System.out.println(this.actual.toString());
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
                                        System.out.println(this.actual.toString());
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
                                        System.out.println(this.actual.toString());
                                    }
    [^'\n\r\"\\]("'")              { 
                                        yybegin(YYINITIAL);
                                        char_val.append( yytext().charAt(0));
                                        this.actual = new Token((yyline+1),(yycolumn+1),char_val.toString(),char_val.toString());
                                        System.out.println(this.actual.toString());
                                    }
    \\t("'")                        { 
                                        yybegin(YYINITIAL);
                                        char_val.append('\t');
                                        this.actual = new Token((yyline+1),(yycolumn+1),char_val.toString(),char_val.toString());
                                        System.out.println(this.actual.toString());
                                    }
    \\n("'")                        { 
                                        yybegin(YYINITIAL);
                                        char_val.append('\n');
                                        this.actual = new Token((yyline+1),(yycolumn+1),char_val.toString(),char_val.toString());
                                        System.out.println(this.actual.toString());
                                    }
    \\r("'")                        { 
                                        yybegin(YYINITIAL);
                                        char_val.append('\r');
                                        this.actual = new Token((yyline+1),(yycolumn+1),char_val.toString(),char_val.toString());
                                        System.out.println(this.actual.toString());
                                    }
    \\\"("'")                       { 
                                        yybegin(YYINITIAL);
                                        char_val.append('\"');
                                        this.actual = new Token((yyline+1),(yycolumn+1),char_val.toString(),char_val.toString());
                                        System.out.println(this.actual.toString());
                                    }
    \\\'("'")                       { 
                                        yybegin(YYINITIAL);
                                        char_val.append('\'');
                                        this.actual = new Token((yyline+1),(yycolumn+1),char_val.toString(),char_val.toString());
                                        System.out.println(this.actual.toString());
                                    }
    \\("'")                         { 
                                        yybegin(YYINITIAL);
                                        char_val.append('\\');
                                        this.actual = new Token((yyline+1),(yycolumn+1),char_val.toString(),char_val.toString());
                                        System.out.println(this.actual.toString());
                                    }
}

[^]                 { 
                        String des ="El simbolo/cadena no existe en el lenguaje";
                        System.out.println(des);
                    }