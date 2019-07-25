var app = angular.module('ProjetoOrcamento');

app.config(function ($routeProvider) {
    $routeProvider
        .when('/cadProduto', {
            templateUrl: 'telas/produto/cadastro/cadastroProduto.html',
            controller: 'ProdutoCadastroController'
        })
        .when('/produto/:id', {
            templateUrl: 'telas/produto/cadastro/cadastroProduto.html',
            controller: 'ProdutoCadastroController'
        })
        .when('/listaProduto', {
            templateUrl: 'telas/produto/lista/listaProduto.html',
            controller: 'ProdutoListaController'
        })
        .when('/cadOrcamento', {
            templateUrl: 'telas/orcamento/cadastro/cadastroOrcamento.html',
            controller: 'OrcamentoCadastroController',
        })
        
        .when('/orcamento/:id', {
            templateUrl: 'telas/orcamento/cadastro/cadastroOrcamento.html',
            controller: 'OrcamentoCadastroController'
        })
        .when('/listaOrcamento', {
            templateUrl: 'telas/orcamento/lista/listaOrcamento.html',
            controller: 'OrcamentoListaController',
        })
        .when('/login', {
            templateUrl:'telas/login/login.html'
        })
        .when('/usuario', {
            templateUrl:'telas/usuario/cadastro/cadastroUsuario.html',
            controller: 'UsuarioCadastroController'
        })
        .otherwise("/login");
});