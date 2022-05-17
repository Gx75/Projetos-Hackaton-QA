package stepsDefinitions;

import static org.junit.Assert.assertEquals;
import static utils.Utils.Na;
import static utils.Utils.driver;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.CarrinhoPage;

public class CarrinhoSteps {
	
	@Quando("eu clico no botao Remover do produto {string}")
	public void euClicoNoBotaoRemoverDoProduto(String produto) {
		if(produto.equals("mochila")) {
			Na(CarrinhoPage.class).removerMochila();
		} else if(produto.equals("luz")) {
			Na(CarrinhoPage.class).removerLuz();
		} else if(produto.equals("camiseta preta")) {
			Na(CarrinhoPage.class).removerCamisetaPreta();
		} else if(produto.equals("jaqueta")) {
			Na(CarrinhoPage.class).removerJaqueta();
		} else if(produto.equals("macacao")) {
			Na(CarrinhoPage.class).removerMacacao();
		} else if(produto.equals("camiseta vermelha")) {
			Na(CarrinhoPage.class).removerCamisetaVermelha();
		}
	}
	
	@Entao("o icone do carrinho nao deve apresentar nenhum item dentro do carrinho")
	public void oIconeDoCarrinhoNaoDeveApresentarNenhumItemDentroDoCarrinho() {
		assertEquals(6, driver.findElements(By.xpath("//div[@class=\"removed_cart_item\"]")).size());
	}

}
