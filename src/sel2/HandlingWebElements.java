package sel2;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingWebElements {
	
	
	static WebDriver driver;
	
	@BeforeClass(alwaysRun=true)// Add alwaysRun=true
	@Parameters("browser")
	public void setup(String br) throws IOException,NullPointerException, InterruptedException
	{
       
		try
		{
		
		  if(br.equalsIgnoreCase("chrome")){
				//set path to chromedriver.exe
			 // WebDriverManager.chromedriver().setup();
			 //System.setProperty("webdriver.chrome.driver","./Drivers//chromedriver.exe");
				//create chrome instance
				driver = new ChromeDriver();
			}

		  else if(br.equalsIgnoreCase("Edge")){
				//create firefox instance
				//System.setProperty("webdriver.edge.driver", "./Drivers//msedgedriver.exe");
			  WebDriverManager.edgedriver().setup();	
			  //driver = new EdgeDriver();
		  }
		 

		  else if(br.equalsIgnoreCase("Firefox")){
				//create firefox instance
				//System.setProperty("webdriver.gecko.driver", "./Drivers//geckodriver.exe");
				//WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			}
		 
		  //Thread.sleep(5000);
		 // driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(180));
			 ((WebDriver) driver).manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			}
	
			catch(Exception e)
			{
				System.out.println("Exception is handled....");
			}
     

	
		//WebDriver driver = null;
		

		
			//driver.quit();
	}

	@Test
	public void launchApp() throws InterruptedException
	{
		
		//WebDriver driver;
	
	driver.navigate().to("https://www.facebook.com/signup");
	/*WebElement daydrp=driver.findElement(By.id("day"));
	Select sel=new Select(daydrp);
	
	
	WebElement monthdrp=driver.findElement(By.id("month"));
	Select sel1=new Select(monthdrp);
	
	
	WebElement yeardrp=driver.findElement(By.id("year"));
	Select sel2=new Select(yeardrp);
	
	sel.selectByIndex(17);
	sel1.selectByValue("5");
	sel2.selectByVisibleText("1995");
	//sel.selectByValue("18");
	//sel.selectByVisibleText("18");
	//System.out.println(sel.getFirstSelectedOption().getAttribute("value"));
	//System.out.println(sel.getFirstSelectedOption().getText());
	
	List<WebElement> sel_opt=sel1.getOptions();
	//System.out.println(sel_opt.size());;
	
	for(WebElement allselectedOptions:sel_opt)
	
		System.out.println(allselectedOptions.getText());
	
	 Thread.sleep(3000);
	
		WebElement femaleradiobtn=driver.findElement(By.xpath("//label[text()='Female']"));
		femaleradiobtn.click();
		System.out.println(femaleradiobtn.isSelected());
	*/
	
		
	}
		
	
}	

	


		
		
		/*
		String valueOFRadio=femaleradiobtn.getAttribute("value");
		if(valueOFRadio.equals("1"))
		{
			femaleradiobtn.click();
		}
		*/
		
	

