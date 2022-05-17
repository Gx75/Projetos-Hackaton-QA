package stepsDefinitions;

import static org.junit.Assert.assertTrue;
import static utils.Utils.Na;
import static utils.Utils.driver;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.CarrinhoPage;
import pageObjects.DadosPage;

public class CheckoutSteps {

	@Quando("eu aperto no botao fazer o check-out")
	public void euApertoNoBotaoFazerOCheckOut() {
		Na(CarrinhoPage.class).clicarBotaoCheckout();
	}

	@Quando("eu preencho o campo {string} com {string}")
	public void euPreenchoOCampoCom(String campo, String informacao) {
		if (campo.equals("First Name")) {
			Na(DadosPage.class).informarCampoFirstName(informacao);
		} else if (campo.equals("Last Name")) {
			Na(DadosPage.class).informarCampoLastName(informacao);
		} else if (campo.equals("Postal Code")) {
			Na(DadosPage.class).informarCampoPostalCode(informacao);
		}
	}

	@Quando("eu aperto no botao continuar")
	public void euApertoNoBotaoContinuar() {
		Na(DadosPage.class).clicarBotaoContinue();
	}
	
	@Entao("o sistema mostra a mensagem de que o {string}")
	public void oSistemaMostraAMensagemDeQueO(String campoFaltando) {
		System.out.println("//button[@class=\"error-button\"][text()='Error: " + campoFaltando + " is required']");
		assertTrue(driver.findElement(By.xpath("//h3[@data-test=\"error\"][text()='Error: " + campoFaltando + " is required']")).isDisplayed());
	}

	@Quando("eu aperto no botao cancelar")
	public void euApertoNoBotaoCancelar() {
		Na(DadosPage.class).clicarBotaoCancelar();
	}

}
