package com.orcamento.service;

import com.orcamento.models.Usuario;
import com.orcamento.utils.GenericDao;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

@Stateless
@TransactionAttribute(TransactionAttributeType.SUPPORTS)
public class UsuarioService extends AbstractService<Usuario> {

    @Inject
    private GenericDao<Usuario> dao;

    @Override
    protected GenericDao<Usuario> getDao() {
        return dao;
    }
}
