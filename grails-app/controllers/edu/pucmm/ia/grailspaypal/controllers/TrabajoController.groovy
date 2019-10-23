package edu.pucmm.ia.grailspaypal.controllers

import edu.pucmm.ia.grailspaypal.domains.Trabajo
import edu.pucmm.ia.grailspaypal.services.TrabajoService
import grails.plugin.springsecurity.SpringSecurityService
import grails.plugin.springsecurity.annotation.Secured


@Secured('ROLE_USER')
class TrabajoController {

    TrabajoService trabajoService
    SpringSecurityService springSecurityService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE" ]

    def index(Integer max){

        def currentUser = springSecurityService.currentUser
        log.error currentUser.username

        params.max = Math.min(max ?: 10, 100)
        respond trabajoService.list(params), model:[trabajoCount: trabajoService.count()]
    }

    def list() {
        [trabajos:Trabajo.list()]
    }


    def show(Long id){
        respond trabajoService.get(id)
    }

    def create(){
        respond new Trabajo(params)
    }

    def save (Trabajo trabajo){
        if (trabajo == null){
            notFound()
            return
        }
    }


}
