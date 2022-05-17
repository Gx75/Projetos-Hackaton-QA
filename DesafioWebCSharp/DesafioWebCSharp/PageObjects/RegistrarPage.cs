using OpenQA.Selenium;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DesafioWebCSharp.PageObjects
{
    internal class RegistrarPage
    {
        private IWebDriver _driver;
        public RegistrarPage(IWebDriver driver) => _driver = driver;

        IWebElement botaoRegistrar => _driver.FindElement(By.XPath("//button[text()='Registrar']"));

        IWebElement campoEmail => _driver.FindElement(By.XPath("//div[@class='card__register']//input[@name='email']"));

        IWebElement campoNome => _driver.FindElement(By.Name("name"));

        IWebElement campoSenha => _driver.FindElement(By.XPath("//div[@class='card__register']//input[@name='password']"));

        IWebElement campoConfirmacaoSenha => _driver.FindElement(By.Name("passwordConfirmation"));

        IWebElement botaoCadastrar => _driver.FindElement(By.XPath("//button[text()='Cadastrar']"));


        public void acionarBotaoRegisrar() => botaoRegistrar.Click();

        public void informarCampoEmail(string email) => campoEmail.SendKeys(email);

        public void informarCampoNome(string nome) => campoNome.SendKeys(nome);

        public void informarCampoSenha(string senha) => campoSenha.SendKeys(senha);

        public void informarCampoConfirmacaoSenha(string senha) => campoConfirmacaoSenha.SendKeys(senha);

        public void acionarBotaoCadastrar() => botaoCadastrar.Click();
    }
}
