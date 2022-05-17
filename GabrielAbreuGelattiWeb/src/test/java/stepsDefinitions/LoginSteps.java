package stepsDefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utils.Utils.Na;
import static utils.Utils.driver;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.LoginPage;

public class LoginSteps {
	
	@Quando("eu informar o email {string}")
	public void euInformarOEmail(String email) {
		Na(LoginPage.class).informarCampoEmail(email);
	}

	@Quando("eu informar a senha {string}")
	public void euInformarASenha(String senha) {
		Na(LoginPage.class).informarCampoSenha(senha);
	}

	@Quando("eu clicar no botao acessar")
	public void euClicarNoBotaoAcessar() {
		Na(LoginPage.class).acionarBotaoAcessar();
	}

	@Entao("o sistema apresenta a mensagem bem vindo ao bugbank")
	public void oSistemaApresentaAMensagemBemVindoAoBugbank() {
		assertTrue(!driver.findElements(By.xpath("//p[text()='bem vindo ao BugBank :)']")).isEmpty());
	}

	@Entao("o sistema apresenta a mensagem de credenciais invalidas")
	public void oSistemaApresentaAMensagemDeCredenciaisInvalidas() throws Exception{
		Thread.sleep(250);
		assertEquals("Usuário ou senha inválido.\nTente novamente ou verifique suas informações!",driver.findElement(By.id("modalText")).getText());
	}
	
}
