package stepsDefinitions;

import static utils.Utils.*;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	
	@Before
	public void setup() throws Exception{
		acessarApp();
	}
	
	@After
	public void tearDown(Scenario scenario) throws Exception{
		capturarScreenshot(scenario);
		Thread.sleep(2000);
		driver.quit();
	}

}
