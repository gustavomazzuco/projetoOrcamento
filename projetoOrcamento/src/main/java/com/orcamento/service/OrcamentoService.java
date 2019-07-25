package com.orcamento.service;

import com.orcamento.models.Orcamento;
import com.orcamento.utils.GenericDao;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

@Stateless
@TransactionAttribute(TransactionAttributeType.SUPPORTS)
public class OrcamentoService extends AbstractService<Orcamento> {

    @Inject
    private GenericDao<Orcamento> dao;

    @Override
    protected GenericDao<Orcamento> getDao() {
        return dao;
    }
}
