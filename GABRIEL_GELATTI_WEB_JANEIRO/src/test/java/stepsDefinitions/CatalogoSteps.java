package stepsDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.CatalogoPage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static utils.Utils.*;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CatalogoSteps {
	
	@Dado("que eu fiz login no usuario standard")
	public void queEuFizLoginNoUsuarioStandard() {
		//Na(LoginPage.class).realizarLogin("standard_user", "secret_sauce");
	}
	
	@Quando("selecionar a ordem {string}")
	public void selecionarAOrdem(String ordem) {
		Na(CatalogoPage.class).ordenarProdutos(ordem);
	}
	
	@Entao("o sistema deve apresentar os itens do preco mais baixo para o preco mais alto")
	public void oSistemaDeveApresentarOsItensDoPrecoMaisBaixoParaOPrecoMaisAlto() {
		List<WebElement> lista = driver.findElements(By.xpath("//div[@class=\"inventory_item_price\"]"));
		for (int i = 0 ; i < lista.size()-1; i++) {
			float valorAtual =  Float.parseFloat(lista.get(i).getText().replace("$", ""));
			float valorSeguinte =  Float.parseFloat(lista.get(i+1).getText().replace("$", ""));
			if (valorAtual > valorSeguinte) {
				fail("Os produtos nao se encontram ordenados corretamente");
			}
		}
		assertEquals("lohi",driver.findElement(By.className("product_sort_container")).getAttribute("value"));
	}

}
