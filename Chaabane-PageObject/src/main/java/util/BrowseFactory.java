package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowseFactory {
static WebDriver driver;

public static WebDriver StartBrowser(String browsername,String url) {
	if(browsername.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\chbba\\\\eclipse-workspace\\\\Chaabane-PageObject\\\\driver\\\\ChromeSetup (1).exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	driver.get(url);
	return driver;
}

}
