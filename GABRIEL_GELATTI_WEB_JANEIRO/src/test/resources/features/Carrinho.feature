#language: pt
#encoding: UTF-8

@desafio
Funcionalidade: Funcionalidades do Carrinho
  
  @removerItens
  Cenario: remover todos os itens do carrinho
  	Dado que eu fiz login no usuario standard
  	Quando eu clico no botao Adicionar ao Carrinho do produto "mochila"
  	E eu clico no botao Adicionar ao Carrinho do produto "luz"
  	E eu clico no botao Adicionar ao Carrinho do produto "camiseta preta"
  	E eu clico no botao Adicionar ao Carrinho do produto "jaqueta"
  	E eu clico no botao Adicionar ao Carrinho do produto "macacao"
  	E eu clico no botao Adicionar ao Carrinho do produto "camiseta vermelha"
  	E eu aperto no carrinho
  	E eu clico no botao Remover do produto "mochila"
  	E eu clico no botao Remover do produto "luz"
  	E eu clico no botao Remover do produto "camiseta preta"
  	E eu clico no botao Remover do produto "jaqueta"
  	E eu clico no botao Remover do produto "macacao"
  	E eu clico no botao Remover do produto "camiseta vermelha"
  	Entao o icone do carrinho nao deve apresentar nenhum item dentro do carrinho