package edu.pucmm.ia.grailspaypal.services

import edu.pucmm.ia.grailspaypa.domains.auth.Usuario
import grails.gorm.services.Service

@Service(Usuario)
interface UsuarioService {

    Usuario get(Serializable id)

    List<Usuario> list(Map args)

    Long count()

    void delete(Serializable id)

    Usuario save(Usuario usuario)

}