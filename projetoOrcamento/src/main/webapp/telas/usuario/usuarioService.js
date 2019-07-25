var app = angular.module('ProjetoOrcamento');

app.service('UsuarioService', function (UsuarioResource) {

    this.listar = function () {
        return UsuarioResource.listar().$promise;
    };
    this.salvar = function (usuario) {
        if (usuario.id) {
            return UsuarioResource.atualizar({ id: usuario.id }, usuario).$promise;
        } else {
            return UsuarioResource.salvar(usuario).$promise;
        }
    };
    this.excluir = function (usuario) {
        return UsuarioResource.excluir({ id: usuario.id }).$promise;
    };

    this.getUsuario = function (id) {
        return UsuarioResource.getUsuario({ id: id }).$promise;
    };

});

app.factory('UsuarioResource', function ($resource) {

    return $resource('http://localhost:8080/api/usuarios/:id', {}, {
        atualizar: {
            method: 'PUT'
        },
        listar: {
            method: 'GET',
            isArray: true
        },
        getUsuario: {
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