package edu.pucmm.ia.grailspaypal.services

import com.google.web.bindery.requestfactory.shared.Service
import edu.pucmm.ia.grailspaypa.domains.auth.UsuarioRol


@Service(UsuarioRol)
interface UsuarioRolService {

    UsuarioRol get(Serializable id)

    List<UsuarioRol> list(Map args)

    Long count()

    void delete(Serializable id)

    UsuarioRol save(UsuarioRol usuarioRol)

}