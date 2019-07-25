var app = angular.module('ProjetoOrcamento');

app.service('ProdutoService', function (ProdutoResource) {

    this.listar = function () {
        return ProdutoResource.listar().$promise;
    };
    this.salvar = function (produto) {
        if (produto.id) {
            return ProdutoResource.atualizar({ id: produto.id }, produto).$promise;
        } else {
            return ProdutoResource.salvar(produto).$promise;
        }
    };
    this.excluir = function (produto) {
        return ProdutoResource.excluir({ id: produto.id }).$promise;
    };

    this.getProduto = function (id) {
        return ProdutoResource.getProduto({ id: id }).$promise;
    };

});

app.factory('ProdutoResource', function ($resource) {

    return $resource('http://localhost:8080/api/produtos/:id', {}, {
        atualizar: {
            method: 'PUT'
        },
        listar: {
            method: 'GET',
            isArray: true
        },
        getProduto: {
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