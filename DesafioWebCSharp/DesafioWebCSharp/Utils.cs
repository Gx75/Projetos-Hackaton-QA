using OpenQA.Selenium;
using OpenQA.Selenium.Chrome;
using OpenQA.Selenium.Support.UI;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DesafioWebCSharp
{
    public class Utils
    {
        public IWebDriver Driver { get; set; }

        public void acessarSistema()
        {
            Driver = new ChromeDriver();
            Driver.Manage().Window.Maximize();
            Driver.Manage().Timeouts().ImplicitWait = TimeSpan.FromSeconds(5);

            Driver.Navigate().GoToUrl("https://bugbank.netlify.app/");

        }

        public WebDriverWait espera(int milissegundos)
        {
            WebDriverWait espera = new WebDriverWait(Driver, TimeSpan.FromMilliseconds(milissegundos));
            return espera;
        }
    }
}
