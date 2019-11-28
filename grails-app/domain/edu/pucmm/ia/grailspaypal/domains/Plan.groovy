package edu.pucmm.ia.grailspaypal.domains


class Plan {
    String nombre
    float monto

    static constraints = {
        nombre unique: true
    }
}
