var app = angular.module('ProjetoOrcamento');

app.service('OrcamentoService', function (OrcamentoResource) {

    this.listar = function () {
        return OrcamentoResource.listar().$promise;
    };

    this.listarProduto = function () {
        return ProdutoResource.listar().$promise;
    };

    this.listarUsuario = function () {
        return UsuarioResource.listar().$promise;
    };

    this.salvar = function (orcamento) {
        if (orcamento.id) {
            return OrcamentoResource.atualizar({ id: orcamento.id }, orcamento).$promise;
        } else {
            return OrcamentoResource.salvar(orcamento).$promise;
        }
    };
    this.excluir = function (orcamento) {
        return OrcamentoResource.excluir({ id: orcamento.id }).$promise;
    };

    this.getOrcamento = function (id) {
        return OrcamentoResource.getOrcamento({ id: id }).$promise;
    };

});

app.factory('OrcamentoResource', function ($resource) {

    return $resource('http://localhost:8080/api/orcamentos/:id', {}, {
        atualizar: {
            method: 'PUT'
        },
        listar: {
            method: 'GET',
            isArray: true
        },
        getOrcamento: {
            method: 'GET'
        },
        salvar: {
            method: 'POST'
        },
        excluir: {
            method: 'DELETE'
        }
    });
});