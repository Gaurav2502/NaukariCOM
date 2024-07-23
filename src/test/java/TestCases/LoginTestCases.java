package TestCases;

import java.time.Duration;
import org.testng.annotations.Test;

import resource.BaseClass;
import resource.TestData;
import resource.commonMethods;
import PageObjectModel.HomePageObjcet;
import PageObjectModel.LoginPageObject;
import PageObjectModel.ViewPageObject;

public class LoginTestCases extends BaseClass{

	@Test
	public void VerifyWithValidData() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		LoginPageObject lpo= new LoginPageObject(driver);
		lpo.ClickLoginBtn().click();
		
		commonMethods.handleExplictWait(driver, 10, lpo.EnterUsername());
	
		commonMethods.ActionClick(driver, lpo.EnterUsername());
		lpo.EnterUsername().sendKeys(TestData.username);
		
		commonMethods.ActionClick(driver, lpo.EnterPassword());
		lpo.EnterPassword().sendKeys(TestData.password);
		
		commonMethods.ActionClick(driver, lpo.ClickLog());
		
		HomePageObjcet hpo=new HomePageObjcet(driver);
		hpo.clickView().click();
		
		ViewPageObject vpo = new ViewPageObject(driver);
		vpo.ClickEdit().click();
		vpo.EnterResumeHeadline().clear();
		vpo.EnterResumeHeadline().sendKeys(TestData.ResumeHeadline);
		
		commonMethods.handleExplictWait(driver, 10, vpo.SaveBtn());
		vpo.SaveBtn().click();
		
		vpo.ClickProfile().click();
		vpo.ClickLogOut().click();
		
		
		driver.quit();
	}
	
	
}
