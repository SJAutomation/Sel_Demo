package uploadFileInSelenium;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UploadDemo 
{
	static String URL="https://demo.automationtesting.in/FileUpload.html";
	static WebDriver driver;
	static String path="C:\\Users\\abc\\Pictures\\Saved Pictures\\nature.jpg";
	
	@BeforeTest
	public void Setup()
	{
		//launch the chrome browser
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(URL);
	}
	
	@Test(enabled=false)
	public void UploadFile_UsingSendkeys()
	{
		
		WebElement browsebtn=driver.findElement(By.xpath("//input[@id='input-4']"));
		browsebtn.sendKeys(path);
		System.out.println("File uploaded Sucessfully!!!!!!!!");
		
		
	}
	
	@Test
	public void UploadFile_UsingClipBoard() throws Exception
	{
		WebElement browsebtn=driver.findElement(By.xpath("//input[@id='input-4']"));
		//browsebtn.click(); // throwing InvaliArgumentException
		
//		JavascriptExecutor jse=( JavascriptExecutor ) driver;
//		Thread.sleep(4000);
//		jse.executeScript("arguments[0].click();",browsebtn);
//	
		   Actions act=new Actions(driver);
		   act.moveToElement(browsebtn);
		   act.click().perform();
		   
		   Thread.sleep(3000);
		   
		    StringSelection str=new StringSelection("C:\\Users\\abc\\Pictures\\Saved Pictures\\nature.jpg");
			Toolkit.getDefaultToolkit().getSystemClipboard().getContents(str);
		
			
			Robot robot=new Robot();
			
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_C);
			
			
			
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_V);
			
			 Thread.sleep(2000);
			
		
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
					   
	}
	
	@AfterTest()
	public void TearDown()
	{
		
	}

}
