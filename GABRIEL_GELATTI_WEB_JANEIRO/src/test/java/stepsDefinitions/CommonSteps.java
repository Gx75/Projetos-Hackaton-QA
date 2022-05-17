package stepsDefinitions;

import static utils.Utils.Na;

import io.cucumber.java.pt.Quando;
import pageObjects.CatalogoPage;

public class CommonSteps {

	@Quando("eu clico no botao Adicionar ao Carrinho do produto {string}")
	public void euClicoNoBotaoAdicionarAoCarrinhoDoProduto(String produto) {
		if(produto.equals("mochila")) {
			Na(CatalogoPage.class).adicionarMochila();
		} else if(produto.equals("luz")) {
			Na(CatalogoPage.class).adicionarLuz();
		} else if(produto.equals("camiseta preta")) {
			Na(CatalogoPage.class).adicionarCamisetaPreta();
		} else if(produto.equals("jaqueta")) {
			Na(CatalogoPage.class).adicionarJaqueta();
		} else if(produto.equals("macacao")) {
			Na(CatalogoPage.class).adicionarMacacao();
		} else if(produto.equals("camiseta vermelha")) {
			Na(CatalogoPage.class).adicionarCamisetaVermelha();
		}
	}

	@Quando("eu aperto no carrinho")
	public void euApertoNoCarrinho() {
		Na(CatalogoPage.class).acessarCarrinho();
	}

}
