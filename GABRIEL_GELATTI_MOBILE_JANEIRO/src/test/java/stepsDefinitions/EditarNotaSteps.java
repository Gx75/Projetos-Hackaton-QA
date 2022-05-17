package stepsDefinitions;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.InicialPage;
import pageObjects.NotaPage;

import static org.junit.Assert.assertTrue;
import static utils.Utils.*;

import org.openqa.selenium.By;

public class EditarNotaSteps {
	
	InicialPage inicialPage = new InicialPage(driver);
	NotaPage notaPage = new NotaPage(driver);
	
	@Quando("eu selecionar a nota {string}")
	public void euSelecionarANota(String nota) {
		inicialPage.selecionarNota(nota);
	}

	@Quando("eu apertar no botao mudar de cor")
	public void euApertarNoBotaoMudarDeCor() {
		inicialPage.acionarBotaoColor();
	}

	@Quando("eu selecionar a cor azul")
	public void euSelecionarACorAzul() {
		inicialPage.acionarBotaoCorAzul();
	}

	@Quando("eu apertar no botao selecionar cores")
	public void euApertarNoBotaoSelecionarCores() {
		inicialPage.acionarBotaoSelecionarCor();
	}

	@Quando("eu selecionar para mostrar a cor azul")
	public void euSelecionarParaMostrarACorAzul() {
		inicialPage.selecionarMostrarCorAzul();
	}
	
	@Quando("eu marcar o item {int} como concluido")
	public void euMarcarOItemComoConcluido(Integer item) {
		notaPage.selecionarItem(item);
	}
	
	@Quando("eu acionar o botao lembrete")
	public void euAcionarOBotaoLembrete() {
		inicialPage.acionarBotaoLembrete();
	}

	@Quando("eu acionar o botao {int} min")
	public void euAcionarOBotaoMin(Integer int1) {
		inicialPage.acionarBotao15Min();
	}

	@Quando("eu acionar o botao pronto")
	public void euAcionarOBotaoPronto() {
		inicialPage.acionarBotaoPronto();
	}

	@Entao("os itens {int} e {int} devem aparecer como concluidos")
	public void osItensEDevemAparecerComoConcluidos(Integer item1, Integer item2) {
		assertTrue(driver.findElements(By.id("com.socialnmobile.dictapps.notepad.color.note:id/image")).get(item1-1).isDisplayed() &&
				   driver.findElements(By.id("com.socialnmobile.dictapps.notepad.color.note:id/image")).get(item2-1).isDisplayed());
	}

	@Entao("o sistema deve mostrar o icone de lembrete ao lado da nota")
	public void oSistemaDeveMostrarOIconeDeLembreteAoLadoDaNota() {
	    assertTrue(driver.findElement(By.id("com.socialnmobile.dictapps.notepad.color.note:id/type_image")).isDisplayed());
	}

}
