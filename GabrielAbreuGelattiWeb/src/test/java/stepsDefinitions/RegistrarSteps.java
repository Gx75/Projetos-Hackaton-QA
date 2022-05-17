package stepsDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.LoginPage;
import pageObjects.RegistrarPage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utils.Utils.*;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class RegistrarSteps {
	
	@Dado("que eu estou acessando a pagina de registro")
	public void queEuEstouAcessandoAPaginaDeRegistro() throws Exception{
		Na(LoginPage.class).acionarBotaoRegistrar();
	}

	@Quando("eu registrar o email {string}")
	public void euRegistrarOEmail(String email) {
		Na(RegistrarPage.class).informarCampoEmail(email);
	}

	@Quando("eu registrar o nome {string}")
	public void euRegistrarONome(String nome) {
		Na(RegistrarPage.class).informarCampoNome(nome);
	}

	@Quando("eu registrar a senha {string}")
	public void euRegistrarASenha(String senha) {
		Na(RegistrarPage.class).informarCampoSenha(senha);
	}

	@Quando("eu confirmar a senha {string}")
	public void euConfirmarASenha(String confirmacaoSenha) {
		Na(RegistrarPage.class).informarCampoConfirmacaoSenha(confirmacaoSenha);
	}

	@Quando("eu clicar no botao cadastrar")
	public void euClicarNoBotaoCadastrar() {
		Na(RegistrarPage.class).acionarBotaoCadastrar();
	}
	
	
	@Quando("eu acionar o botao fechar")
	public void euAcionarOBotaoFechar() throws Exception{
		Thread.sleep(250);
		Na(RegistrarPage.class).acionarBotaoFechar();
	}
	
	
	@Quando("eu desativo o botao criar conta com saldo")
	public void euDesativoOBotaoCriarContaComSaldo() throws Exception{
		Thread.sleep(250);
		Na(RegistrarPage.class).acionarSwitchComSaldo(false);
	}
	
	
	@Quando("eu ativo o botao criar conta com saldo")
	public void euAtivoOBotaoCriarContaComSaldo() {
		Na(RegistrarPage.class).acionarSwitchComSaldo(true);
	}

	@Entao("o sistema apresenta a mensagem que a conta foi criada com sucesso")
	public void oSistemaApresentaAMensagemQueAContaFoiCriadaComSucesso() throws Exception{
		Thread.sleep(250);
	}
	
	@Entao("o sistema apresenta a mensagem formato invalido")
	public void oSistemaApresentaAMensagemFormatoInvalido() {
		assertTrue(!driver.findElements(By.xpath("//p[@class='input__warging'][text()='Formato inválido']")).isEmpty());
	}
	
	@Entao("o sistema apresenta a mensagem campo obrigatorio")
	public void oSistemaApresentaAMensagemCampoObrigatorio() {
		assertTrue(!driver.findElements(By.xpath("//p[@class='input__warging'][text()='É campo obrigatório']")).isEmpty());
	}
	

	@Entao("o sistema apresenta a mensagem nome nao pode ser vazio")
	public void oSistemaApresentaAMensagemNomeNaoPodeSerVazio() throws Exception{
		Thread.sleep(250);
		assertEquals("Nome não pode ser vazio.", driver.findElement(By.id("modalText")).getText());
	}
	

	@Entao("o sistema apresenta a mensagem as senhas nao sao iguais")
	public void oSistemaApresentaAMensagemAsSenhasNaoSaoIguais() {
		espera.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("modalText"))));
		assertEquals("As senhas não são iguais.", driver.findElement(By.id("modalText")).getText());
	}

	@Entao("o sistema deve apresentar a mensagem cliente optou por nao ter saldo ao abrir conta")
	public void oSistemaDeveApresentarAMensagemClienteOptouPorNaoTerSaldoAoAbrirConta() {
		assertEquals("Cliente optou por não ter saldo ao abrir conta", driver.findElement(By.id("textDescription")).getText());
	}

	@Entao("o sistema deve apresentar a mensagem que o saldo foi adicionado ao abrir a conta")
	public void oSistemaDeveApresentarAMensagemQueOSaldoFoiAdicionadoAoAbrirAConta() {
		assertEquals("Saldo adicionado ao abrir conta", driver.findElement(By.id("textDescription")).getText());
	}

}
