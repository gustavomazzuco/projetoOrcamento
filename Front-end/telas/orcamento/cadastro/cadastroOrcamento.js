var app = angular.module('ProjetoOrcamento');
app.controller('OrcamentoCadastroController', function ($scope, $location, $routeParams, OrcamentoService) {

    $scope.salvar = salvar;
    $scope.cancelar = cancelar;

    listar();

    function listar() {
        var id = $routeParams.id;
        if (id) {
            OrcamentoService.getOrcamento(id).then(function (orcamento) {
                $scope.orcamento = orcamento;
            });
        } else {
            cancelar();
        }
    }

    function salvar(orcamento) {
        OrcamentoService.salvar(orcamento).then(function () {
            $location.path('/listar');
        });
    }
    
    function cancelar() {
        $scope.orcamento = {};
    }
});