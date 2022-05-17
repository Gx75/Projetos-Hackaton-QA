package pageObjects;

import static utils.Utils.driver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class InicialPage {
	
	public InicialPage(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id = "com.android.packageinstaller:id/permission_allow_button")
	private MobileElement botaoAllow;
	
	@AndroidFindBy(id = "com.socialnmobile.dictapps.notepad.color.note:id/btn_start_skip")
	private MobileElement botaoSkip;
	
	@AndroidFindBy(accessibility = "Add")
	private MobileElement botaoMais;
	
	@AndroidFindBy(xpath  = "//android.widget.TextView[@text='Text']")
	private MobileElement botaoText;
	
	@AndroidFindBy(xpath  = "//android.widget.TextView[@text='Checklist']")
	private MobileElement botaoLista;
	
	private WebElement notaCriada;
	
	@AndroidFindBy(accessibility = "Color")
	private MobileElement botaoMudarCor;
	
	@AndroidFindBy(id = "com.socialnmobile.dictapps.notepad.color.note:id/txt5")
	private MobileElement botaoCorAzul;
	
	@AndroidFindBy(id = "com.socialnmobile.dictapps.notepad.color.note:id/main_btn1")
	private MobileElement botaoSelecionarCor;
	
	@AndroidFindBy(xpath = "//android.widget.GridView//android.widget.LinearLayout")
	private List<MobileElement> listaCores;
	
	@AndroidFindBy(accessibility = "Reminder")
	private MobileElement botaoLembrete;
	
	@AndroidFindBy(id = "com.socialnmobile.dictapps.notepad.color.note:id/quick_setting_15min")
	private MobileElement botao15Min;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text='DONE']")
	private MobileElement botaoPronto;
	
	@AndroidFindBy(accessibility = "Delete")
	private MobileElement botaoDelete;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text='OK']")
	private MobileElement botaoOk;
	
	@AndroidFindBy(accessibility = "More")
	private MobileElement botaoMenu;
	
	@AndroidFindBy(xpath = "//android.widget.GridView//android.widget.LinearLayout")
	private List<MobileElement> menu;
	
	public void acionarBotaoAllow() {
		botaoAllow.click();
	}
	
	public void acionarBotaoSkip() {
		botaoSkip.click();
	}
	
	public void acionarBotaoMais() {
		botaoMais.click();
	}
	
	public void acionarBotaoText() {
		botaoText.click();
	}
	
	public void acionarBotaoLista() {
		botaoLista.click();
	}
	
	public void selecionarNota(String nota) {
		notaCriada = driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.socialnmobile.dictapps.notepad.color.note:id/title' and @text='" + nota + "']"));
		Actions acao = new Actions(driver);
		acao.clickAndHold(notaCriada).perform();
	}
	
	public void acionarBotaoColor() {
		botaoMudarCor.click();
	}
	
	public void acionarBotaoCorAzul() {
		botaoCorAzul.click();
	}
	
	public void acionarBotaoSelecionarCor() {
		botaoSelecionarCor.click();
	}
	
	public void selecionarMostrarCorAzul() {
		listaCores.get(5).click();
	}
	
	public void acionarBotaoLembrete() {
		botaoLembrete.click();
	}
	
	public void acionarBotao15Min() {
		botao15Min.click();
	}
	
	public void acionarBotaoPronto() {
		botaoPronto.click();
	}
	
	public void acionarBotaoDelete() {
		botaoDelete.click();
	}
	
	public void acionarBotaoOk() {
		botaoOk.click();
	}
	
	public void acionarBotaoMenu() {
		botaoMenu.click();
	}
	
	public void selecionarLixeira() {
		menu.get(1).click();
	}
}
