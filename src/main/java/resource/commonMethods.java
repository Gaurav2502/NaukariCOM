package resource;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObjectModel.LoginPageObject;

public class commonMethods {
	WebDriver driver;
	
	LoginPageObject lpo= new LoginPageObject(driver);
		
	public static void ActionClick(WebDriver driver,WebElement e) {
		Actions a= new Actions(driver);
		a.doubleClick(e).click().perform();
	
	}
	
	public static void handleExplictWait(WebDriver driver,int time, WebElement element ) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(time));
		  wait.until(ExpectedConditions.visibilityOf(element));

	}
}
