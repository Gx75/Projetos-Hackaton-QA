#language: pt
#encoding: UTF-8


Funcionalidade: acoes com lixeira

Contexto:
	Dado que eu aciono o allow
	E que eu aciono o skip

	@EnviarParaLixeira
	Cenario: excluir nota da pagina inicial
		Quando eu acionar o botao mais
		E eu selecionar o tipo texto
		E inserir o titulo "Para a Lixeira"
		E eu apertar no botao confirmar
		E eu apertar no botao voltar
		E eu selecionar a nota "Para a Lixeira"
		E eu acionar o botao delete
		E eu confirmar a exclusao
		E eu abrir o menu de acoes adicionais
		E eu acionar o botao lixeira
		Entao o sistema deve apresentar a nota "Para a Lixeira"

	@ExcluirPermanentemente
	Cenario: excluir nota permanentemente
		Quando eu acionar o botao mais
		E eu selecionar o tipo texto
		E inserir o titulo "Nota a ser deletada"
		E eu apertar no botao confirmar
		E eu apertar no botao voltar
		E eu selecionar a nota "Nota a ser deletada"
		E eu acionar o botao delete
		E eu confirmar a exclusao
		E eu abrir o menu de acoes adicionais
		E eu acionar o botao lixeira
		E eu selecionar a nota "Nota a ser deletada"
		E eu escolher deletar permanentemente
		E eu apertar Ok
		Entao a nota "Nota a ser deletada" nao deve se encontrar na lixeira
		