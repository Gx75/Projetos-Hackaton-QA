package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	@FindBy(xpath = "//button[text()='Registrar']")
	private WebElement botaoRegistrar;
	
	@FindBy(name = "email")
	private WebElement campoEmail;
	
	@FindBy(name = "password")
	private WebElement campoSenha;
	
	@FindBy(xpath = "//button[text()='Acessar']")
	private WebElement botaoAcessar;

	public void acionarBotaoRegistrar() {
		botaoRegistrar.click();
	}

	public void informarCampoEmail(String email) {
		campoEmail.sendKeys(email);
	}

	public void informarCampoSenha(String senha) {
		campoSenha.sendKeys(senha);
	}
	
	public void acionarBotaoAcessar() {
		botaoAcessar.click();
	}
	
	public void fazerLogin(String email, String senha) {
		campoEmail.sendKeys(email);
		campoSenha.sendKeys(senha);
		botaoAcessar.click();
	}

}
