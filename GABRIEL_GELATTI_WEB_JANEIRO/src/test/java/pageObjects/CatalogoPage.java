package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import static utils.Utils.*;

public class CatalogoPage {

	@FindBy(name = "add-to-cart-sauce-labs-backpack")
	private WebElement botaoAdicionarMochila;

	@FindBy(name = "add-to-cart-sauce-labs-bike-light")
	private WebElement botaoAdicionarLuz;

	@FindBy(name = "add-to-cart-sauce-labs-bolt-t-shirt")
	private WebElement botaoAdicionarCamisetaPreta;

	@FindBy(name = "add-to-cart-sauce-labs-fleece-jacket")
	private WebElement botaoAdicionarJaqueta;

	@FindBy(name = "add-to-cart-sauce-labs-onesie")
	private WebElement botaoAdicionarMacacao;

	@FindBy(name = "add-to-cart-test.allthethings()-t-shirt-(red)")
	private WebElement botaoAdicionarCamisetaVermelha;
	
	@FindBy(className = "shopping_cart_link")
	private WebElement botaoCarrinho;

	//@FindBy(className = "product_sort_container")
	//private WebElement botaoOrdenar;
	//private Select selectOrdenar = new Select(botaoOrdenar);
	
	private WebElement elementoOrdenar = driver.findElement(By.className("product_sort_container"));
	private Select selectOrdenar = new Select(elementoOrdenar);

	public void adicionarMochila() {
		botaoAdicionarMochila.click();
	}

	public void adicionarLuz() {
		botaoAdicionarLuz.click();
	}

	public void adicionarCamisetaPreta() {
		botaoAdicionarCamisetaPreta.click();
	}

	public void adicionarJaqueta() {
		botaoAdicionarJaqueta.click();
	}

	public void adicionarMacacao() {
		botaoAdicionarMacacao.click();
	}

	public void adicionarCamisetaVermelha() {
		botaoAdicionarCamisetaVermelha.click();
	}

	public void acessarCarrinho() {
		botaoCarrinho.click();
	}
	
	public void ordenarProdutos(String ordem) {
		selectOrdenar.selectByVisibleText(ordem);
	}

}
