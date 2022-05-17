#language: pt
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

  @registrarEmailInvalido
  Cenario: tentativa de registro com email invalido
    Dado que eu estou acessando a pagina de registro
    Quando eu registrar o email "robson"
    Entao o sistema apresenta o aviso "Formato inválido"

  @registroSenhasDiferentes
  Cenario: tentativa de registro com senhas diferentes
    Dado que eu estou acessando a pagina de registro
    Quando eu registrar o email "email@email.com"
    E eu registrar o nome "Nome"
    E eu registrar a senha "senha"
    E eu confirmar a senha "robson"
    E eu clicar no botao cadastrar
    Entao o sistema apresenta a mensagem "As senhas não são iguais."

  @registrarEmailFaltando
  Cenario: tentativa de registro com email faltando
    Dado que eu estou acessando a pagina de registro
    Quando eu registrar o nome "Nome"
    E eu registrar a senha "senha"
    E eu confirmar a senha "senha"
    E eu clicar no botao cadastrar
    Entao o sistema apresenta o aviso "É campo obrigatório"

  @registrarNomeFaltando
  Cenario: tentativa de registro com nome faltando
    Dado que eu estou acessando a pagina de registro
    Quando eu registrar o email "email@email.com"
    E eu registrar a senha "senha"
    E eu confirmar a senha "senha"
    E eu clicar no botao cadastrar
    Entao o sistema apresenta a mensagem "Nome não pode ser vazio."

  @registrarSenhaFaltando
  Cenario: tentativa de registro com senha faltando
    Dado que eu estou acessando a pagina de registro
    Quando eu registrar o email "email@email.com"
    E eu registrar o nome "Nome"
    E eu confirmar a senha "senha"
    E eu clicar no botao cadastrar
    Entao o sistema apresenta o aviso "É campo obrigatório"

  @registrarConfirmacaoSenhaFaltando
  Cenario: tentativa de registro com confirmacao de senha faltando
    Dado que eu estou acessando a pagina de registro
    Quando eu registrar o email "email@email.com"
    E eu registrar o nome "Nome"
    E eu registrar a senha "senha"
    E eu clicar no botao cadastrar
    Entao o sistema apresenta o aviso "É campo obrigatório"