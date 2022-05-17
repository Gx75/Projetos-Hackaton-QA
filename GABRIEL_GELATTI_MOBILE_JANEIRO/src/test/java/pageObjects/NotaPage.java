package pageObjects;

import java.util.List;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class NotaPage {
	
	public NotaPage(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id  = "com.socialnmobile.dictapps.notepad.color.note:id/edit_title")
	private MobileElement campoTitulo;
	
	@AndroidFindBy(id  = "com.socialnmobile.dictapps.notepad.color.note:id/edit_note")
	private MobileElement campoTexto;
	
	@AndroidFindBy(id  = "com.socialnmobile.dictapps.notepad.color.note:id/back_btn")
	private MobileElement botaoConfirmar;
	
	@AndroidFindBy(id  = "com.socialnmobile.dictapps.notepad.color.note:id/back_btn")
	private MobileElement botaoVoltar;
	
	@AndroidFindBy(xpath  = "//android.widget.TextView[@text='Add Item']")
	private MobileElement botaoAddItem;
	
	@AndroidFindBy(id  = "com.socialnmobile.dictapps.notepad.color.note:id/edit")
	private MobileElement campoAddItem;
	
	@AndroidFindBy(id  = "android:id/button3")
	private MobileElement botaoNext;
	
	@AndroidFindBy(id  = "android:id/button1")
	private MobileElement botaoOk;
	
	@AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView//android.widget.TextView")
	private List<MobileElement> listaItens;
	
	public void informarTitulo(String titulo) {
		campoTitulo.sendKeys(titulo);
	}
	
	public void informarTexto(String texto) {
		campoTexto.sendKeys(texto);
	}
	
	public void acionarBotaoConfirmar() {
		botaoConfirmar.click();
	}
	
	public void acionarBotaoVoltar() {
		botaoVoltar.click();
	}
	
	public void acionarBotaoAddItem() {
		botaoAddItem.click();
	}
	
	public void informarCampoAddItem(String item) {
		campoAddItem.sendKeys(item);
	}
	
	public void acionarBotaoNext() {
		botaoNext.click();
	}
	
	public void acionarBotaoOk() {
		botaoOk.click();
	}
	
	public void selecionarItem(Integer item) {
		listaItens.get(item-1).click();
	}
	
	


}
