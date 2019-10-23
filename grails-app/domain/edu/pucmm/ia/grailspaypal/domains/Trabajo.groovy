package edu.pucmm.ia.grailspaypal.domains

class Trabajo {

    String titulo
    String locacion;
    String descripcion;


    static constraints = {
        codigo(unique: true)
    }
}


