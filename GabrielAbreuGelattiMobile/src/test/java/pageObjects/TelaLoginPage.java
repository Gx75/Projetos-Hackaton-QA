package pageObjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class TelaLoginPage {

	public TelaLoginPage(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(id = "com.microsoft.todos:id/email_phone_edit_text")
	private MobileElement campoEmail;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Sign in']")
	private MobileElement botaoSignIn;

	@AndroidFindBy(xpath = "//android.widget.EditText[@password='true']")
	private MobileElement campoSenha;

	public void informarCampoEmail(String email) {
		campoEmail.sendKeys(email);
	}

	public void acionarBotaoSignIn() {
		botaoSignIn.click();
	}

	public void informarCampoSenha(String senha) {
		campoSenha.sendKeys(senha);
	}

}
