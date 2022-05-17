#language: pt
#encoding: UTF-8
@login
Funcionalidade: Testar a realizacao do login e suas possiveis falhas

  @loginSucesso
  Cenario: login efetuado com sucesso
    Dado que eu registrei o usuario "gabriel" com o email "gabriel@email.com" e a senha "senha" com saldo
    Quando eu informar o email "gabriel@email.com"
    E eu informar a senha "senha"
    E eu clicar no botao acessar
    Entao o sistema apresenta a mensagem bem vindo ao bugbank

  @loginEmailInvalido
  Cenario: tentativa de login com email invalido
    Quando eu informar o email "robson"
    Entao o sistema apresenta a mensagem formato invalido

  @loginEmailFaltando
  Cenario: tentativa de login com email faltando
    E eu informar a senha "senha"
    E eu clicar no botao acessar
    Entao o sistema apresenta a mensagem campo obrigatorio

  @loginSenhaFaltando
  Cenario: tentativa de login com senha faltando
    Quando eu informar o email "gabriel@email.com"
    E eu clicar no botao acessar
    Entao o sistema apresenta a mensagem campo obrigatorio
    
  @loginCredenciaisInvalidas
  Cenario: tentativa de login com credenciais invalidas
    Quando eu informar o email "gabriel@email.com"
    E eu informar a senha "senha"
    E eu clicar no botao acessar
    Entao o sistema apresenta a mensagem de credenciais invalidas
