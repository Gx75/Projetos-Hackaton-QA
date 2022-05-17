#language: pt
#encoding: UTF-8
@desafioMobile
Funcionalidade: Criar e editar listas

  Contexto: fazer login
    Quando inserir o email "desafioqamobile@outlook.com"
    E acionar o botao Sign In
    E inserir a senha "stefaniniQA"
    E acionar o botao Sign In

  @criarLista
  Cenario: criar uma lista
    Quando eu acionar o botao nova lista
    E inserir o titulo "Lista Criada"
    E acionar o botao confirmar
    E acionar o botao voltar
    Entao o sistema devera apresentar a lista com o titulo "Lista Criada"

  @editarLista
  Cenario: editar uma lista
    Quando eu acionar a lista criada
    E acionar o botao titulo
    E inserir o titulo "Lista Editada"
    E acionar o botao confirmar
    E acionar o botao voltar
    Entao o sistema devera apresentar a lista com o titulo "Lista Editada"

  @adicionarItem
  Cenario: adicionar um item a uma lista
    Quando eu acionar a lista editada
    E acionar o botao adicionar item
    E inserir o item "Tarefa 1"
    E acionar o botao adicionar item
    Entao o sistema devera apresentar o item "Tarefa 1"

  @removerItem
  Cenario: remover um item de uma lista
    Quando eu acionar a lista editada
    E acionar o item tarefa 1
    E acionar o botao remover item
    E acionar o botao confirmar
    Entao o sistema devera apresentar a lista sem o item tarefa 1

  @excluirLista @a
  Cenario: excluir uma lista
    Quando eu acionar a lista editada
    E acionar o botao mais opcoes
    E acionar o botao excluir lista
    E acionar o botao confirmar
    Entao o sistema devera excluir a lista editada
