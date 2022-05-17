using DesafioWebCSharp.PageObjects;
using OpenQA.Selenium;
using OpenQA.Selenium.Support.UI;
using System.Text.RegularExpressions;
using SeleniumExtras.WaitHelpers;
using NUnit.Framework;

namespace DesafioWebCSharp.StepDefinitions
{
    [Binding]
    public sealed class RegistrarSteps
    {
        private Utils _utils;
        RegistrarPage registrarPage;

        public RegistrarSteps(Utils utils)
        {
            _utils = utils;
            registrarPage = new RegistrarPage(utils.Driver);
        }

        [Given(@"que eu estou acessando a pagina de registro")]
        public void GivenQueEuEstouAcessandoAPaginaDeRegistro()
        {
            registrarPage.acionarBotaoRegisrar();
        }

        [When(@"eu registrar o email ""([^""]*)""")]
        public void WhenEuRegistrarOEmail(string email)
        {
            registrarPage.informarCampoEmail(email);
        }

        [When(@"eu registrar o nome ""([^""]*)""")]
        public void WhenEuRegistrarONome(string nome)
        {
            registrarPage.informarCampoNome(nome);
        }

        [When(@"eu registrar a senha ""([^""]*)""")]
        public void WhenEuRegistrarASenha(string senha)
        {
            registrarPage.informarCampoSenha(senha);
        }

        [When(@"eu confirmar a senha ""([^""]*)""")]
        public void WhenEuConfirmarASenha(string senha)
        {
            registrarPage.informarCampoConfirmacaoSenha(senha);
        }

        [When(@"eu clicar no botao cadastrar")]
        public void WhenEuClicarNoBotaoCadastrar()
        {
            registrarPage.acionarBotaoCadastrar();
        }

        [Then(@"o sistema apresenta a mensagem que a conta foi criada com sucesso")]
        public void ThenOSistemaApresentaAMensagemQueAContaFoiCriadaComSucesso()
        {
            _utils.espera(5000).Until(ExpectedConditions.ElementIsVisible(By.Id("modalText")));
            string mensagem = _utils.Driver.FindElement(By.Id("modalText")).Text;
            mensagem = Regex.Replace(mensagem, @"[1234567890]", "");
            Assert.AreEqual("A conta - foi criada com sucesso", mensagem);
        }

        [Then(@"o sistema apresenta o aviso ""([^""]*)""")]
        public void ThenOSistemaApresentaOAviso(string aviso)
        {
            _utils.espera(5000).Until(ExpectedConditions.ElementIsVisible(By.XPath("//p[@class='input__warging'][text()='" + aviso + "']")));
            Assert.True(_utils.Driver.FindElement(By.XPath("//p[@class='input__warging'][text()='" + aviso + "']")).Displayed);
        }

        [Then(@"o sistema apresenta a mensagem ""([^""]*)""")]
        public void ThenOSistemaApresentaAMensagem(string mensagem)
        {
            _utils.espera(5000).Until(ExpectedConditions.ElementIsVisible(By.Id("modalText")));
            Assert.AreEqual(mensagem, _utils.Driver.FindElement(By.Id("modalText")).Text);
        }


    }
}