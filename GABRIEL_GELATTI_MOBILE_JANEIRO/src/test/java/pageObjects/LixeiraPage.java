package pageObjects;

import static utils.Utils.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LixeiraPage {
	
	public LixeiraPage(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	private WebElement notaCriada;
	
	@AndroidFindBy(accessibility = "Permanently delete")
	private MobileElement botaoDeletarPermanentemente;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text='OK']")
	private MobileElement botaoOk;

	public void selecionarNota(String nota) {
		notaCriada = driver.findElement(By.xpath("//android.widget.TextView[@text='" + nota + "']"));
		Actions acao = new Actions(driver);
		acao.clickAndHold(notaCriada).perform();
	}
	
	public void acionarBotaoDeletarPermanentemente() {
		botaoDeletarPermanentemente.click();
	}
	
	public void acionarBotaoOk() {
		botaoOk.click();
	}
	

}
