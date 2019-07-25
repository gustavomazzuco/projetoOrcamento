var app = angular.module('ProjetoOrcamento');
app.controller('UsuarioCadastroController', function ($scope, $location, $routeParams, UsuarioService) {

    $scope.salvar = salvar;
    $scope.cancelar = cancelar;

    listar();

    function listar() {
        var id = $routeParams.id;
        if (id) {
            UsuarioService.getUsuario(id).then(function (usuario) {
                $scope.usuario = usuario;
            });
        } else {
            cancelar();
        }
    }

    function salvar(usuario) {
        UsuarioService.salvar(usuario).then(function () {
            $location.path('/login');
        });
    }
    
    function cancelar() {
        $scope.usuario = {id: '', nome: '', usuario: '', senha: '', telefone: '', email: ''};
    }
});