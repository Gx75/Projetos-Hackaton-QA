package stepsDefinitions;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

import pageObjects.LixeiraPage;
import pageObjects.InicialPage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utils.Utils.*;

import org.openqa.selenium.By;

public class ExcluirSteps {
	
	LixeiraPage lixeiraPage = new LixeiraPage(driver);
	InicialPage inicialPage = new InicialPage(driver);
	
	@Quando("eu acionar o botao delete")
	public void euAcionarOBotaoDelete() {
		inicialPage.acionarBotaoDelete();
	}

	@Quando("eu confirmar a exclusao")
	public void euConfirmarAExclusao() {
		inicialPage.acionarBotaoOk();
	}

	@Quando("eu abrir o menu de acoes adicionais")
	public void euAbrirOMenuDeAcoesAdicionais() {
		inicialPage.acionarBotaoMenu();
	}

	@Quando("eu acionar o botao lixeira")
	public void euAcionarOBotaoLixeira() {
		inicialPage.selecionarLixeira();
	}

	@Quando("eu escolher deletar permanentemente")
	public void euEscolherDeletarPermanentemente() {
		lixeiraPage.acionarBotaoDeletarPermanentemente();
	}

	@Quando("eu apertar Ok")
	public void euApertarOk() {
		lixeiraPage.acionarBotaoOk();
	}

	@Entao("o sistema deve apresentar a nota {string}")
	public void oSistemaDeveApresentarANota(String nota) {
		assertEquals(nota, driver.findElement(By.id("com.socialnmobile.dictapps.notepad.color.note:id/title")).getText());
		
	}

	@Entao("a nota {string} nao deve se encontrar na lixeira")
	public void aNotaNaoDeveSeEncontrarNaLixeira(String nota) {
		assertTrue(driver.findElements(By.xpath("//android.widget.TextView[@text='" + nota + "']")).isEmpty());
	}
}
