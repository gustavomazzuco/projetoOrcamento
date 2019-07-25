package com.orcamento.resources;

import com.orcamento.models.Produto;
import com.orcamento.service.AbstractService;
import com.orcamento.service.ProdutoService;

import javax.inject.Inject;
import javax.ws.rs.Path;

@Path("/produtos")
public class ProdutoResource extends AbstractResource<Produto> {

    @Inject
    private ProdutoService service;

    @Override
    protected AbstractService<Produto> getService() {
        return service;
    }
}
