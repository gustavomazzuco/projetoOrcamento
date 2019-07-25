var app = angular.module('ProjetoOrcamento');
app.controller('ProdutoListaController', function ($scope, $location, ProdutoService) {

    $scope.produto = [];

    $scope.editar = editar;
    $scope.excluir = excluir;

    listar();

    function listar() {
        ProdutoService.listar().then(function (produtos) {
            $scope.produtos = produtos;
        });
    }
    
    function editar(produto) {
        $location.path('/produto/' + produto.id);
    }

    function excluir(produto) {
        ProdutoService.excluir(produto).then(listar);
    }
    
});

