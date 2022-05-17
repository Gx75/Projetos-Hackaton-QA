package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DadosPage {
	
	@FindBy(name = "firstName")
	private WebElement campoFirstName;
	
	@FindBy(name = "lastName")
	private WebElement campoLastName;
	
	@FindBy(name = "postalCode")
	private WebElement campoPostalCode;
	
	@FindBy(name = "continue")
	private WebElement botaoContinue;
	
	@FindBy(name = "cancel")
	private WebElement botaoCancelar;

	public void informarCampoFirstName(String firstName) {
		campoFirstName.sendKeys(firstName);
	}

	public void informarCampoLastName(String lastName) {
		campoLastName.sendKeys(lastName);
	}

	public void informarCampoPostalCode(String postalCode) {
		campoPostalCode.sendKeys(postalCode);
	}
	
	public void clicarBotaoContinue() {
		botaoContinue.click();
	}
	
	public void clicarBotaoCancelar() {
		botaoCancelar.click();
	}

}
