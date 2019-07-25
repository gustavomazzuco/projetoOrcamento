var app = angular.module('ProjetoOrcamento');
app.controller('ProdutoCadastroController', function ($scope, $location, $routeParams, ProdutoService) {

    $scope.salvar = salvar;
    $scope.cancelar = cancelar;

    listar();

    function listar() {
        
        var id = $routeParams.id;
        if (id) {
            ProdutoService.getProduto(id).then(function (produto) {
                produto.fimOrcamento = new Date(produto.fimOrcamento)
                produto.inicioOrcamento = new Date(produto.inicioOrcamento)
                $scope.produto = produto;
            });
        } else {
            cancelar();
        }
    }

    function salvar(produto) {
        ProdutoService.salvar(produto).then(function () {
            $location.path('/listaProduto');
        });
    }
    
    function cancelar() {
        $scope.produto = {};
    }
});