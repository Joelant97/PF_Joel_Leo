class Trabajo {

    String titulo
    String locacion;
    String descripcion;


    static mapping = {
        datasource 'trabajos'
    }

    static constraints = {
        codigo(unique: true)
    }
}


