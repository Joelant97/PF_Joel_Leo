package edu.pucmm.ia.grailspaypal.domains

class Parametro {

    public static final String CUENTA_NEGOCIO_PAYPAL="EAWQLQPSS9TCC";

    String codigo;
    String nombre;
    String valor;

    static constraints = {
       codigo(unique: true)
    }
}
