package stepsDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.ContaPage;
import pageObjects.LoginPage;
import pageObjects.RegistrarPage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utils.Utils.*;

import org.openqa.selenium.By;

public class ContaSteps {

	String[] numeroContas = new String[5];
	String[] digitoContas = new String[5];
	int contasRegistradas = 0;

	@Dado("que eu registrei o usuario {string} com o email {string} e a senha {string} sem saldo")
	public void queEuRegistreiOUsuarioComOEmailEASenhaSemSaldo(String nome, String email, String senha)
			throws Exception {
		Na(LoginPage.class).acionarBotaoRegistrar();
		String[] dadosConta = Na(RegistrarPage.class).registrarUsuarioSemSaldo(nome, email, senha);

		numeroContas[contasRegistradas] = dadosConta[0];
		digitoContas[contasRegistradas] = dadosConta[1];

		contasRegistradas++;
	}

	@Dado("que eu registrei o usuario {string} com o email {string} e a senha {string} com saldo")
	public void queEuRegistreiOUsuarioComOEmailEASenhaComSaldo(String nome, String email, String senha)
			throws Exception {

		Na(LoginPage.class).acionarBotaoRegistrar();
		String[] dadosConta = Na(RegistrarPage.class).registrarUsuarioComSaldo(nome, email, senha);

		numeroContas[contasRegistradas] = dadosConta[0];
		digitoContas[contasRegistradas] = dadosConta[1];

		contasRegistradas++;
	}

	@Quando("eu informar o numero da conta {int}")
	public void euInformarONumeroDaConta(Integer numConta) {
		Na(ContaPage.class).informarCampoNumeroConta(numeroContas[numConta - 1]);
	}

	@Quando("eu informar o digito da conta {int}")
	public void euInformarODigitoDaConta(Integer numConta) {
		Na(ContaPage.class).informarCampoDigitoConta(digitoContas[numConta - 1]);
	}

	@Quando("eu fazer o login usando {string} e {string}")
	public void euFazerOLoginUsandoE(String email, String senha) {
		Na(LoginPage.class).fazerLogin(email, senha);
	}

	@Quando("eu acionar o botao extrato")
	public void euAcionarOBotaoExtrato() {
		Na(ContaPage.class).acionarBotaoExtrato();
	}

	@Entao("o sistema deve apresentar o extrato da conta")
	public void oSistemaDeveApresentarOExtratoDaConta() {
		assertTrue(!driver.findElements(By.xpath("//p[text()='Saldo disponível']")).isEmpty());
	}

	@Quando("eu acionar o botao transferencia")
	public void euAcionarOBotaoTransferencia() {
		Na(ContaPage.class).acionarBotaoTransferencia();
	}

	@Quando("eu informar o valor {string}")
	public void euInformarOValor(String valorTransferencia) {
		Na(ContaPage.class).informarCampoValorTransferencia(valorTransferencia);
	}

	@Quando("eu acionar o botao transferir agora")
	public void euAcionarOBotaoTransferirAgora() {
		Na(ContaPage.class).acionarBotaoTransferirAgora();
	}

	@Quando("eu informar a descricao {string}")
	public void euInformarADescricao(String descricao) {
		Na(ContaPage.class).informarCampoDescricao(descricao);;
	}
	
	@Quando("eu acionar o botao voltar")
	public void euAcionarOBotaoVoltar() {
		Na(ContaPage.class).acionarBotaoVoltar();
	}
	
	@Quando("eu acionar o botao sair")
	public void euAcionarOBotaoSair() {
		Na(ContaPage.class).acionarBotaoSair();
	}
	
	@Quando("eu acionar o botao saque")
	public void euAcionarOBotaoSaque() {
		Na(ContaPage.class).acionarBotaoSaque();
	}

	@Quando("eu acionar o botao pagamentos")
	public void euAcionarOBotaoPagamentos() {
		Na(ContaPage.class).acionarBotaoPagamentos();
	}

	@Entao("o sistema deve apresentar a mensagem transferencia realizada com sucesso")
	public void oSistemaDeveApresentarAMensagemTransferenciaRealizadaComSucesso() throws Exception {
		Thread.sleep(250);
		assertEquals("Transferencia realizada com sucesso", driver.findElement(By.id("modalText")).getText());
	}
	
	@Entao("o sistema deve apresentar a mensagem saldo insuficiente")
	public void oSistemaDeveApresentarAMensagemSaldoInsuficiente() throws Exception{
		Thread.sleep(250);
		assertEquals("Você não tem saldo suficiente para essa transação", driver.findElement(By.id("modalText")).getText());
	}

	
	@Entao("o sistema deve apresentar uma transferencia com a descricao {string}")
	public void oSistemaDeveApresentarUmaTransferenciaComADescricao(String descricao) {
		assertTrue(!driver.findElements(By.xpath("//p[text()='" + descricao +"']")).isEmpty());
	}
	
	@Entao("o sistema deve mostrar o saldo como {string}")
	public void oSistemaDeveMostrarOSaldoComo(String saldo) {
		assertEquals(saldo , driver.findElement(By.id("textBalanceAvailable")).getText());
	}

	@Entao("o sistema deve apresentar a pagina de login")
	public void oSistemaDeveApresentarAPaginaDeLogin() {
		assertTrue(!driver.findElements(By.xpath("//h1[text()='O banco com bugs e falhas do seu jeito']")).isEmpty());
	}
	
	@Entao("o sistema deve apresentar a mensagem {string}")
	public void oSistemaDeveApresentarAMensagem(String string) throws Exception{
		Thread.sleep(250);
		assertEquals("Funcionalidade em desenvolvimento", driver.findElement(By.id("modalText")).getText());
	}

}
