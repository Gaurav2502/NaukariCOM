package resource;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import PageObjectModel.LoginPageObject;

public class commonMethods {
	WebDriver driver;
	
	LoginPageObject lpo= new LoginPageObject(driver);
		
	public static void ActionClick(WebDriver driver,WebElement e) {
		Actions a= new Actions(driver);
		a.doubleClick(e).click().perform();
	
	}
}
