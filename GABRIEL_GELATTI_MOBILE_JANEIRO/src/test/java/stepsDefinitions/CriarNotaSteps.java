package stepsDefinitions;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.InicialPage;
import pageObjects.NotaPage;

import static org.junit.Assert.assertTrue;
import static utils.Utils.*;

import org.openqa.selenium.By;

public class CriarNotaSteps {
	
	InicialPage inicialPage = new InicialPage(driver);	
	NotaPage notaPage = new NotaPage(driver);

	@Quando("eu acionar o botao mais")
	public void euAcionarOBotaoMais() {
		inicialPage.acionarBotaoMais();
	}
	
	@Quando("eu selecionar o tipo texto")
	public void euSelecionarOTipoTexto() {
		inicialPage.acionarBotaoText();
	}

	@Quando("eu selecionar o tipo lista")
	public void euSelecionarOTipoLista() {
		inicialPage.acionarBotaoLista();
	}

	@Quando("inserir o titulo {string}")
	public void inserirOTitulo(String titulo) {
		notaPage.informarTitulo(titulo);
	}

	@Quando("inserir o texto {string}")
	public void inserirOTexto(String texto) {
		notaPage.informarTexto(texto);
	}

	@Quando("apertar no botao Add Item")
	public void apertarNoBotaoAddItem() {
		notaPage.acionarBotaoAddItem();
	}

	@Quando("inserir {string} no campo Add Item")
	public void inserirNoCampoAddItem(String item) {
		notaPage.informarCampoAddItem(item);
	}

	@Quando("apertar no botao next")
	public void apertarNoBotaoNext() {
		notaPage.acionarBotaoNext();
	}

	@Quando("apertar no botao ok")
	public void apertarNoBotaoOk() {
		notaPage.acionarBotaoOk();
	}

	@Quando("eu apertar no botao confirmar")
	public void euApertarNoBotaoConfirmar() {
		notaPage.acionarBotaoConfirmar();
	}

	@Quando("eu apertar no botao voltar")
	public void euApertarNoBotaoVoltar() {
		notaPage.acionarBotaoVoltar();
	}

	@Entao("deve ser visivel a nota com o titulo {string}")
	public void DeveSerVisivelANotaComOTitulo(String titulo) {
		assertTrue(driver.findElement(By.xpath( "//android.widget.TextView[@resource-id='com.socialnmobile.dictapps.notepad.color.note:id/title' and @text='" + titulo + "']")).isDisplayed());
	}
	
	@Entao("a nota deve possuir o titulo {string} e conter {int} itens")
	public void aNotaDevePossuirOTituloEConterItens(String titulo, Integer itens) {
		assertTrue(driver.findElement(By.id("com.socialnmobile.dictapps.notepad.color.note:id/edit_title")).getText().equals(titulo) 
				   && driver.findElements(By.xpath("//androidx.recyclerview.widget.RecyclerView//android.widget.TextView")).size() == itens);
	}

}
