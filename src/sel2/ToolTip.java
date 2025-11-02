package sel2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToolTip {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\Software Downloads\\Drivers\\ChromeDriver 114\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		/*
		 
		 driver.get("https://seleniumpractise.blogspot.com/2019/09/bootstrap-tooltip-in-selenium.html");
		WebElement tooltip=driver.findElement(By.xpath("//*[@id='post-body-8011926823050021273']/div[1]/a"));
		Actions act=new Actions(driver);
		
		act.moveToElement(tooltip).perform();
		System.out.println(tooltip.getAttribute("data-original-title"));
		driver.quit();
		
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("document.body.innerHTML",tooltip);
		
	
	*/
		
		
		driver.get("https://jqueryui.com/tooltip/");
		Actions act1=new Actions(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		JavascriptExecutor js=(JavascriptExecutor)  driver;
		//js.executeScript("window.scrollTo(0,document.body.scrollHeight)", "");
		js.executeScript("window.scrollBy(0,250)","");
		
		WebElement tooltip1=driver.findElement(By.xpath("//*[@id='age']")); //Fetch title attribute
		//js.executeScript("arguments[0].scrollIntoView(true)",tooltip1);
		//act1.scrollToElement(tooltip1).moveToElement(tooltip1);
		
	//	WebElement tooltip1=driver.findElement(By.id("age")); //Fetch title attribute
		
		
		//Actions act=new Actions(driver);
		act1.moveToElement(tooltip1).perform();
		System.out.println(tooltip1.getText());
		
	
		
	}

}
