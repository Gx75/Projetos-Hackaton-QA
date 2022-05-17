#language: pt
#encoding: UTF-8
@conta
Funcionalidade: Testar funcionalidade de contas depois de criadas

  @contaExtrato
  Cenario: ver extrato da conta
    Dado que eu registrei o usuario "usuario" com o email "usuario@email.com" e a senha "senha" com saldo
    Quando eu fazer o login usando "usuario@email.com" e "senha"
    E eu acionar o botao extrato
    Entao o sistema deve apresentar o extrato da conta
    
  @contaLogout
  Cenario: fazer logout
    Dado que eu registrei o usuario "usuario" com o email "usuario@email.com" e a senha "senha" com saldo
    Quando eu fazer o login usando "usuario@email.com" e "senha"
    E eu acionar o botao sair
    Entao o sistema deve apresentar a pagina de login
    
  @contaSaque
  Cenario: tentar abrir a ferramenta saque
    Dado que eu registrei o usuario "usuario" com o email "usuario@email.com" e a senha "senha" com saldo
    Quando eu fazer o login usando "usuario@email.com" e "senha"
    E eu acionar o botao saque
    Entao o sistema deve apresentar a mensagem "Funcionalidade em desenvolvimento"
    
  @contaPagamentos
  Cenario: tentar abrir a ferramenta pagamentos
    Dado que eu registrei o usuario "usuario" com o email "usuario@email.com" e a senha "senha" com saldo
    Quando eu fazer o login usando "usuario@email.com" e "senha"
    E eu acionar o botao pagamentos
    Entao o sistema deve apresentar a mensagem "Funcionalidade em desenvolvimento"

  @contaTransferenciaSucesso
  Cenario: transferencia com sucesso
    Dado que eu registrei o usuario "usuario1" com o email "email1@email.com" e a senha "senha1" com saldo
    E que eu registrei o usuario "usuario2" com o email "email2@email.com" e a senha "senha2" sem saldo
    Quando eu fazer o login usando "email1@email.com" e "senha1"
    E eu acionar o botao transferencia
    E eu informar o numero da conta 2
    E eu informar o digito da conta 2
    E eu informar o valor "123"
    E eu acionar o botao transferir agora
    Entao o sistema deve apresentar a mensagem transferencia realizada com sucesso

  @contaTransferenciaSaldoInsuficiente
  Cenario: tentativa de transferencia com saldo insuficiente
    Dado que eu registrei o usuario "usuario1" com o email "email1@email.com" e a senha "senha1" sem saldo
    E que eu registrei o usuario "usuario2" com o email "email2@email.com" e a senha "senha2" sem saldo
    Quando eu fazer o login usando "email1@email.com" e "senha1"
    E eu acionar o botao transferencia
    E eu informar o numero da conta 2
    E eu informar o digito da conta 2
    E eu informar o valor "123"
    E eu acionar o botao transferir agora
    Entao o sistema deve apresentar a mensagem saldo insuficiente
    

  @contaTransferenciaChecarSaldo
  Cenario: checagem de saldo apos transferencia
    Dado que eu registrei o usuario "usuario1" com o email "email1@email.com" e a senha "senha1" com saldo
    E que eu registrei o usuario "usuario2" com o email "email2@email.com" e a senha "senha2" sem saldo
    Quando eu fazer o login usando "email1@email.com" e "senha1"
    E eu acionar o botao transferencia
    E eu informar o numero da conta 2
    E eu informar o digito da conta 2
    E eu informar o valor "123"
    E eu acionar o botao transferir agora
    E eu acionar o botao fechar
    E eu acionar o botao voltar
    E eu acionar o botao extrato
		Entao o sistema deve mostrar o saldo como "R$ 877,00"
    

  @contaTransferenciaChecarSaldoRecipiente
  Cenario: checagem de saldo do recipiente apos transferencia
    Dado que eu registrei o usuario "usuario1" com o email "email1@email.com" e a senha "senha1" com saldo
    E que eu registrei o usuario "usuario2" com o email "email2@email.com" e a senha "senha2" sem saldo
    Quando eu fazer o login usando "email1@email.com" e "senha1"
    E eu acionar o botao transferencia
    E eu informar o numero da conta 2
    E eu informar o digito da conta 2
    E eu informar o valor "123"
    E eu acionar o botao transferir agora
    E eu acionar o botao fechar
    E eu acionar o botao voltar
    E eu acionar o botao sair
    E eu fazer o login usando "email2@email.com" e "senha2"
    E eu acionar o botao extrato
		Entao o sistema deve mostrar o saldo como "R$ 123,00"
    

  @contaTransferenciaDescricao 
  Cenario: transferencia com descricao
    Dado que eu registrei o usuario "usuario1" com o email "email1@email.com" e a senha "senha1" com saldo
    E que eu registrei o usuario "usuario2" com o email "email2@email.com" e a senha "senha2" sem saldo
    Quando eu fazer o login usando "email1@email.com" e "senha1"
    E eu acionar o botao transferencia
    E eu informar o numero da conta 2
    E eu informar o digito da conta 2
    E eu informar o valor "123"
    E eu informar a descricao "Isso eh uma descricao"
    E eu acionar o botao transferir agora
    E eu acionar o botao fechar
    E eu acionar o botao voltar
    E eu acionar o botao extrato
    Entao o sistema deve apresentar uma transferencia com a descricao "Isso eh uma descricao"