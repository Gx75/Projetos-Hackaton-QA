package stepsDefinitions;

import io.cucumber.core.api.Scenario;
//import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import pageObjects.LoginPage;

import static utils.Utils.*;

public class Hooks {
	
	@Before(value = "@logins")
	public void setupLogin() {
	    acessarSistema();
	}
	
	@Before(value = "not @logins")
	public void setup() {
	    acessarSistema();
		Na(LoginPage.class).realizarLogin("standard_user", "secret_sauce");
	}
	
	@After
	public void tearDown(Scenario cenario) {
		capturarTela(cenario);
		driver.quit();
	}
	
}