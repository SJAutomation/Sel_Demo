package sel2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyScript {
	static WebDriver driver;

	
	public static void main(String[] args) {
		
		
		//ChromeOptions opt=new ChromeOptions();
			//	opt.addArguments("--remote-allow-origins=*");
		
				//System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
				driver=new ChromeDriver();
				driver.get("https://admin-demo.nopcommerce.com/admin");
			//	WebDriverManager.chromedriver().setup();
		try
		{
			
		
		driver.findElement(By.cssSelector("#Email")).clear();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#Email")).sendKeys("admin@yourstore.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#Password")).clear();
		driver.findElement(By.id("Password")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button")).click();
		driver.quit();
	    }
		catch(Exception e)
		{
			
		}
	}
		
	}


