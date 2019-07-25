var app = angular.module('ProjetoOrcamento');
app.controller('OrcamentoListaController', function ($scope, $location, OrcamentoService) {

    $scope.orcamento = [];

    $scope.editar = editar;
    $scope.excluir = excluir;

    listar();

    function listar() {
        OrcamentoService.listar().then(function (orcamentos) {
            $scope.orcamentos = orcamentos;
        });
    }
    
    function editar(orcamento) {
        $location.path('/orcamento/' + orcamento.id);
    }

    function excluir(orcamento) {
        OrcamentoService.excluir(orcamento).then(listar);
    }
    
});

