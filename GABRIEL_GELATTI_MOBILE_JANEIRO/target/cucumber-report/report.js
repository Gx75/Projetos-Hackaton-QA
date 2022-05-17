$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/CriarNota.feature");
formatter.feature({
  "name": "criacao de Notas",
  "description": "",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@CriarNotas"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Contexto"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que eu aciono o allow",
  "keyword": "Dado "
});
formatter.match({
  "location": "CommonSteps.queEuAcionoOAllow()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "que eu aciono o skip",
  "keyword": "E "
});
formatter.match({
  "location": "CommonSteps.queEuAcionoOSkip()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "criar nota tipo texto",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@CriarNotas"
    },
    {
      "name": "@CriarTexto"
    }
  ]
});
formatter.step({
  "name": "eu acionar o botao mais",
  "keyword": "Quando "
});
formatter.match({
  "location": "CriarNotaSteps.euAcionarOBotaoMais()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu selecionar o tipo texto",
  "keyword": "E "
});
formatter.match({
  "location": "CriarNotaSteps.euSelecionarOTipoTexto()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "inserir o titulo \"Titulo\"",
  "keyword": "E "
});
formatter.match({
  "location": "CriarNotaSteps.inserirOTitulo(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "inserir o texto \"Texto\"",
  "keyword": "E "
});
formatter.match({
  "location": "CriarNotaSteps.inserirOTexto(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu apertar no botao confirmar",
  "keyword": "E "
});
formatter.match({
  "location": "CriarNotaSteps.euApertarNoBotaoConfirmar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu apertar no botao voltar",
  "keyword": "E "
});
formatter.match({
  "location": "CriarNotaSteps.euApertarNoBotaoVoltar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "deve ser visivel a nota com o titulo \"Titulo\"",
  "keyword": "Entao "
});
formatter.match({
  "location": "CriarNotaSteps.DeveSerVisivelANotaComOTitulo(String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Contexto"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que eu aciono o allow",
  "keyword": "Dado "
});
formatter.match({
  "location": "CommonSteps.queEuAcionoOAllow()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "que eu aciono o skip",
  "keyword": "E "
});
formatter.match({
  "location": "CommonSteps.queEuAcionoOSkip()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "criar nota tipo lista",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@CriarNotas"
    },
    {
      "name": "@CriarLista"
    }
  ]
});
formatter.step({
  "name": "eu acionar o botao mais",
  "keyword": "Quando "
});
formatter.match({
  "location": "CriarNotaSteps.euAcionarOBotaoMais()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu selecionar o tipo lista",
  "keyword": "E "
});
formatter.match({
  "location": "CriarNotaSteps.euSelecionarOTipoLista()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "inserir o titulo \"Lista\"",
  "keyword": "E "
});
formatter.match({
  "location": "CriarNotaSteps.inserirOTitulo(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "apertar no botao Add Item",
  "keyword": "E "
});
formatter.match({
  "location": "CriarNotaSteps.apertarNoBotaoAddItem()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "inserir \"Item 1\" no campo Add Item",
  "keyword": "E "
});
formatter.match({
  "location": "CriarNotaSteps.inserirNoCampoAddItem(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "apertar no botao next",
  "keyword": "E "
});
formatter.match({
  "location": "CriarNotaSteps.apertarNoBotaoNext()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "inserir \"Item 2\" no campo Add Item",
  "keyword": "E "
});
formatter.match({
  "location": "CriarNotaSteps.inserirNoCampoAddItem(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "apertar no botao next",
  "keyword": "E "
});
formatter.match({
  "location": "CriarNotaSteps.apertarNoBotaoNext()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "inserir \"Item 3\" no campo Add Item",
  "keyword": "E "
});
formatter.match({
  "location": "CriarNotaSteps.inserirNoCampoAddItem(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "apertar no botao ok",
  "keyword": "E "
});
formatter.match({
  "location": "CriarNotaSteps.apertarNoBotaoOk()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu apertar no botao confirmar",
  "keyword": "E "
});
formatter.match({
  "location": "CriarNotaSteps.euApertarNoBotaoConfirmar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a nota deve possuir o titulo \"Lista\" e conter 3 itens",
  "keyword": "Entao "
});
formatter.match({
  "location": "CriarNotaSteps.aNotaDevePossuirOTituloEConterItens(String,Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png", null);
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/EditarNota.feature");
formatter.feature({
  "name": "edicao de notas",
  "description": "",
  "keyword": "Funcionalidade"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Contexto"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que eu aciono o allow",
  "keyword": "Dado "
});
formatter.match({
  "location": "CommonSteps.queEuAcionoOAllow()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "que eu aciono o skip",
  "keyword": "E "
});
formatter.match({
  "location": "CommonSteps.queEuAcionoOSkip()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "mudar cor de uma nota",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@MudarCor"
    }
  ]
});
formatter.step({
  "name": "eu acionar o botao mais",
  "keyword": "Quando "
});
formatter.match({
  "location": "CriarNotaSteps.euAcionarOBotaoMais()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu selecionar o tipo texto",
  "keyword": "E "
});
formatter.match({
  "location": "CriarNotaSteps.euSelecionarOTipoTexto()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "inserir o titulo \"Nota Azul\"",
  "keyword": "E "
});
formatter.match({
  "location": "CriarNotaSteps.inserirOTitulo(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu apertar no botao confirmar",
  "keyword": "E "
});
formatter.match({
  "location": "CriarNotaSteps.euApertarNoBotaoConfirmar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu apertar no botao voltar",
  "keyword": "E "
});
formatter.match({
  "location": "CriarNotaSteps.euApertarNoBotaoVoltar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu selecionar a nota \"Nota Azul\"",
  "keyword": "E "
});
formatter.match({
  "location": "EditarNotaSteps.euSelecionarANota(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu apertar no botao mudar de cor",
  "keyword": "E "
});
formatter.match({
  "location": "EditarNotaSteps.euApertarNoBotaoMudarDeCor()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu selecionar a cor azul",
  "keyword": "E "
});
formatter.match({
  "location": "EditarNotaSteps.euSelecionarACorAzul()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu apertar no botao selecionar cores",
  "keyword": "E "
});
formatter.match({
  "location": "EditarNotaSteps.euApertarNoBotaoSelecionarCores()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu selecionar para mostrar a cor azul",
  "keyword": "E "
});
formatter.match({
  "location": "EditarNotaSteps.euSelecionarParaMostrarACorAzul()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "deve ser visivel a nota com o titulo \"Nota Azul\"",
  "keyword": "Entao "
});
formatter.match({
  "location": "CriarNotaSteps.DeveSerVisivelANotaComOTitulo(String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded2.png", null);
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Contexto"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que eu aciono o allow",
  "keyword": "Dado "
});
formatter.match({
  "location": "CommonSteps.queEuAcionoOAllow()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "que eu aciono o skip",
  "keyword": "E "
});
formatter.match({
  "location": "CommonSteps.queEuAcionoOSkip()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "marcar itens de uma lista como concluidos",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@MarcarItemConcluido"
    }
  ]
});
formatter.step({
  "name": "eu acionar o botao mais",
  "keyword": "Quando "
});
formatter.match({
  "location": "CriarNotaSteps.euAcionarOBotaoMais()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu selecionar o tipo lista",
  "keyword": "E "
});
formatter.match({
  "location": "CriarNotaSteps.euSelecionarOTipoLista()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "inserir o titulo \"Checkmark\"",
  "keyword": "E "
});
formatter.match({
  "location": "CriarNotaSteps.inserirOTitulo(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "apertar no botao Add Item",
  "keyword": "E "
});
formatter.match({
  "location": "CriarNotaSteps.apertarNoBotaoAddItem()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "inserir \"Concluido\" no campo Add Item",
  "keyword": "E "
});
formatter.match({
  "location": "CriarNotaSteps.inserirNoCampoAddItem(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "apertar no botao next",
  "keyword": "E "
});
formatter.match({
  "location": "CriarNotaSteps.apertarNoBotaoNext()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "inserir \"Nao Concluido\" no campo Add Item",
  "keyword": "E "
});
formatter.match({
  "location": "CriarNotaSteps.inserirNoCampoAddItem(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "apertar no botao next",
  "keyword": "E "
});
formatter.match({
  "location": "CriarNotaSteps.apertarNoBotaoNext()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "inserir \"Concluido\" no campo Add Item",
  "keyword": "E "
});
formatter.match({
  "location": "CriarNotaSteps.inserirNoCampoAddItem(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "apertar no botao ok",
  "keyword": "E "
});
formatter.match({
  "location": "CriarNotaSteps.apertarNoBotaoOk()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu apertar no botao confirmar",
  "keyword": "E "
});
formatter.match({
  "location": "CriarNotaSteps.euApertarNoBotaoConfirmar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu marcar o item 1 como concluido",
  "keyword": "E "
});
formatter.match({
  "location": "EditarNotaSteps.euMarcarOItemComoConcluido(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu marcar o item 3 como concluido",
  "keyword": "E "
});
formatter.match({
  "location": "EditarNotaSteps.euMarcarOItemComoConcluido(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "os itens 1 e 3 devem aparecer como concluidos",
  "keyword": "Entao "
});
formatter.match({
  "location": "EditarNotaSteps.osItensEDevemAparecerComoConcluidos(Integer,Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded3.png", null);
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Contexto"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que eu aciono o allow",
  "keyword": "Dado "
});
formatter.match({
  "location": "CommonSteps.queEuAcionoOAllow()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "que eu aciono o skip",
  "keyword": "E "
});
formatter.match({
  "location": "CommonSteps.queEuAcionoOSkip()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "criar um lembrete",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@Lembrete"
    }
  ]
});
formatter.step({
  "name": "eu acionar o botao mais",
  "keyword": "Quando "
});
formatter.match({
  "location": "CriarNotaSteps.euAcionarOBotaoMais()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu selecionar o tipo texto",
  "keyword": "E "
});
formatter.match({
  "location": "CriarNotaSteps.euSelecionarOTipoTexto()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "inserir o titulo \"15 min\"",
  "keyword": "E "
});
formatter.match({
  "location": "CriarNotaSteps.inserirOTitulo(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu apertar no botao confirmar",
  "keyword": "E "
});
formatter.match({
  "location": "CriarNotaSteps.euApertarNoBotaoConfirmar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu apertar no botao voltar",
  "keyword": "E "
});
formatter.match({
  "location": "CriarNotaSteps.euApertarNoBotaoVoltar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu selecionar a nota \"15 min\"",
  "keyword": "E "
});
formatter.match({
  "location": "EditarNotaSteps.euSelecionarANota(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu acionar o botao lembrete",
  "keyword": "E "
});
formatter.match({
  "location": "EditarNotaSteps.euAcionarOBotaoLembrete()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu acionar o botao 15 min",
  "keyword": "E "
});
formatter.match({
  "location": "EditarNotaSteps.euAcionarOBotaoMin(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu acionar o botao pronto",
  "keyword": "E "
});
formatter.match({
  "location": "EditarNotaSteps.euAcionarOBotaoPronto()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o sistema deve mostrar o icone de lembrete ao lado da nota",
  "keyword": "Entao "
});
formatter.match({
  "location": "EditarNotaSteps.oSistemaDeveMostrarOIconeDeLembreteAoLadoDaNota()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded4.png", null);
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/ExcluirNota.feature");
formatter.feature({
  "name": "acoes com lixeira",
  "description": "",
  "keyword": "Funcionalidade"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Contexto"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que eu aciono o allow",
  "keyword": "Dado "
});
formatter.match({
  "location": "CommonSteps.queEuAcionoOAllow()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "que eu aciono o skip",
  "keyword": "E "
});
formatter.match({
  "location": "CommonSteps.queEuAcionoOSkip()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "excluir nota da pagina inicial",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@EnviarParaLixeira"
    }
  ]
});
formatter.step({
  "name": "eu acionar o botao mais",
  "keyword": "Quando "
});
formatter.match({
  "location": "CriarNotaSteps.euAcionarOBotaoMais()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu selecionar o tipo texto",
  "keyword": "E "
});
formatter.match({
  "location": "CriarNotaSteps.euSelecionarOTipoTexto()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "inserir o titulo \"Para a Lixeira\"",
  "keyword": "E "
});
formatter.match({
  "location": "CriarNotaSteps.inserirOTitulo(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu apertar no botao confirmar",
  "keyword": "E "
});
formatter.match({
  "location": "CriarNotaSteps.euApertarNoBotaoConfirmar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu apertar no botao voltar",
  "keyword": "E "
});
formatter.match({
  "location": "CriarNotaSteps.euApertarNoBotaoVoltar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu selecionar a nota \"Para a Lixeira\"",
  "keyword": "E "
});
formatter.match({
  "location": "EditarNotaSteps.euSelecionarANota(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu acionar o botao delete",
  "keyword": "E "
});
formatter.match({
  "location": "ExcluirSteps.euAcionarOBotaoDelete()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu confirmar a exclusao",
  "keyword": "E "
});
formatter.match({
  "location": "ExcluirSteps.euConfirmarAExclusao()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu abrir o menu de acoes adicionais",
  "keyword": "E "
});
formatter.match({
  "location": "ExcluirSteps.euAbrirOMenuDeAcoesAdicionais()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu acionar o botao lixeira",
  "keyword": "E "
});
formatter.match({
  "location": "ExcluirSteps.euAcionarOBotaoLixeira()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o sistema deve apresentar a nota \"Para a Lixeira\"",
  "keyword": "Entao "
});
formatter.match({
  "location": "ExcluirSteps.oSistemaDeveApresentarANota(String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded5.png", null);
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Contexto"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que eu aciono o allow",
  "keyword": "Dado "
});
formatter.match({
  "location": "CommonSteps.queEuAcionoOAllow()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "que eu aciono o skip",
  "keyword": "E "
});
formatter.match({
  "location": "CommonSteps.queEuAcionoOSkip()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "excluir nota permanentemente",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@ExcluirPermanentemente"
    }
  ]
});
formatter.step({
  "name": "eu acionar o botao mais",
  "keyword": "Quando "
});
formatter.match({
  "location": "CriarNotaSteps.euAcionarOBotaoMais()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu selecionar o tipo texto",
  "keyword": "E "
});
formatter.match({
  "location": "CriarNotaSteps.euSelecionarOTipoTexto()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "inserir o titulo \"Nota a ser deletada\"",
  "keyword": "E "
});
formatter.match({
  "location": "CriarNotaSteps.inserirOTitulo(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu apertar no botao confirmar",
  "keyword": "E "
});
formatter.match({
  "location": "CriarNotaSteps.euApertarNoBotaoConfirmar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu apertar no botao voltar",
  "keyword": "E "
});
formatter.match({
  "location": "CriarNotaSteps.euApertarNoBotaoVoltar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu selecionar a nota \"Nota a ser deletada\"",
  "keyword": "E "
});
formatter.match({
  "location": "EditarNotaSteps.euSelecionarANota(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu acionar o botao delete",
  "keyword": "E "
});
formatter.match({
  "location": "ExcluirSteps.euAcionarOBotaoDelete()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu confirmar a exclusao",
  "keyword": "E "
});
formatter.match({
  "location": "ExcluirSteps.euConfirmarAExclusao()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu abrir o menu de acoes adicionais",
  "keyword": "E "
});
formatter.match({
  "location": "ExcluirSteps.euAbrirOMenuDeAcoesAdicionais()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu acionar o botao lixeira",
  "keyword": "E "
});
formatter.match({
  "location": "ExcluirSteps.euAcionarOBotaoLixeira()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu selecionar a nota \"Nota a ser deletada\"",
  "keyword": "E "
});
formatter.match({
  "location": "EditarNotaSteps.euSelecionarANota(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu escolher deletar permanentemente",
  "keyword": "E "
});
formatter.match({
  "location": "ExcluirSteps.euEscolherDeletarPermanentemente()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu apertar Ok",
  "keyword": "E "
});
formatter.match({
  "location": "ExcluirSteps.euApertarOk()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a nota \"Nota a ser deletada\" nao deve se encontrar na lixeira",
  "keyword": "Entao "
});
formatter.match({
  "location": "ExcluirSteps.aNotaNaoDeveSeEncontrarNaLixeira(String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded6.png", null);
formatter.after({
  "status": "passed"
});
});