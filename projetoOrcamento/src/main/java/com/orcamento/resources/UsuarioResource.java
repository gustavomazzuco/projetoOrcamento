package com.orcamento.resources;

import com.orcamento.models.Usuario;
import com.orcamento.service.AbstractService;
import com.orcamento.service.UsuarioService;

import javax.inject.Inject;
import javax.ws.rs.Path;

@Path("/usuarios")
public class UsuarioResource extends AbstractResource<Usuario> {

    @Inject
    private UsuarioService service;

    @Override
    protected AbstractService<Usuario> getService() {
        return service;
    }
}
