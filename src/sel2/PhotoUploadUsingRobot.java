package sel2;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PhotoUploadUsingRobot {

	
	//String TestURL2,Username2,Password2;
		public WebDriver driver;
		public PhotoUploadUsingRobot()
		{
			this.driver=driver;
		}
		
		
		@DataProvider(name="PhotoData")
		public  Object[][] photopath()
		{
			return new Object[][]
			{
			
				{"Anuja","Shinde","C:\\Users\\ABC\\Pictures\\Saved Pictures\\Girl.jpg"},
			
			
		    };
			
		}
		@Test(dataProvider="PhotoData")
		public void hello(String Firstname, String LastName,String PhotoPath) throws IOException, AWTException, InterruptedException
		{
			 
			/* TC2_ExcelTest exceltest=new TC2_ExcelTest();
			 Firstname=exceltest.getCellData("C:\\Users\\ABC\\eclipse\\OrangeHRMApp\\Excel Files\\User_Login_Input.xlsx","Sheet3",0,0);
			 LastName=exceltest.getCellData("C:\\Users\\ABC\\eclipse\\OrangeHRMApp\\Excel Files\\User_Login_Input.xlsx","Sheet3",0,1);
			// EmpId=exceltest.getCellData("C:\\Users\\ABC\\eclipse\\OrangeHRMApp\\Excel Files\\User_Login_Input.xlsx","Sheet3",0,2);
			 PhotoPath=exceltest.getCellData("C:\\Users\\ABC\\eclipse\\OrangeHRMApp\\Excel Files\\User_Login_Input.xlsx","Sheet3",0,3); */
			 
			//System.setProperty("webdriver.chrome.driver", "D://Downloads//Software Downloads//ChromeDriver 103//chromedriver.exe");
				WebDriver driver=new ChromeDriver();

				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//button[@type='submit']")).click();
				Thread.sleep(3000);
			   //PIM ---> Employees List
			   driver.findElement(By.xpath("//span[text()='PIM']")).click();
			   driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
			   
			  // driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr[1]/td[3]/a")).click();
			  // driver.findElement(By.xpath("//*[@id=\"empPic\"]")).click();
			   //Add Button
			    //driver.findElement(By.id("btnAdd")).click();
			   
			   //Add Employee
			   //Fname
			   /*
			  driver.findElement(By.id("firstName")).sendKeys(Firstname);
			   
			   //Lname
			//   driver.findElement(By.id("lastName")).sendKeys(LastName);
			   
			   //Emp id
			   WebElement empid= driver.findElement(By.id("employeeId"));
			   empid.clear();
			   empid.sendKeys("0401"); 
			   
			   */
			   //Upload Img
			   WebElement choosebtn=  driver.findElement(By.xpath("//button[@class='oxd-icon-button oxd-icon-button--solid-main employee-image-action']"));
				   Actions act=new Actions(driver);
				   act.moveToElement(choosebtn);
				   act.click().perform();
				   
				   Thread.sleep(2000);
				   PhotoUpload(PhotoPath);
				   Thread.sleep(2000);
			   
			 /* WebElement photodbtn=  driver.findElement(By.id("empPic"));
			   Actions act=new Actions(driver);
			   act.moveToElement(photodbtn);
			   act.click().perform();
			   
			   Thread.sleep(2000);
			   
			  */
			   
				 Actions act1=new Actions(driver);
			   WebElement Savebtn=  driver.findElement(By.xpath("//input[@id='btnSave']"));
			   act1.moveToElement(Savebtn);
			   act1.click().perform();
			   
			   System.out.println("Image Uploaded Sucessfully...");
			   
			    
			   
			/*     WebElement dob= driver.findElement(By.xpath("//*[@id=\"personal_DOB\"]"));
				  dob.click();
				  dob.sendKeys("2015-07-18");
				  
				  //driver.findElements(Keys.ENTER);   */
				  
				
			   	   // Actions act1=new Actions(driver);
				    WebElement Savebtn1=  driver.findElement(By.xpath("//button[@type='submit']"));
					 
					   
					   act1.moveToElement(Savebtn1);
					   act1.click().perform();     
			   
			  
			   
			   
			  /* WebElement savebtn =driver.findElement(By.id("btnSave"));
			  // savebtn.click();
			  act.moveToElement(savebtn);
			  act.click().perform();  
			 
			  //driver.findElement(By.xpath("//*[@id=\"btnSave\"]")).click();  */
		}

		public void PhotoUpload(String PhotoPath) throws InterruptedException, AWTException, HeadlessException 
		{
			//PhotoUpload exceltest=new PhotoUpload();
			StringSelection str=new StringSelection(PhotoPath);
			try {
				Toolkit.getDefaultToolkit().getSystemClipboard().getContents(str);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			
			Robot robot=new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			
			 Thread.sleep(2000);
			
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_V);
			
			 Thread.sleep(2000);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			
			Thread.sleep(3000);
			
			
			
			
			
			
			
		}

}
		
