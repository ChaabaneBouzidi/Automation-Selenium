package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Page.LoginPage;
import util.BrowseFactory;

public class LoginTest {
	
@Test

	public void GmailLoginTest() {
	WebDriver driver=BrowseFactory.StartBrowser("chrome","https://www.facebook.com/");
LoginPage LoginToFaceBook = PageFactory.initElements(driver, LoginPage.class);
LoginToFaceBook.Login("aaaa@gmail.com", "123456");
driver.close();
driver.quit();
}
	
	
}
