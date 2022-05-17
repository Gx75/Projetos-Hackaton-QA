$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Carrinho.feature");
formatter.feature({
  "name": "Funcionalidades do Carrinho",
  "description": "",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@desafio"
    }
  ]
});
formatter.scenario({
  "name": "remover todos os itens do carrinho",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@desafio"
    },
    {
      "name": "@removerItens"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que eu fiz login no usuario standard",
  "keyword": "Dado "
});
formatter.match({
  "location": "CatalogoSteps.queEuFizLoginNoUsuarioStandard()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu clico no botao Adicionar ao Carrinho do produto \"mochila\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "CommonSteps.euClicoNoBotaoAdicionarAoCarrinhoDoProduto(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu clico no botao Adicionar ao Carrinho do produto \"luz\"",
  "keyword": "E "
});
formatter.match({
  "location": "CommonSteps.euClicoNoBotaoAdicionarAoCarrinhoDoProduto(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu clico no botao Adicionar ao Carrinho do produto \"camiseta preta\"",
  "keyword": "E "
});
formatter.match({
  "location": "CommonSteps.euClicoNoBotaoAdicionarAoCarrinhoDoProduto(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu clico no botao Adicionar ao Carrinho do produto \"jaqueta\"",
  "keyword": "E "
});
formatter.match({
  "location": "CommonSteps.euClicoNoBotaoAdicionarAoCarrinhoDoProduto(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu clico no botao Adicionar ao Carrinho do produto \"macacao\"",
  "keyword": "E "
});
formatter.match({
  "location": "CommonSteps.euClicoNoBotaoAdicionarAoCarrinhoDoProduto(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu clico no botao Adicionar ao Carrinho do produto \"camiseta vermelha\"",
  "keyword": "E "
});
formatter.match({
  "location": "CommonSteps.euClicoNoBotaoAdicionarAoCarrinhoDoProduto(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu aperto no carrinho",
  "keyword": "E "
});
formatter.match({
  "location": "CommonSteps.euApertoNoCarrinho()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu clico no botao Remover do produto \"mochila\"",
  "keyword": "E "
});
formatter.match({
  "location": "CarrinhoSteps.euClicoNoBotaoRemoverDoProduto(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu clico no botao Remover do produto \"luz\"",
  "keyword": "E "
});
formatter.match({
  "location": "CarrinhoSteps.euClicoNoBotaoRemoverDoProduto(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu clico no botao Remover do produto \"camiseta preta\"",
  "keyword": "E "
});
formatter.match({
  "location": "CarrinhoSteps.euClicoNoBotaoRemoverDoProduto(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu clico no botao Remover do produto \"jaqueta\"",
  "keyword": "E "
});
formatter.match({
  "location": "CarrinhoSteps.euClicoNoBotaoRemoverDoProduto(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu clico no botao Remover do produto \"macacao\"",
  "keyword": "E "
});
formatter.match({
  "location": "CarrinhoSteps.euClicoNoBotaoRemoverDoProduto(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu clico no botao Remover do produto \"camiseta vermelha\"",
  "keyword": "E "
});
formatter.match({
  "location": "CarrinhoSteps.euClicoNoBotaoRemoverDoProduto(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o icone do carrinho nao deve apresentar nenhum item dentro do carrinho",
  "keyword": "Entao "
});
formatter.match({
  "location": "CarrinhoSteps.oIconeDoCarrinhoNaoDeveApresentarNenhumItemDentroDoCarrinho()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/Catalogo.feature");
formatter.feature({
  "name": "Marketplace Desafio",
  "description": "",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@desafio"
    }
  ]
});
formatter.scenario({
  "name": "ordenar produtos por menor preco",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@desafio"
    },
    {
      "name": "@ordenarProdutos"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "selecionar a ordem \"Price (low to high)\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "CatalogoSteps.selecionarAOrdem(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o sistema deve apresentar os itens do preco mais baixo para o preco mais alto",
  "keyword": "Entao "
});
formatter.match({
  "location": "CatalogoSteps.oSistemaDeveApresentarOsItensDoPrecoMaisBaixoParaOPrecoMaisAlto()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png", null);
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/Checkout.feature");
formatter.feature({
  "name": "Checkouts",
  "description": "",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@Checkout"
    }
  ]
});
formatter.scenario({
  "name": "cancelando uma compra",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@Checkout"
    },
    {
      "name": "@cancelarCompra"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que eu fiz login no usuario standard",
  "keyword": "Dado "
});
formatter.match({
  "location": "CatalogoSteps.queEuFizLoginNoUsuarioStandard()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu clico no botao Adicionar ao Carrinho do produto \"mochila\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "CommonSteps.euClicoNoBotaoAdicionarAoCarrinhoDoProduto(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu aperto no carrinho",
  "keyword": "E "
});
formatter.match({
  "location": "CommonSteps.euApertoNoCarrinho()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu aperto no botao fazer o check-out",
  "keyword": "E "
});
formatter.match({
  "location": "CheckoutSteps.euApertoNoBotaoFazerOCheckOut()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu preencho o campo \"First Name\" com \"Gabriel\"",
  "keyword": "E "
});
formatter.match({
  "location": "CheckoutSteps.euPreenchoOCampoCom(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu preencho o campo \"Last Name\" com \"Gelatti\"",
  "keyword": "E "
});
formatter.match({
  "location": "CheckoutSteps.euPreenchoOCampoCom(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu preencho o campo \"Postal Code\" com \"1234567\"",
  "keyword": "E "
});
formatter.match({
  "location": "CheckoutSteps.euPreenchoOCampoCom(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu aperto no botao continuar",
  "keyword": "E "
});
formatter.match({
  "location": "CheckoutSteps.euApertoNoBotaoContinuar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu aperto no botao cancelar",
  "keyword": "E "
});
formatter.match({
  "location": "CheckoutSteps.euApertoNoBotaoCancelar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o sistema apresenta a pagina dos produtos",
  "keyword": "Entao "
});
formatter.match({
  "location": "LoginSteps.oSistemaApresentaAPaginaDosProdutos()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded2.png", null);
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "informacao faltando",
  "description": "",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "name": "@informacoesFaltando"
    }
  ]
});
formatter.step({
  "name": "que eu fiz login no usuario standard",
  "keyword": "Dado "
});
formatter.step({
  "name": "eu clico no botao Adicionar ao Carrinho do produto \"mochila\"",
  "keyword": "Quando "
});
formatter.step({
  "name": "eu aperto no carrinho",
  "keyword": "E "
});
formatter.step({
  "name": "eu aperto no botao fazer o check-out",
  "keyword": "E "
});
formatter.step({
  "name": "eu preencho o campo \"\u003ccampo1\u003e\" com \"\u003cinformacao1\u003e\"",
  "keyword": "E "
});
formatter.step({
  "name": "eu preencho o campo \"\u003ccampo2\u003e\" com \"\u003cinformacao2\u003e\"",
  "keyword": "E "
});
formatter.step({
  "name": "eu aperto no botao continuar",
  "keyword": "E "
});
formatter.step({
  "name": "o sistema mostra a mensagem de que o \"\u003ccampoFaltando\u003e\"",
  "keyword": "Entao "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Exemplos",
  "rows": [
    {
      "cells": [
        "campo1",
        "informacao1",
        "campo2",
        "informacao2",
        "campoFaltando"
      ]
    },
    {
      "cells": [
        "Last Name",
        "Gelatti",
        "Postal Code",
        "1234567",
        "First Name"
      ]
    },
    {
      "cells": [
        "First Name",
        "Gabriel",
        "Postal Code",
        "1234567",
        "Last Name"
      ]
    },
    {
      "cells": [
        "First Name",
        "Gabriel",
        "Last Name",
        "Gelatti",
        "Postal Code"
      ]
    }
  ]
});
formatter.scenario({
  "name": "informacao faltando",
  "description": "",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "name": "@Checkout"
    },
    {
      "name": "@informacoesFaltando"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que eu fiz login no usuario standard",
  "keyword": "Dado "
});
formatter.match({
  "location": "CatalogoSteps.queEuFizLoginNoUsuarioStandard()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu clico no botao Adicionar ao Carrinho do produto \"mochila\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "CommonSteps.euClicoNoBotaoAdicionarAoCarrinhoDoProduto(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu aperto no carrinho",
  "keyword": "E "
});
formatter.match({
  "location": "CommonSteps.euApertoNoCarrinho()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu aperto no botao fazer o check-out",
  "keyword": "E "
});
formatter.match({
  "location": "CheckoutSteps.euApertoNoBotaoFazerOCheckOut()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu preencho o campo \"Last Name\" com \"Gelatti\"",
  "keyword": "E "
});
formatter.match({
  "location": "CheckoutSteps.euPreenchoOCampoCom(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu preencho o campo \"Postal Code\" com \"1234567\"",
  "keyword": "E "
});
formatter.match({
  "location": "CheckoutSteps.euPreenchoOCampoCom(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu aperto no botao continuar",
  "keyword": "E "
});
formatter.match({
  "location": "CheckoutSteps.euApertoNoBotaoContinuar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o sistema mostra a mensagem de que o \"First Name\"",
  "keyword": "Entao "
});
formatter.match({
  "location": "CheckoutSteps.oSistemaMostraAMensagemDeQueO(String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded3.png", null);
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "informacao faltando",
  "description": "",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "name": "@Checkout"
    },
    {
      "name": "@informacoesFaltando"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que eu fiz login no usuario standard",
  "keyword": "Dado "
});
formatter.match({
  "location": "CatalogoSteps.queEuFizLoginNoUsuarioStandard()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu clico no botao Adicionar ao Carrinho do produto \"mochila\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "CommonSteps.euClicoNoBotaoAdicionarAoCarrinhoDoProduto(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu aperto no carrinho",
  "keyword": "E "
});
formatter.match({
  "location": "CommonSteps.euApertoNoCarrinho()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu aperto no botao fazer o check-out",
  "keyword": "E "
});
formatter.match({
  "location": "CheckoutSteps.euApertoNoBotaoFazerOCheckOut()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu preencho o campo \"First Name\" com \"Gabriel\"",
  "keyword": "E "
});
formatter.match({
  "location": "CheckoutSteps.euPreenchoOCampoCom(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu preencho o campo \"Postal Code\" com \"1234567\"",
  "keyword": "E "
});
formatter.match({
  "location": "CheckoutSteps.euPreenchoOCampoCom(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu aperto no botao continuar",
  "keyword": "E "
});
formatter.match({
  "location": "CheckoutSteps.euApertoNoBotaoContinuar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o sistema mostra a mensagem de que o \"Last Name\"",
  "keyword": "Entao "
});
formatter.match({
  "location": "CheckoutSteps.oSistemaMostraAMensagemDeQueO(String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded4.png", null);
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "informacao faltando",
  "description": "",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "name": "@Checkout"
    },
    {
      "name": "@informacoesFaltando"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que eu fiz login no usuario standard",
  "keyword": "Dado "
});
formatter.match({
  "location": "CatalogoSteps.queEuFizLoginNoUsuarioStandard()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu clico no botao Adicionar ao Carrinho do produto \"mochila\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "CommonSteps.euClicoNoBotaoAdicionarAoCarrinhoDoProduto(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu aperto no carrinho",
  "keyword": "E "
});
formatter.match({
  "location": "CommonSteps.euApertoNoCarrinho()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu aperto no botao fazer o check-out",
  "keyword": "E "
});
formatter.match({
  "location": "CheckoutSteps.euApertoNoBotaoFazerOCheckOut()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu preencho o campo \"First Name\" com \"Gabriel\"",
  "keyword": "E "
});
formatter.match({
  "location": "CheckoutSteps.euPreenchoOCampoCom(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu preencho o campo \"Last Name\" com \"Gelatti\"",
  "keyword": "E "
});
formatter.match({
  "location": "CheckoutSteps.euPreenchoOCampoCom(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu aperto no botao continuar",
  "keyword": "E "
});
formatter.match({
  "location": "CheckoutSteps.euApertoNoBotaoContinuar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o sistema mostra a mensagem de que o \"Postal Code\"",
  "keyword": "Entao "
});
formatter.match({
  "location": "CheckoutSteps.oSistemaMostraAMensagemDeQueO(String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded5.png", null);
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/Login.feature");
formatter.feature({
  "name": "Realizar logins",
  "description": "",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@logins"
    }
  ]
});
formatter.scenario({
  "name": "fazer login",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@logins"
    },
    {
      "name": "@loginStandard"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "inserir o usuario \"standard_user\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "LoginSteps.inserirOUsuario(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "inserir a senha \"secret_sauce\"",
  "keyword": "E "
});
formatter.match({
  "location": "LoginSteps.inserirASenha(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "apertar no botao LOGIN",
  "keyword": "E "
});
formatter.match({
  "location": "LoginSteps.apertarNoBotaoLOGIN()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o sistema apresenta a pagina dos produtos",
  "keyword": "Entao "
});
formatter.match({
  "location": "LoginSteps.oSistemaApresentaAPaginaDosProdutos()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded6.png", null);
formatter.after({
  "status": "passed"
});
});