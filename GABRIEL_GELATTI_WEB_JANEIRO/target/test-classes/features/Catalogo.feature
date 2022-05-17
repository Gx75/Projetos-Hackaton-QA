#language: pt
#encoding: UTF-8

@desafio
Funcionalidade: Marketplace Desafio
  
  @ordenarProdutos
  Cenario: ordenar produtos por menor preco
  	Quando selecionar a ordem "Price (low to high)"
  	Entao o sistema deve apresentar os itens do preco mais baixo para o preco mais alto
  		
