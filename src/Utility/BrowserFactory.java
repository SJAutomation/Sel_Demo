package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {
WebDriver driver;
	
	@Test
	public void chromeSetup()
	{
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver",".\\Drivers\\ChromeDriver 103\\chromedriver.exe");
		//create chrome instance
		driver = new ChromeDriver();
	}
	

	@Test
	public void FirefoxSetup()
	{
	     WebDriverManager.firefoxdriver().setup();
		//System.setProperty(".\\Drivers\\Geckodriver\\geckodriver.exe", "webdriver.gecko.driver");
		//create chrome instance
		driver = new FirefoxDriver();
	}
	

	@Test
	public void EdgeSetup()
	{
		//WebDriverManager.edgedriver().setup();
		System.setProperty("webdriver.edge.driver",".\\Drivers\\EdgeDriver\\msedgedriver.exe");
		//create chrome instance
		driver = new EdgeDriver();
	}
	
	
	@Test
	public void launchURL(String appURL)
	{
		driver.navigate().to(appURL);
	}
	
	@Test
	public void maximizeBrowser()
	{
		driver.manage().window().maximize();
		
	}
	
	

}
