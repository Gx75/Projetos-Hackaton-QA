#language: pt
#encoding: UTF-8

@CriarNotas
Funcionalidade: criacao de Notas

Contexto:
	Dado que eu aciono o allow
	E que eu aciono o skip

	@CriarTexto
	Cenario: criar nota tipo texto
		Quando eu acionar o botao mais
		E eu selecionar o tipo texto
		E inserir o titulo "Titulo"
		E inserir o texto "Texto"
		E eu apertar no botao confirmar
		E eu apertar no botao voltar
		Entao deve ser visivel a nota com o titulo "Titulo"

	@CriarLista
	Cenario: criar nota tipo lista
		Quando eu acionar o botao mais
		E eu selecionar o tipo lista
		E inserir o titulo "Lista"
		E apertar no botao Add Item
		E inserir "Item 1" no campo Add Item
		E apertar no botao next
		E inserir "Item 2" no campo Add Item
		E apertar no botao next
		E inserir "Item 3" no campo Add Item
		E apertar no botao ok
		E eu apertar no botao confirmar
		Entao a nota deve possuir o titulo "Lista" e conter 3 itens