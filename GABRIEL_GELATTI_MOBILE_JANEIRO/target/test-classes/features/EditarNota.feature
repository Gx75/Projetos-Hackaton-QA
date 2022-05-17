#language: pt
#encoding: UTF-8


Funcionalidade: edicao de notas 

Contexto:
	Dado que eu aciono o allow
	E que eu aciono o skip

	@MudarCor
	Cenario: mudar cor de uma nota
		Quando eu acionar o botao mais
		E eu selecionar o tipo texto
		E inserir o titulo "Nota Azul"
		E eu apertar no botao confirmar
		E eu apertar no botao voltar
		E eu selecionar a nota "Nota Azul"
		E eu apertar no botao mudar de cor
		E eu selecionar a cor azul
		E eu apertar no botao selecionar cores
		E eu selecionar para mostrar a cor azul
		Entao deve ser visivel a nota com o titulo "Nota Azul"
	
	@MarcarItemConcluido
	Cenario: marcar itens de uma lista como concluidos
		Quando eu acionar o botao mais
		E eu selecionar o tipo lista
		E inserir o titulo "Checkmark"
		E apertar no botao Add Item
		E inserir "Concluido" no campo Add Item
		E apertar no botao next
		E inserir "Nao Concluido" no campo Add Item
		E apertar no botao next
		E inserir "Concluido" no campo Add Item
		E apertar no botao ok
		E eu apertar no botao confirmar
		E eu marcar o item 1 como concluido
		E eu marcar o item 3 como concluido
		Entao os itens 1 e 3 devem aparecer como concluidos

	@Lembrete
	Cenario: criar um lembrete
		Quando eu acionar o botao mais
		E eu selecionar o tipo texto
		E inserir o titulo "15 min"
		E eu apertar no botao confirmar
		E eu apertar no botao voltar
		E eu selecionar a nota "15 min"
		E eu acionar o botao lembrete
		E eu acionar o botao 15 min
		E eu acionar o botao pronto
		Entao o sistema deve mostrar o icone de lembrete ao lado da nota
		
		
	
		