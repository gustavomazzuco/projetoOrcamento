package com.orcamento.resources;

import com.orcamento.models.Orcamento;
import com.orcamento.service.AbstractService;
import com.orcamento.service.OrcamentoService;

import javax.inject.Inject;
import javax.ws.rs.Path;

@Path("/orcamentos")
public class OrcamentoResource extends AbstractResource<Orcamento> {

    @Inject
    private OrcamentoService service;

    @Override
    protected AbstractService<Orcamento> getService() {
        return service;
    }
}
