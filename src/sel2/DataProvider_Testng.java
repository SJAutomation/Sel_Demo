package sel2;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utility.DataProviders;
import Utility.XLUtility;

public class DataProvider_Testng {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup() throws Exception
	{
		//System.setProperty("webdriver.chrome.driver", "D://Downloads//Software Downloads//Drivers//ChromeDriver 105//chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().getPageLoadTimeout();
		Duration.ofSeconds(5);
		driver.manage().window().maximize();
		
	}
	
	
	
	
	
	@Test(dataProvider="LoginData2",dataProviderClass = DataProvider_Testng.class)
	public void loginTest(String user,String pwd,String exp)
	{
		 //WebDriverWait wait = new WebDriverWait (driver, 40);

			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  driver.findElement(By.name("username")).sendKeys(user);
		  driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
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
				  //wait.until(ExpectedConditions.elementToBeClickable(Welcome)).click();
				  Assert.assertTrue(true);
				  
			  }
			  else
			  {
				  Assert.assertTrue(false);
			  }
				
		  }
		  // //Negative Testing
		  else if(exp.equalsIgnoreCase("Invalid"))
		  {
			  if(exp_title.equalsIgnoreCase(act_title))
			  	{
				  
				/*  WebElement Welcome= driver.findElement(By.xpath("//*[@id=\"welcome\"]"));

				  JavascriptExecutor js=(JavascriptExecutor) driver;
				  js.executeScript("arguments[0].click();",Welcome);
				  */
				 
				 
				 // WebElement Welcome= driver.findElement(By.xpath("//*[@id=\"welcome\"]"));
				  //wait.until(ExpectedConditions.elementToBeClickable(Welcome)).click();
				Assert.assertTrue(false);
			  	}
			  else
			  {
			  Assert.assertTrue(true);
			  }
			
		  }
	}
	  

	
	


	@DataProvider(name="LoginData2")
	public static String[][] getData() throws IOException
	{
		/*  return new String[][]
				  
			{
					{"Admin","admin123","Valid"},
					{"admin","adm","Invalid"},
					{"adm","admin123","Invalid"},
					{"admin12","admin1234","Invalid"}
					
					
			};
			
			*/
	
			
		String path=".\\Excel Files\\User_Login_input.xlsx";
		XLUtility xlutil=new XLUtility(path);
	
		int totalrows=xlutil.getRowCount("Sheet4");
		int totalcols=xlutil.getCellCount("Sheet4", 2);
		
		
		String loginData[][]=new String[totalrows][totalcols];
		
		for(int i=1;i<=totalrows;i++)
		{
			for(int j=0;j<totalcols;j++)
			{
				loginData[i-1][j]=xlutil.getCellData("Sheet4", i, j);
				
			}
			
		}
		
		
		return loginData;
		
	}
	

//}

@AfterTest
public void tearDown()
{
	driver.close();
}

}


