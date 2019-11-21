package edu.pucmm.ia.grailspaypal.domains

class Compra {

    Plan plan
    String cliente
    String emailComprador
    Date fechaCompra
    String vendedor

    String factura
    String transaccion
    String estatusPago

    BigDecimal montoCompra
    BigDecimal montoFee
    BigDecimal montoEnvio
    BigDecimal montoImpuesto
    BigDecimal montoManejo
    String direccion
    String zip
    String estado
    String ciudad


    static constraints = {

    }
}
