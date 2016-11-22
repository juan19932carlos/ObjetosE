grammar Objetosespanol;

programa: 
    ( declarar_clase )+;
declarar_clase: 
    'clase' NOMBRE '{' ( declarar_funcion | declaracion )*'}';
/*Declarar una funcion dentro de la clase*/
declarar_funcion:
    'def' NOMBRE '(' (NOMBRE NOMBRE (',' NOMBRE NOMBRE)*)? ')' bloque;
/*Como llamar una funcion dentro de un bloque de instrucciones*/
llamar_funcion:
    NOMBRE '(' ( NUMERO | NOMBRE | llamar_funcion) (',' (NUMERO|NOMBRE | llamar_funcion))* ')';
bloque: 
    '{' (linea)* '}';
linea:
    instruccion |
    asignacion ENDL|
    declaracion ENDL;
/* Procesamiento que no afecta la tabla de simbolos */
instruccion:
    condicional |
    ciclo |
    llamar_funcion ENDL;
/* Asignar y cambiar variables en la tabla de simbolos, el punto y coma esta en <linea>*/
asignacion:
    NOMBRE NOMBRE '=' operacion|
    NOMBRE '=' operacion;
/*Declara nuevas entradas en la tabla de simbolos, el punto y coma esta en <linea>*/
declaracion:
    NOMBRE NOMBRE;
condicional:
    'si' '(' operacion_or ')'  bloque ('sino' bloque)? ;
ciclo:
    'mientras' '(' operacion_or ')' bloque;

/*seccion de operaciones*/    
operacion:
    operacion_suma |
    operacion_comparacion|
    operacion_or;
operacion_or:
    operacion_or OP_OR operacion_AND |
    operacion_AND;
operacion_AND:
    operacion_AND OP_AND factor_logico | 
    factor_logico;
factor_logico: 
    llamar_funcion |
    NOMBRE |
    '(' operacion_or ')' | 
    operacion_not;
operacion_not:
    OP_NOT (factor_logico |  operacion_comparacion) |
    operacion_comparacion;
operacion_comparacion:
    factor_comparacion '<' factor_comparacion |
    factor_comparacion '<=' factor_comparacion |
    factor_comparacion '>=' factor_comparacion |
    factor_comparacion '>' factor_comparacion |
    factor_comparacion '==' factor_comparacion |
    '(' operacion_comparacion ')' |
    factor_comparacion;
factor_comparacion: llamar_funcion          #factor_comparacion_1
                  | NUMERO                  #factor_comparacion_numero
                  | NOMBRE                  #factor_comparacion_nombre
                  | operacion_suma          #factor_comparacion_2
;
operacion_suma: OP_MENOS factor_aritmetico                                  # operacion_suma_negacion
            |   operacion_suma OP = (OP_MAS | OP_MENOS ) operacion_mult     # operacion_suma_oper
            |   operacion_mult                                              # operacion_suma_1
;
operacion_mult: operacion_mult OP= (OP_MULTI|OP_DIV) factor_aritmetico      #operacion_mult_oper
              | factor_aritmetico                                           #operacion_mult_1
;
factor_aritmetico: llamar_funcion               #factor_aritmetico_1
                 | NUMERO                       #factor_aritmetico_numero
                 | NOMBRE                       #factor_aritmetico_nombre
                 | '(' operacion_suma ')'       #factor_aritmetico_anidado
;
/*Fin seccion de operaciones*/

/*Los tipos de dato se defiinen en la tabla simbolos: ejmplo int, string*/
OP_OR: 'o';
OP_AND: 'y';
OP_NOT: 'no';
OP_MAS: '+';
OP_MENOS: '-';
OP_MULTI: '*';
OP_DIV: '/';
//TIPO: [a-zA-Z] [a-zA-Z0-9]*;
NOMBRE: [a-zA-Z] [a-zA-Z0-9]*;
NUMERO: [0-9]+ ('.' [0-9]+)? ([Ee][+-]? [0-9]+ )?;
ENDL: ';' ;
BASURA: [' '\t\n\r]+ -> skip;

/*operadores*/