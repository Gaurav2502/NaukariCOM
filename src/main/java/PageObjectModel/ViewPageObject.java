package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ViewPageObject {
	WebDriver driver;

	private By ResumeDelete= By.xpath("(//i[@class='icon'])[2]");
	private By confirmDelete= By.xpath("(//button[@class='btn-dark-ot'])[2]");
	//private By UploadResume= By.xpath("//span[@class='dummyUploadNewCTA']");
	private By UploadResume= By.cssSelector(".dummyUploadNewCTA");
	private By Edit= By.xpath("(//div[@class='widgetHead']/span)[2]");
	private By ResumeHeadline=By.xpath("//div[@class='input-field s12']/textarea");
	private By HeadlineSave=By.xpath("(//button[@class='btn-dark-ot'])[3]");
	private By ProfileClick=By.xpath("//div[@class='nI-gNb-drawer__icon']");
	private By Logout=By.xpath("(//a[@class='nI-gNb-list-cta'])[4]");
	
	public ViewPageObject(WebDriver driver) {
		this.driver=driver;
	}


	public WebElement ClickDelete() {
		return driver.findElement(ResumeDelete);
	}
	
	public WebElement ClickConDelete() {
		return driver.findElement(confirmDelete);
	}
	
	public WebElement ClickUpload() {
		return driver.findElement(UploadResume);
	}
	
	public WebElement ClickEdit() {
		return driver.findElement(Edit);
	}
	
	public WebElement EnterResumeHeadline() {
		return driver.findElement(ResumeHeadline);
	}
	
	public WebElement SaveBtn() {
		return driver.findElement(HeadlineSave);
	}
	
	public WebElement ClickProfile() {
		return driver.findElement(ProfileClick);
	}
	
	public WebElement ClickLogOut() {
		return driver.findElement(Logout);
	}
}
