using TechTalk.SpecFlow;

namespace DesafioWebCSharp.StepDefinitions
{
    [Binding]
    public sealed class Hooks
    {
        private Utils _utils;

        public Hooks(Utils utils) => _utils = utils;

        [BeforeScenario]
        public void SetUp()
        {
            _utils.acessarSistema();
        }

        [AfterScenario]
        public void TearDown()
        {
            _utils.Driver.Quit();
        }
    }
}