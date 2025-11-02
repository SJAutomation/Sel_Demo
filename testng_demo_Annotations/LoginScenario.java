package testng_demo_Annotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginScenario
{
	static WebDriver driver;
	static String URl="https://practicetestautomation.com/practice-test-login/";
	
	@BeforeTest
	public void Setup()
	{
		
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	}
	
	@Test
	public void Login()
	{
	
		driver.get(URl);
		WebElement username=driver.findElement(By.xpath("//input[@id='username']"));
		username.sendKeys("student");
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("Password123");
		WebElement submitbtn=driver.findElement(By.xpath("//button[@id='submit']"));
		submitbtn.click();
		
		System.out.println("Login Success!!!!!");
		
	}
	
	@AfterTest
	public void TearDown() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close();
	}
	

}
