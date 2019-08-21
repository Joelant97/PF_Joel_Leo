package edu.pucmm.ia.grailspaypal.services

import com.liferay.portal.kernel.transaction.Transactional

@Transactional
class TrabajoService {


    //Solo Grails Version: 4.0
//    @ReadOnly('trabajos')
//    List<Trabajo> findAll(){
//        Trabajo.where {}.findAll()
//    }
//
//
//    @Transactional('trabajos')
//    void save(String ){
//        Trabajo trabajo = new Trabajo(titulo: titulo)
//        trabajo.save()
//        book
//    }

    def count

    @Transactional(readOnly = true)
    def listTrabajos() {
        Trabajo.list()
    }

    def updateTrabajo() {
        // ...
    }

    def deleteTrabajo() {
        // ...
    }

}
