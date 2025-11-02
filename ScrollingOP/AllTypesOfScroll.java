package ScrollingOP;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllTypesOfScroll {

	static String URL="https://demoqa.com";
	
	public static void main(String[] args) throws InterruptedException {
		
		
		
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		
		d.get(URL);
		
		JavascriptExecutor js=(JavascriptExecutor) d;
		
		//js.executeScript("window.scrollBy(0,500)");		
		
		Thread.sleep(3000);
		
		//js.executeScript("window.scrollBy(0,-300)");
		
		
		//js.executeScript("window.scrollBy(0,document.body.scrollHeight);");
		
		
		WebElement bookstoreicon=	d.findElement(By.xpath("//div[6]//div[1]//div[2]//*[name()='svg']"));
		
		js.executeScript("arguments[0].scrollIntoView();",bookstoreicon);
		//d.quit();
	}

}
