package sel2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
	
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
				
		Actions act=new Actions(driver);
				  
				 act.doubleClick( driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"))).perform();
				 driver.switchTo().alert().accept(); 
				 
				  //driver.quit();
				
	}

}
