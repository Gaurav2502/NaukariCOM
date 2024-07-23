package TestCases;

import java.time.Duration;
import org.testng.annotations.Test;

import resource.BaseClass;
import resource.commonMethods;
import PageObjectModel.LoginPageObject;

public class LoginTestCases extends BaseClass{

	@Test
	public void VerifyWithValidData() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		LoginPageObject lpo= new LoginPageObject(driver);
		lpo.ClickLoginBtn().click();
		
		Thread.sleep(2000);
	
		commonMethods.ActionClick(driver, lpo.EnterUsername());
		lpo.EnterUsername().sendKeys("gaurav.arundekar@gmail.com");
		
		commonMethods.ActionClick(driver, lpo.EnterPassword());
		lpo.EnterPassword().sendKeys("Gaurav@7365");
		
		//commonMethods.ActionClick(driver, lpo.ClickLog());
		
		driver.quit();
		
	}
	
	
}
