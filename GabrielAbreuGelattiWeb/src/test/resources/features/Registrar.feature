#language: pt
#encoding: UTF-8
@registro
Funcionalidade: Testar a realizacao do registro e suas possiveis falhas

  @registroSucesso
  Cenario: registro efetuado com sucesso
    Dado que eu estou acessando a pagina de registro
    Quando eu registrar o email "email@email.com"
    E eu registrar o nome "Nome"
    E eu registrar a senha "senha"
    E eu confirmar a senha "senha"
    E eu clicar no botao cadastrar
    Entao o sistema apresenta a mensagem que a conta foi criada com sucesso

  @registroSucessoSemSaldo
  Cenario: registro efetuado sem saldo e verificacao do extrato
    Dado que eu estou acessando a pagina de registro
    Quando eu registrar o email "email@email.com"
    E eu registrar o nome "Nome"
    E eu registrar a senha "senha"
    E eu confirmar a senha "senha"
    E eu desativo o botao criar conta com saldo
    E eu clicar no botao cadastrar
    E eu acionar o botao fechar
    E eu fazer o login usando "email@email.com" e "senha"
    E eu acionar o botao extrato
    Entao o sistema deve apresentar a mensagem cliente optou por nao ter saldo ao abrir conta
    E o sistema deve mostrar o saldo como "R$ 0,00"

  @registroSucessoComSaldo
  Cenario: registro efetuado com saldo e verificacao do extrato
    Dado que eu estou acessando a pagina de registro
    Quando eu registrar o email "email@email.com"
    E eu registrar o nome "Nome"
    E eu registrar a senha "senha"
    E eu confirmar a senha "senha"
    E eu ativo o botao criar conta com saldo
    E eu clicar no botao cadastrar
    E eu acionar o botao fechar
    E eu fazer o login usando "email@email.com" e "senha"
    E eu acionar o botao extrato
    Entao o sistema deve apresentar a mensagem que o saldo foi adicionado ao abrir a conta
    E o sistema deve mostrar o saldo como "R$ 1.000,00"

  @registrarEmailInvalido
  Cenario: tentativa de registro com email invalido
    Dado que eu estou acessando a pagina de registro
    Quando eu registrar o email "robson"
    Entao o sistema apresenta a mensagem formato invalido

  @registroSenhasDiferentes
  Cenario: tentativa de registro com senhas diferentes
    Dado que eu estou acessando a pagina de registro
    Quando eu registrar o email "email@email.com"
    E eu registrar o nome "Nome"
    E eu registrar a senha "senha"
    E eu confirmar a senha "robson"
    E eu clicar no botao cadastrar
    Entao o sistema apresenta a mensagem as senhas nao sao iguais

  @registrarEmailFaltando
  Cenario: tentativa de registro com email faltando
    Dado que eu estou acessando a pagina de registro
    Quando eu registrar o nome "Nome"
    E eu registrar a senha "senha"
    E eu confirmar a senha "senha"
    E eu clicar no botao cadastrar
    Entao o sistema apresenta a mensagem campo obrigatorio

  @registrarNomeFaltando
  Cenario: tentativa de registro com nome faltando
    Dado que eu estou acessando a pagina de registro
    Quando eu registrar o email "email@email.com"
    E eu registrar a senha "senha"
    E eu confirmar a senha "senha"
    E eu clicar no botao cadastrar
    Entao o sistema apresenta a mensagem nome nao pode ser vazio

  @registrarSenhaFaltando
  Cenario: tentativa de registro com senha faltando
    Dado que eu estou acessando a pagina de registro
    Quando eu registrar o email "email@email.com"
    E eu registrar o nome "Nome"
    E eu confirmar a senha "senha"
    E eu clicar no botao cadastrar
    Entao o sistema apresenta a mensagem campo obrigatorio

  @registrarConfirmacaoSenhaFaltando
  Cenario: tentativa de registro com confirmacao de senha faltando
    Dado que eu estou acessando a pagina de registro
    Quando eu registrar o email "email@email.com"
    E eu registrar o nome "Nome"
    E eu registrar a senha "senha"
    E eu clicar no botao cadastrar
    Entao o sistema apresenta a mensagem campo obrigatorio