package stepsDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import pageObjects.InicialPage;

import static utils.Utils.*;

public class CommonSteps {
	
	InicialPage inicialPage = new InicialPage(driver);
	
	@Dado("que eu aciono o allow")
	public void queEuAcionoOAllow(){
		inicialPage.acionarBotaoAllow();
	}
	@Dado("que eu aciono o skip")
	public void queEuAcionoOSkip() {
		inicialPage.acionarBotaoSkip();
	}

}
