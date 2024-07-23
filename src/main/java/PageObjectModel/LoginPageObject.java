package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject {
	WebDriver driver;
	
	private By HloginBtn=By.xpath("//a[@id='login_Layer']");
	private By usernametxt=By.xpath("//input[@placeholder='Enter your active Email ID / Username']");
	private By passtxt=By.xpath("//input[@placeholder='Enter your password']");
	private By clickLogin=By.xpath("//button[@class='btn-primary loginButton']");
	
	
	
	public LoginPageObject(WebDriver driver) {
		this.driver=driver;
	}

	public WebElement ClickLoginBtn() {
		return driver.findElement(HloginBtn);
	}
	
	
	public WebElement EnterUsername() {
		return driver.findElement(usernametxt);
	}
	
	public WebElement EnterPassword() {
		return driver.findElement(passtxt);
	}
	
	public WebElement ClickLog() {
		return driver.findElement(clickLogin);
	}
	
	
	
	
	
}
