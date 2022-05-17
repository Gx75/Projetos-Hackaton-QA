package stepsDefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utils.Utils.driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.TelaInicialPage;
import pageObjects.TelaLoginPage;

public class ToDoSteps {
	

	
	TelaLoginPage telaLogin = new TelaLoginPage(driver);
	TelaInicialPage telaInicial = new TelaInicialPage(driver);
	
	
	@Quando("inserir o email {string}")
	public void inserirOEmail(String email) {
		telaLogin.informarCampoEmail(email);
	}

	@Quando("acionar o botao Sign In")
	public void acionarOBotaoSignIn() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		telaLogin.acionarBotaoSignIn();
	}

	@Quando("inserir a senha {string}")
	public void inserirASenha(String senha) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		telaLogin.informarCampoSenha(senha);
	}

	@Quando("eu acionar o botao nova lista")
	public void euAcionarOBotaoNovaLista() {
		telaInicial.acionarBotaoNovaLista();
	}

	@Quando("inserir o titulo {string}")
	public void inserirOTitulo(String titulo) {
		telaInicial.informarCampoTitulo(titulo);
	}
	
	@Quando("acionar o botao confirmar")
	public void acionarOBotaoConfirmar() {
		telaInicial.acionarBotaoConfirmar();
	}

	@Quando("acionar o botao voltar")
	public void acionarOBotaoVoltar() {
		telaInicial.acionarBotaoVoltar();
	}
	
	@Quando("eu acionar a lista criada")
	public void euAcionarAListaCriada() {
		telaInicial.acionarListaCriada();
	}

	@Quando("acionar o botao titulo")
	public void acionarOBotaoTitulo() throws Exception{
		telaInicial.acionarTituloListaCriada();
	}
	
	@Quando("eu acionar a lista editada")
	public void euAcionarAListaEditada() {
		telaInicial.acionarListaEditada();
	}

	@Quando("acionar o botao adicionar item")
	public void acionarOBotaoAdicionarItem() {
		telaInicial.acionarBotaoAdicionarItem();
	}

	@Quando("inserir o item {string}")
	public void inserirOItem(String item) {
		telaInicial.informarCampoAdicionarItem(item);
	}

	@Quando("acionar o item tarefa 1")
	public void acionarOItemTarefa1() {
		telaInicial.acionarItemCriado();
	}

	@Quando("acionar o botao remover item")
	public void acionarOBotaoRemoverItem() {
		telaInicial.acionarBotaoRemoverItem();
	}

	@Quando("acionar o botao mais opcoes")
	public void acionarOBotaoMaisOpcoes() {
		telaInicial.acionarBotaoMaisOpcoes();
	}

	@Quando("acionar o botao excluir lista")
	public void acionarOBotaoExcluirLista() {
		telaInicial.acionarBotaoExcluirLista();
	}

	@Entao("o sistema devera apresentar a lista com o titulo {string}")
	public void oSistemaDeveraApresentarAListaComOTitulo(String titulo) throws Exception{
		Thread.sleep(500);
		assertTrue(driver.findElement(By.xpath("//android.widget.TextView[@text='" + titulo + "']")).isDisplayed());
	}

	@Entao("o sistema devera apresentar o item {string}")
	public void oSistemaDeveraApresentarOItem(String item) {
		assertEquals(item, driver.findElement(By.id("com.microsoft.todos:id/task_title")).getText());
	}

	@Entao("o sistema devera apresentar a lista sem o item tarefa 1")
	public void oSistemaDeveraApresentarAListaSemOItemTarefa1() throws Exception{
		//findElements retorna um array com todos os elementos encontrados eo isEmpty retorna um booleano indicando se o array esta vazio
		Thread.sleep(500);
		assertTrue(driver.findElements(By.xpath("//android.widget.TextView[@text='Tarefa 1']")).isEmpty());
	}

	@Entao("o sistema devera excluir a lista editada")
	public void oSistemaDeveraExcluirAListaEditada() throws Exception{
		//findElements retorna um array com todos os elementos encontrados eo isEmpty retorna um booleano indicando se o array esta vazio
		Thread.sleep(500);
		assertTrue(driver.findElements(By.xpath("//android.widget.TextView[@text='Lista Editada']")).isEmpty());
	}
}
