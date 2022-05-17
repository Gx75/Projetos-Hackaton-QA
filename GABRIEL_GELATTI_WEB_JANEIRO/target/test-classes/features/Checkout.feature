#language: pt
#encoding: UTF-8

@Checkout
Funcionalidade: Checkouts

  
  @cancelarCompra
  Cenario: cancelando uma compra
  	Dado que eu fiz login no usuario standard
  	Quando eu clico no botao Adicionar ao Carrinho do produto "mochila"
  	E eu aperto no carrinho
  	E eu aperto no botao fazer o check-out
  	E eu preencho o campo "First Name" com "Gabriel"
  	E eu preencho o campo "Last Name" com "Gelatti"
  	E eu preencho o campo "Postal Code" com "1234567"
  	E eu aperto no botao continuar
  	E eu aperto no botao cancelar
  	Entao o sistema apresenta a pagina dos produtos
  	
  
  @informacoesFaltando
  Esquema do Cenario: informacao faltando
  
  	Dado que eu fiz login no usuario standard
  	Quando eu clico no botao Adicionar ao Carrinho do produto "mochila"
  	E eu aperto no carrinho
  	E eu aperto no botao fazer o check-out
  	E eu preencho o campo "<campo1>" com "<informacao1>"
  	E eu preencho o campo "<campo2>" com "<informacao2>"
  	E eu aperto no botao continuar
  	Entao o sistema mostra a mensagem de que o "<campoFaltando>"
  	
   	Exemplos:
  		|campo1    |informacao1|campo2     |informacao2|campoFaltando|
  		|Last Name |Gelatti    |Postal Code|1234567    |First Name   |
  		|First Name|Gabriel    |Postal Code|1234567    |Last Name    |
  		|First Name|Gabriel    |Last Name  |Gelatti    |Postal Code  |