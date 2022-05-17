package pageObjects;

import static utils.Utils.*;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class TelaInicialPage {

	public TelaInicialPage(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(id = "com.microsoft.todos:id/create_list_text_view")
	private MobileElement botaoNovaLista;

	@AndroidFindBy(id = "com.microsoft.todos:id/edit_text")
	private MobileElement campoTitulo;

	@AndroidFindBy(id = "android:id/button1")
	private MobileElement botaoConfirmar;
	
	@AndroidFindBy(accessibility = "Back")
	private MobileElement botaoVoltar;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Lista Criada']")
	private MobileElement listaCriada;
	
	@AndroidFindBy(accessibility = "Lista Criada")
	private MobileElement tituloListaCriada;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Lista Editada']")
	private MobileElement listaEditada;
	
	@AndroidFindBy(accessibility = "Add a task")
	private MobileElement botaoAdicionarItem;

	@AndroidFindBy(id = "com.microsoft.todos:id/create_task_edit_text")
	private MobileElement campoAdicionarItem;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Tarefa 1']")
	private MobileElement itemCriado;

	@AndroidFindBy(id = "com.microsoft.todos:id/delete")
	private MobileElement botaoRemoverItem;
	
	@AndroidFindBy(accessibility = "More options")
	private MobileElement botaoMaisOpcoes;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Delete list']")
	private MobileElement botaoExcluirLista;
	

	public void acionarBotaoNovaLista() {
		botaoNovaLista.click();
	}

	public void informarCampoTitulo(String titulo) {
		campoTitulo.sendKeys(titulo);
	}

	public void acionarBotaoConfirmar() {
		botaoConfirmar.click();
	}

	public void acionarBotaoVoltar() {
		botaoVoltar.click();
	}
	
	public void acionarListaCriada() {
		listaCriada.click();
	}
	
	public void acionarTituloListaCriada() {
		//Metodo que criei para clicar em uma posicao especifica do elemento pois quando clicado com o .click()
		//no meu dispositivo ele abria a barra de notificacoes de acordo com a proximidade do elemento com o topo da tela
		//com esse metodo eu consigo evitar isso clicando na parte inferior do elemento
		clicarPosicaoEspecificaNoElemento(tituloListaCriada, 0.5, 0.9);
	}
	
	public void acionarListaEditada() {
		listaEditada.click();
	}
	
	public void acionarBotaoAdicionarItem() {
		botaoAdicionarItem.click();
	}

	public void informarCampoAdicionarItem(String item) {
		campoAdicionarItem.sendKeys(item);
	}
	
	public void acionarItemCriado() {
		itemCriado.click();
	}
	
	public void acionarBotaoRemoverItem() {
		botaoRemoverItem.click();
	}
	
	public void acionarBotaoMaisOpcoes() {
		botaoMaisOpcoes.click();
	}

	
	public void acionarBotaoExcluirLista() {
		botaoExcluirLista.click();
	}

}
