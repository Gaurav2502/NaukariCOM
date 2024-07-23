package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageObjcet {
	WebDriver driver;
	
	private By viewProfile=By.xpath("//div[@class='view-profile-wrapper']/a");
	
	
	public HomePageObjcet(WebDriver driver) {
		this.driver=driver;
	}

	public WebElement clickView() {
		return driver.findElement(viewProfile);
	}
	
	
}
