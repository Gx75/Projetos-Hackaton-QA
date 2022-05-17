#language: pt
#encoding: UTF-8

@logins
Funcionalidade: Realizar logins

  @loginStandard
  Cenario: fazer login
  	Quando inserir o usuario "standard_user"
  	E inserir a senha "secret_sauce"
  	E apertar no botao LOGIN
  	Entao o sistema apresenta a pagina dos produtos