package Page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
WebDriver driver;
	public LoginPage(WebDriver ldriver) {
		this.driver=ldriver;
	}
	
@FindBy(how=How.ID,using="email")
WebElement Email;
@FindBy(how=How.ID,using="pass")
WebElement Password;
@FindBy(how=How.ID,using="u_0_b")
WebElement SignInButton;
	
	public void Login(String email, String password) {
		Email.sendKeys(email);
		Password.sendKeys(password);
		SignInButton.click();
	}
	
	
	}


