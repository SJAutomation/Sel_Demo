package sel2;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utility.XLUtility;

public class DataDrivenTest_ExcelTestNG_DataProvider {
	
	
	 public  WebDriver driver;



		
		
		@BeforeTest
		public void setup() throws Exception
		{
			//System.setProperty("webdriver.chrome.driver", "D://Downloads//Software Downloads//Drivers//ChromeDriver 105//chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().timeouts().getPageLoadTimeout();
			Duration.ofSeconds(5);
			driver.manage().window().maximize();
			
		}
		
		
		
		
		@Test(dataProvider="LoginData")
		public void loginTest(String user,String pwd,String exp) throws Exception
		{
			// WebDriverWait wait = new WebDriverWait (driver, 40);

				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			  driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
			  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
			  driver.findElement(By.xpath("//button[@type='submit']")).click();
			 
			  String exp_title="OrangeHRM";
			  String act_title= driver.getTitle();
			  
			  //Positive Testing
			  if(exp.equalsIgnoreCase("Valid"))
			  {
				  if(exp_title.equalsIgnoreCase(act_title))
				  {
					 /* Actions act=new Actions(driver);
					 				  act.moveToElement(Welcome).click();*/
					 // wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.partialLinkText("Welcome")))).click();
					  //WebElement Welcome= driver.findElement(By.xpath("//*[@id=\"welcome\"]"));

					 // JavascriptExecutor js=(JavascriptExecutor) driver;
					  //js.executeScript("arguments[0].click();",Welcome);
					 // WebElement Welcome= driver.findElement(By.xpath("//*[@id=\"welcome\"]"));
					 // wait.until(ExpectedConditions.elementToBeClickable(Welcome)).click();
					  Assert.assertTrue(true);
					  driver.findElement(By.xpath("//img[@alt='profile picture']")).click();
					  driver.findElement(By.xpath("//a[text()='Logout']")).click();
				  }
				  else
				  {
					  Assert.assertTrue(false);
					  driver.findElement(By.xpath("//img[@alt='profile picture']")).click();
					  driver.findElement(By.xpath("//a[text()='Logout']")).click();
				  }
					
			  }
			  // //Negative Testing
			  else if(exp.equalsIgnoreCase("InValid"))
			  {
				  if(exp_title.equalsIgnoreCase(act_title))
				  	{
					  
					/*  WebElement Welcome= driver.findElement(By.xpath("//*[@id=\"welcome\"]"));

					  JavascriptExecutor js=(JavascriptExecutor) driver;
					  js.executeScript("arguments[0].click();",Welcome);
					  
					 
					 
					  Actions act=new Actions(driver);
						 
					  WebElement Welcome= driver.findElement(By.xpath("//*[@id=\"welcome\"]"));
					  act.moveToElement(Welcome).click(); 
					 wait.until(ExpectedConditions.elementToBeClickable(Welcome)).click();
					 driver.findElement(By.xpath("//a[text()='Logout']")).click();    */
					  driver.findElement(By.xpath("//img[@alt='profile picture']")).click();
					  driver.findElement(By.xpath("//a[text()='Logout']")).click();
					Assert.assertTrue(false);
					
				  	}
				  else
				  {
				  Assert.assertTrue(true);
				  driver.findElement(By.xpath("//img[@alt='profile picture']")).click();
				  driver.findElement(By.xpath("//a[text()='Logout']")).click();
				  }
				
			  }
		}
		  

		@DataProvider(name="LoginData")
		public Object[][] getData()
		{
			Object  loginData[][]=
				{
						{"Admin","admin123","Valid"},
						{"admin","adm","Invalid"},
						{"adm","admin123","Invalid"},
						{"admin12","admin1234","Invalid"},
						
				};
			return loginData;
		}



	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
	}
		
