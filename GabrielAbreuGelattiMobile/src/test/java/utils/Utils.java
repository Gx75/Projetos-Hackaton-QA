package utils;

import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.core.api.Scenario;

public class Utils {

	public static AppiumDriver<WebElement> driver;

	public static void acessarApp() throws Exception {
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities.setCapability("deviceName", "emulator-5554");
		desiredCapabilities.setCapability("automationName", "uiautomator2");
		desiredCapabilities.setCapability("appPackage", "com.microsoft.todos");
		desiredCapabilities.setCapability("appActivity", "com.microsoft.todos.ui.LaunchActivity");

		driver = new AppiumDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	//Metodo criado para clicar em uma posicao especifica do elemento utilizando multiplicadores para as posicoes X e Y
	public static void clicarPosicaoEspecificaNoElemento(MobileElement elemento, double multX, double multY) {
		TouchAction touchAction = new TouchAction(driver);
		
		int posX = (int) (elemento.getLocation().getX() + elemento.getSize().getWidth() * multX);
		int posY = (int) (elemento.getLocation().getY() + elemento.getSize().getHeight() * multY);
		
		touchAction.tap(PointOption.point(posX, posY)).perform();
	}
	
	public static void capturarTela(Scenario  scenario) {
		final byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		scenario.embed(screenshot, "image/png");
	}

}
