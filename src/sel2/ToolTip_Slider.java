package sel2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ToolTip_Slider {

	public static void main(String[] args) {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		
		//System.setProperty("webdriver.chrome.driver", "D://Downloads//Software Downloads//Drivers//ChromeDriver 114//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		 driver.navigate().to("http://www.jqueryui.com//slider");
		 driver.switchTo().frame(0);
		WebElement slider= driver.findElement(By.xpath("//div[@id='slider']"));
		
		
		 Actions act=new Actions(driver);
		 act.moveToElement(slider).dragAndDropBy(slider, 75, 0).perform();
		 
		
		 //act.
	
/*	 -----------------opening link in a new Tab--------------
	 driver.get("https://www.flipkart.com");
		 driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		 
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("mobiles");  //search mobiles
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();     //Enter or Search
		WebElement leftslider= driver.findElement(By.xpath("//div[@class='_31Kbhn _28DFQy']"));   //Min price Slider
		 Actions act=new Actions(driver);
		 act.moveToElement(leftslider).dragAndDropBy(leftslider, 25, 0).perform();
		
		
		*/ 
		
		 
	/*	// ---------Tooltip-----------
		 driver.get("https://www.amazon.in");
		 WebElement searchbox=driver.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]"));  //search tooltip
			String tootiptext=searchbox.getAttribute("title");
			System.out.println("Tooltip text is:"+tootiptext);
			
			/*Actions act=new Actions(driver);
			act.moveToElement(searchbox).perform();
			System.out.println(searchbox.getText());
			*/
		 
		// driver.quit();
	}

}
