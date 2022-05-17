package stepsDefinitions;

import static org.junit.Assert.assertTrue;
import static utils.Utils.Na;
import static utils.Utils.driver;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.LoginPage;

public class LoginSteps {

	@Quando("inserir o usuario {string}")
	public void inserirOUsuario(String usuario) {
		Na(LoginPage.class).informarCampoUsuario(usuario);
	}

	@Quando("inserir a senha {string}")
	public void inserirASenha(String senha) {
		Na(LoginPage.class).informarCampoSenha(senha);
	}

	@Quando("apertar no botao LOGIN")
	public void apertarNoBotaoLOGIN() {
		Na(LoginPage.class).acionarBotaoLogin();
	}

	@Entao("o sistema apresenta a pagina dos produtos")
	public void oSistemaApresentaAPaginaDosProdutos() {
		assertTrue(driver.findElement(By.xpath("//span[@class=\"title\"][text()='Products']")).isDisplayed());
	}

}
