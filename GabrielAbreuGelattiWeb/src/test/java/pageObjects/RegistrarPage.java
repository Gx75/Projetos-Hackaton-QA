package pageObjects;

import static utils.Utils.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrarPage {
	
	@FindBy(xpath = "//div[@class='card__register']//input[@name='email']")
	private WebElement campoEmail;
	
	@FindBy(name = "name")
	private WebElement campoNome;
	
	@FindBy(xpath = "//div[@class='card__register']//input[@name='password']")
	private WebElement campoSenha;
	
	@FindBy(name = "passwordConfirmation")
	private WebElement campoConfirmacaoSenha;
	
	@FindBy(xpath = "//button[text()='Cadastrar']")
	private WebElement botaoCadastrar;
	
	@FindBy(id = "btnCloseModal")
	private WebElement botaoFechar;
	
	@FindBy(id = "toggleAddBalance")
	private WebElement switchComSaldo;

	public void informarCampoEmail(String email) {
		campoEmail.sendKeys(email);
	}

	public void informarCampoNome(String nome) {
		campoNome.sendKeys(nome);
	}

	public void informarCampoSenha(String senha) {
		campoSenha.sendKeys(senha);
	}

	public void informarCampoConfirmacaoSenha(String confirmacaoSenha) {
		campoConfirmacaoSenha.sendKeys(confirmacaoSenha);
	}

	public void acionarBotaoCadastrar() {
		botaoCadastrar.click();
	}
	
	public void acionarBotaoFechar() {
		botaoFechar.click();
	}
	
	public void acionarSwitchComSaldo(boolean comSaldo) {
		boolean estadoSwitch = driver.findElements(By.xpath("//label[@class='styles__Container-sc-1pngcbh-0 kIwoPV']")).isEmpty();
		if(comSaldo && estadoSwitch) {
			return;
		} else if (comSaldo && !estadoSwitch) {
			switchComSaldo.click();
		} else if (!comSaldo && estadoSwitch) {
			switchComSaldo.click();
		} else {
			return;
		}
	}
	
	public String[] registrarUsuarioComSaldo(String nome, String email, String senha) throws Exception{
		campoNome.clear();
		campoNome.sendKeys(nome);
		campoEmail.clear();
		campoEmail.sendKeys(email);
		campoSenha.clear();
		campoSenha.sendKeys(senha);
		campoConfirmacaoSenha.clear();
		campoConfirmacaoSenha.sendKeys(senha);
		Thread.sleep(250);
		acionarSwitchComSaldo(true);
		Thread.sleep(250);
		botaoCadastrar.click();

		Thread.sleep(250);
		String textoConfirmacao = driver.findElement(By.id("modalText")).getText();
		String[] dadosConta = textoConfirmacao.split(" ");
		System.out.println(textoConfirmacao+"  "+dadosConta.length);
		dadosConta = dadosConta[2].split("-");
		
		Thread.sleep(250);
		botaoFechar.click();
		return dadosConta;
	}
	
	public String[] registrarUsuarioSemSaldo(String nome, String email, String senha) throws Exception{
		campoNome.clear();
		campoNome.sendKeys(nome);
		campoEmail.clear();
		campoEmail.sendKeys(email);
		campoSenha.clear();
		campoSenha.sendKeys(senha);
		campoConfirmacaoSenha.clear();
		campoConfirmacaoSenha.sendKeys(senha);
		Thread.sleep(250);
		acionarSwitchComSaldo(false);
		Thread.sleep(250);
		botaoCadastrar.click();

		Thread.sleep(250);
		String textoConfirmacao = driver.findElement(By.id("modalText")).getText();
		String[] dadosConta = textoConfirmacao.split(" ");
		dadosConta = dadosConta[2].split("-");
		
		Thread.sleep(250);
		botaoFechar.click();
		return dadosConta;
	}

}
