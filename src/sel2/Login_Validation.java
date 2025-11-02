package sel2;

import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utility.XLUtility;


public class Login_Validation {

	

	 public  WebDriver driver;

	public Login_Validation()
	 {
		 this.driver=driver;
	 }

	


	@BeforeTest
	public void setup() throws Exception
	{
		//System.setProperty("webdriver.chrome.driver", "D://Downloads//Software Downloads//Drivers//ChromeDriver 114//chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().getPageLoadTimeout();
		Duration.ofSeconds(5);
		driver.manage().window().maximize();
		
	}
	
	
	
	
	@Test(dataProvider="LoginData2")
	public void loginTest(String user,String pwd) throws IOException, Exception
	{
		
		
		
		 //WebDriverWait wait = new WebDriverWait (driver, 40);

		//System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\Software Downloads\\Drivers\\ChromeDriver 114\\chromedriver.exe");
	//------	WebDriver driver = new ChromeDriver();
		
		//System.out.println("Hi testng...");
		 try {

			 
			  
				
					
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(user);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		  
		  String result;
		  String path=".\\Excel Files\\User_Login_input.xlsx";
					  
  boolean Welcome= driver.findElement(By.xpath("//a[@class='oxd-main-menu-item active']")).isDisplayed();
					  if(Welcome=true)
					  {
						  result="Pass";
						  XLUtility xlutil1=new XLUtility(path);
						  int nofrows=xlutil1.getRowCount("Sheet5");
						  for(int i11=1;i11<=nofrows;i11++)
						  {
							  xlutil1.setCellData("Sheet5", nofrows, 2, result);
						  }
					  
					  }
					  else
					  {
						  result="Fail";
						  XLUtility xlutil1=new XLUtility(path);
						  int nofrows=xlutil1.getRowCount("Sheet5");
						  for(int i11=1;i11<=nofrows;i11++)
							  xlutil1.setCellData("Sheet5", nofrows, 2, result);
					  }
						  
				  }
				  catch(Exception e)
				  {
					  
					  
				  }
	}   
	
	
		 
	
	@DataProvider(name="LoginData2")
	public String[][] getData() throws IOException
	{
		/*Object  loginData[][]=
			{
					{"Admin","admin123","Valid"},
					{"admin","adm","Invalid"},
					{"adm","admin123","Invalid"},
					{"admin12","admin1234","Invalid"},
					
			};
		return (String[][]) loginData;
		*/
		String path=".\\Excel Files\\User_Login_input.xlsx";
		XLUtility xlutil=new XLUtility(path);
	
		int totalrows=xlutil.getRowCount("Sheet5");
		int totalcols=xlutil.getCellCount("Sheet5", 2);
		
		System.out.println("Total rows are:"+totalrows);
		System.out.println("Total cols are:"+totalcols);
		

	//	String result;
		
		
		String loginData[][]=new String[totalrows][totalcols];
		
		for(int i=1;i<=totalrows;i++)
		{
			for(int j=0;j<totalcols;j++)
			{
				loginData[i-1][j]=xlutil.getCellData("Sheet5", i, j);
				
				
				 
				 
		
				     
			
				
			}
			
		}
		
		return loginData;
		
	}




@AfterTest
public void tearDown()
{
	driver.close();

}
	
/*
		 //String result;
		 //String path=".\\Excel Files\\User_Login_input.xlsx";
		
		 // driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(user);
		  //driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(pwd);
		  //driver.findElement(By.name("Submit")).click();
		 
		/*  try {
			  
			  boolean Welcome= driver.findElement(By.xpath("//*[@id=\"welcome\"]")).isDisplayed();
			  if(Welcome==true)
			  {
				  result="Pass";
				  XLUtility xlutil1=new XLUtility(path);
				  int nofrows=xlutil1.getRowCount("Sheet5");
				  for(int i=1;i<=nofrows;i++)
				  {
					  xlutil1.setCellData("Sheet5", nofrows, 2, "Pass");
				  }
			  
			  }
		  }
		  catch(Exception e)
		  {
			  boolean invalidlogin= driver.findElement(By.xpath("//span[text()='Invalid credentials']")).isDisplayed();
			  if(invalidlogin==true)
			     {
					  result="Fail";
					  XLUtility xlutil1=new XLUtility(path);
					  int nofrows=xlutil1.getRowCount("Sheet5");
					  for(int i=1;i<=nofrows;i++)
						  xlutil1.setCellData("Sheet5", nofrows, 2, "Fail");
					  }
					  
			  
			     }
		  }   
	
		  
		  

	@DataProvider(name="LoginData")
	public String[][] getData() throws IOException
	{
		/*Object  loginData[][]=
			{
					{"Admin","admin123","Valid"},
					{"admin","adm","Invalid"},
					{"adm","admin123","Invalid"},
					{"admin12","admin1234","Invalid"},
					
			};
		return loginData;
		String path=".\\Excel Files\\User_Login_input.xlsx";
		XLUtility xlutil=new XLUtility(path);
	
		int totalrows=xlutil.getRowCount("Sheet5");
		int totalcols=xlutil.getCellCount("Sheet5", 2);
		
		System.out.println("Total rows are:"+totalrows);
		System.out.println("Total cols are:"+totalcols);
		
		
		String loginData[][]=new String[totalrows][totalcols];
		
		for(int i=1;i<=totalrows;i++)
		{
			for(int j=0;j<totalcols;j++)
			{
				loginData[i-1][j]=xlutil.getCellData("Sheet5", i, j);
			}
				
		}
		return loginData;
	}


@AfterTest
public void tearDown()
{
	driver.close();
}
}
	
*/

}

