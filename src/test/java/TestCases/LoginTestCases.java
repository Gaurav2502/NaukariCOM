package TestCases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
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
	public void VerifyWithValidData() throws InterruptedException, IOException, AWTException {
		
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
		
		vpo.ClickDelete().click();
		vpo.ClickConDelete().click();
		
		
		
		String projectPath=System.getProperty("user.dir");
		//"E:\\Technogekkos\\Testing_Prgram\\PracticeProject\\Files\\Gaurav Arundekar-Resume.pdf";
		
		
		Robot robot = new Robot();
		
		StringSelection stringSelection = new StringSelection(projectPath+"\\Files\\Gaurav Arundekar-Resume.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		
		vpo.ClickUpload().click();
		
		robot.setAutoDelay(2000);

	    robot.keyPress(KeyEvent.VK_CONTROL);
	    robot.keyPress(KeyEvent.VK_V);
	    robot.keyRelease(KeyEvent.VK_V);
	    robot.keyRelease(KeyEvent.VK_CONTROL);
	    robot.keyPress(KeyEvent.VK_ENTER);
	    robot.keyRelease(KeyEvent.VK_ENTER);
	    
		
		vpo.ClickEdit().click();
		vpo.EnterResumeHeadline().clear();
		vpo.EnterResumeHeadline().sendKeys(TestData.ResumeHeadline);
		
		commonMethods.handleExplictWait(driver, 10, vpo.SaveBtn());
		vpo.SaveBtn().click();
		
		vpo.ClickProfile().click();
		vpo.ClickLogOut().click();
		
		
	
	}
	
	
}
