package sel2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class MyScriptWithTestNG {
	
	WebDriver driver;
	
	
	@BeforeTest
	public void getURL()
	{
		driver.get("https://admin-demo.nopcommerce.com/admin");
		
	}
	
	
	@Test
	public void run()
	{
		
		driver.get("https://admin-demo.nopcommerce.com/admin");
		
		driver.findElement(By.cssSelector("#Email")).clear();
		//Thread.sleep(2000);
		driver.findElement(By.cssSelector("#Email")).sendKeys("admin@yourstore.com");
		//Thread.sleep(2000);
		driver.findElement(By.id("Password")).clear();
		//Thread.sleep(2000);
		driver.findElement(By.id("Password")).sendKeys("admin");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button")).click();
	}
	
	@AfterTest
	public void exit()
	{
		driver.quit();
	}
}
	
	
	


