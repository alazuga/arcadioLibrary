/*
* EstadosComunicacion.java
*
* Created on 19 de enero de 2007, 16:19
*
* To change this template, choose Tools | Template Manager
* and open the template in the editor.
*/
 
package com.arcadio;
 
/**
*
* @author fserna
*/
public enum CosmeStates {


    // Convenio que seguimos:
    //      Conexión:       a nivel de socket
    //      Comunicación:   debe haber una conexión válida, y además se ha
    //                      conseguido llevar a cabo
    //                      el protocolo de inicialización (recepción de
    //                      ID_CLIENTE e ID_MAQUINA)



    DESCONECTADO,

    // Nos disponemos a establecer la conexión
    INTENTANDO_CONEXION,

    // se ha intentado pero no ha podido establecerse
    CONEXION_IMPOSIBLE,

    // había una conexión OK, pero se ha interrumpido
    CONEXION_INTERRUMPIDA,

    // Ya hay conexión, pero estamos esperando a recibir los 2 parámetros ID_IU
    // y ID_MAQ de la pasarela alta
    INTENTANDO_ESTABLECER_COMUNICACION,

    // NO estamos en situación de intercambiar telegramas
    COMUNICACION_IMPOSIBLE,

    // Se ha superado el tiempo de espera prefijado para establecer la
    // COMUNICACION
    COMUNICACION_TIMEOUT,

    // No puede accederse a Celestino
    CELESTINO_UNREACHABLE,

    //Se establece cuando se solicita las listas de: nombres/tipos/nombres-tipo
    PETICION_LISTAS,

    // podemos inicializar la máquina (crear sus cestas, etc...) y A
    // FUNCIONAR!!!
    COMUNICACION_OK,

    //Se están recibiendo los "n" telegramas con la lista de nombres
    RECIBIENDO_LISTA_NOMBRES,

    // Se ha recibido el último telegrama
    RECIBIDA_LISTA_NOMBRES,

    // Recibida la lista de clases
    RECIBIENDO_LISTA_CLASES,
    RECIBIDA_LISTA_CLASES,

    //Lista de tipos recibida
    RECIBIENDO_LISTA_TIPOS,
    RECIBIDA_LISTA_TIPOS,

    //Lista de nombres-Tipos recibida
    RECIBIENDO_LISTA_NOMBRES_TIPOS,
    RECIBIDA_LISTA_NOMBRES_TIPOS,

    RECIBIDA_CESTA,   // ha llegado una cesta
    RECIBIDO_LEER,   // se ha recibido una lectura puntual
    RECIBIDO_ESCRIBIR, // se ha recibido el eco de una escritura

    RECIBIDO_ISNUMERIC,  // se ha recibido un telegrama "is_numeric"

    MUESTREADOR_CREADO_OK,  // significa que tenemos constancia de que el muestreador ya ha sido creado en el runtime
    RECIBIDO_TELEGRAMA_MUESTREANDO, // se ha activado un muestreador
    RECIBIDO_DATOS_MUESTREADOR, // ha llegao un telegrama con un chunk de datos de un muestreador
    MUESTREADOR_FIN,  //arcadio ya ha recibido todas las muestras del muestreador

    RECIBIDO_TIPO_NOMBRE,
    RECIBIDO_LISTA_NOMBRES_CONFIGURABLES,
    RECIBIDO_LISTA_NOMBRES_CONFIGURABLES_RESERVADOS,

    RECIBIDO_TELEGRAMA_SOLICITUD_FICHERO_TEXTO,

    RECIBIDO_TELEGRAMA_DESCONOCIDO,
    RECIBIDA_LISTA_INSTANCIAS_CLASES,

    RECIBIDO_EVENTO_DE_PASARELA,




    // -----EVENTOS QUE VIENEN DE LA PASARELA --------------------------------------------------
    ERROR_INDETERMINADO,
    FICHERO_EMC_RECIBIDO_OK,
    FICHERO_EMC_RECIBIDO_ERROR,
    ADMINISTRATOR_PASSWORD_ERROR,
    ADMINISTRATOR_OK,
    USER_OK
}
