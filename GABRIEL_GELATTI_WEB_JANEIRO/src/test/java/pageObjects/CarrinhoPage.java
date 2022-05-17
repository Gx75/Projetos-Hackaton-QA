package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CarrinhoPage {
	
	@FindBy(name = "remove-sauce-labs-backpack")
	private WebElement botaoRemoverMochila;
	
	@FindBy(name = "remove-sauce-labs-bike-light")
	private WebElement botaoRemoverLuz;
	
	@FindBy(name = "remove-sauce-labs-bolt-t-shirt")
	private WebElement botaoRemoverCamisetaPreta;
	
	@FindBy(name = "remove-sauce-labs-fleece-jacket")
	private WebElement botaoRemoverJaqueta;
	
	@FindBy(name = "remove-sauce-labs-onesie")
	private WebElement botaoRemoverMacacao;
	
	@FindBy(name = "remove-test.allthethings()-t-shirt-(red)")
	private WebElement botaoRemoverCamisetaVermelha;
	
	@FindBy(name = "checkout")
	private WebElement botaoCheckout;

	public void removerMochila() {
		botaoRemoverMochila.click();
	}

	public void removerLuz() {
		botaoRemoverLuz.click();
	}

	public void removerCamisetaPreta() {
		botaoRemoverCamisetaPreta.click();
	}

	public void removerJaqueta() {
		botaoRemoverJaqueta.click();
	}

	public void removerMacacao() {
		botaoRemoverMacacao.click();
	}

	public void removerCamisetaVermelha() {
		botaoRemoverCamisetaVermelha.click();
	}

	public void clicarBotaoCheckout() {
		botaoCheckout.click();
	}

}
