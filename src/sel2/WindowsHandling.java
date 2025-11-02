package sel2;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowsHandling {
	public WebDriver driver;
	
	
	public static void main(String args[]) throws Exception
	{
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		
		
		//System.setProperty("webdriver.chrome.driver", "D://Downloads//Software Downloads//ChromeDriver 103//chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		Thread.sleep(2000);
		
	   
		 
		 //getWindowhandle()
	/*	  String parentwin=driver.getWindowHandle();
		 String childwin=driver.getWindowHandle();
		  System.out.println("parent Window ID :"+ parentwin);
		  System.out.println("child Window ID :"+ childwin);   */
		  
		  
		
		 WebElement secondwin= driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']"));
		 secondwin.click();
		 
		  //getWindowhandles()
		  Set<String> windowIDs=driver.getWindowHandles();
		
		/* 
		  for(String winid:windowIDs)
			  {
			     System.out.println(windowIDs);
			    System.out.println(driver.switchTo().window(winid).getTitle()); 
			  }
		  */
	  
		 int winsize= windowIDs.size();
		 String winnames;
		 for(int i=0;i<winsize;i++)
		 {
			  Iterator<String> windows= windowIDs.iterator();
		       winnames = windows.next();
		      System.out.println(driver.switchTo().window(winnames).getTitle());
		      
		   /*   System.out.println(driver.getTitle());
		      String winname2 = windows.next();
		     // System.out.println(winnames);
		      driver.switchTo().window(winname2);
		      System.out.println(driver.getTitle());
		      //System.out.println( driver.switchTo().parentFrame().getTitle());
		       * */
		       
		     
		 }
		 
		 
		
		 //Iterator method -1st
		 
	/*	 Iterator<String> it=windowIDs.iterator();
		 String parentID=it.next();
		 String childID=it.next();
		  System.out.println("parent Window ID :"+ parentID);
		  System.out.println("child Window ID :"+ childID);    */
		 
		  
		   //Using List/ArrayList-2nd
		  
		/*  List<String> windowIDList=new ArrayList(windowIDs);  //converting set into List
		  String parentWinID=windowIDList.get(0);
		  String childWinID=windowIDList.get(1);
		  System.out.println("parent Window ID :"+ parentWinID);
		  System.out.println("child Window ID :"+ childWinID);
		  
		  //Switching between Windows
		  
	      driver.switchTo().window(parentWinID);  //parent
		  System.out.println(driver.getTitle());
		  
		  
		  
		  driver.switchTo().window(childWinID); //child
		  System.out.println(driver.getTitle());   
		  
		 
		  
		  //For-each loop
	/*	  for(String windowsIDList:windowIDList)
		  {
			  //System.out.println(windowsIDList);
			  driver.switchTo().window(windowsIDList);
			  System.out.println(driver.getTitle());
		  }
		 
		  
		  driver.close();
		 // driver.quit();
		  
		*/  
		  
/*	  for(String windowsIDList:windowIDList)
		  {
			  //System.out.println(windowsIDList);
			  String currentWinTitle=driver.switchTo().window(windowsIDList).getTitle();
			  System.out.println(currentWinTitle);
			  
			  

			  if(currentWinTitle.equalsIgnoreCase("OrangeHRM"))
			  {
				  driver.close();
			  }
		 
			/*  if(currentWinTitle.equalsIgnoreCase("OrageHRM") || currentWinTitle.contains("Free & Open Source HR Software "))
			  {
				  driver.close();
			  }  
		  }  
		  */
		  
		
		
	}
	}



