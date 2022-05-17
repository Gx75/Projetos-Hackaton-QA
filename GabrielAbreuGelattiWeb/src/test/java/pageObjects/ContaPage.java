package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContaPage {
	
	@FindBy(id = "btn-TRANSFERÊNCIA")
	private WebElement botaoTransferencia;
	
	@FindBy(id = "btn-PAGAMENTOS")
	private WebElement botaoPagamentos;
	
	@FindBy(id = "btn-EXTRATO")
	private WebElement botaoExtrato;
	
	@FindBy(id = "btn-SAQUE")
	private WebElement botaoSaque;
	
	@FindBy(id = "btnExit")
	private WebElement botaoSair;
	
	@FindBy(id = "btnBack")
	private WebElement botaoVoltar;
	
	@FindBy(name = "accountNumber")
	private WebElement campoNumeroConta;
	
	@FindBy(name = "digit")
	private WebElement campoDigitoConta;
	
	@FindBy(name = "transferValue")
	private WebElement campoValorTransferencia;
	
	@FindBy(name = "description")
	private WebElement campoDescricao;
	
	@FindBy(xpath = "//button[text()='Transferir agora']")
	private WebElement botaoTransferirAgora;

	public void acionarBotaoTransferencia() {
		botaoTransferencia.click();
	}

	public void acionarBotaoPagamentos() {
		botaoPagamentos.click();
	}

	public void acionarBotaoExtrato() {
		botaoExtrato.click();
	}

	public void acionarBotaoSaque() {
		botaoSaque.click();
	}

	public void acionarBotaoSair() {
		botaoSair.click();
	}

	public void acionarBotaoVoltar() {
		botaoVoltar.click();
	}
	
	public void informarCampoNumeroConta(String numeroConta) {
		campoNumeroConta.sendKeys(numeroConta);
	}
	
	public void informarCampoDigitoConta(String digitoConta) {
		campoDigitoConta.sendKeys(digitoConta);
	}
	
	public void informarCampoValorTransferencia(String valorTransferencia) {
		campoValorTransferencia.sendKeys(valorTransferencia);
	}
	
	public void informarCampoDescricao(String descricao) {
		campoDescricao.sendKeys(descricao);
	}
	
	public void acionarBotaoTransferirAgora() {
		botaoTransferirAgora.click();
	}

}
