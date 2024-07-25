package resource;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	public static WebDriver driver;
	public Properties prop;
	
	public void initlizleBrowser() throws IOException {
		
		
		FileInputStream fs= new FileInputStream("E:\\Technogekkos\\Testing_Prgram\\PracticeProject\\src\\main\\java\\resource\\data.properties");
		
		prop= new Properties();
		prop.load(fs);
		
		String BrowserName=prop.getProperty("browser");
		
		if (BrowserName.equalsIgnoreCase("Chrome")) {

			driver = new ChromeDriver();

		} else if (BrowserName.equalsIgnoreCase("Firefox")) {

			driver = new FirefoxDriver();

		} else if (BrowserName.equalsIgnoreCase("edge")) {

			driver = new EdgeDriver();

		} else if (BrowserName.equalsIgnoreCase("safari")) {

			driver = new SafariDriver();

		}
		
	}
	
	@BeforeMethod
	public void fetchURL() throws IOException {
		initlizleBrowser();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
	}
	
	public static void FetchResume() throws FileNotFoundException {
		String projectPath=System.getProperty("user.dir");
		
	}
}
