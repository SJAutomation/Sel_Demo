package ScrollingOP;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollTillEle {
	static String url="https://demoqa.com/";
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to(url);
		
		JavascriptExecutor jse=(JavascriptExecutor) driver;//(JSE is a third party tool) -----typecasting of JSE into driver
		//jse.executeScript("window.scrollBy(0,700)",""); //scroll down 700 pixels
	WebElement bookstoreicon=	driver.findElement(By.xpath("//div[6]//div[1]//div[2]//*[name()='svg']"));
	//jse.executeScript("arguments[0].scrollIntoView();", bookstoreicon); //Till webElement
	WebElement formsicon= driver.findElement(By.xpath("//div[@class='home-body']//div[2]//div[1]//div[2]//*[name()='svg']"));
	//jse.executeScript("arguments[1].scrollIntoView();", bookstoreicon,formsicon);
	jse.executeScript("window.scrollBy(0,document.body.scrollHeight)",""); //Till the end of page
	
	}

}
