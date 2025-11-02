package sel2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe_w3schools {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "D://Downloads//Software Downloads//ChromeDriver 103//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_target");
		/*
		driver.switchTo().frame("iframeResult");  //outer iframe
		
		
		driver.switchTo().frame("iframe_a");    //inner iframe
		String text_inneriframe=driver.findElement(By.xpath("/html/body/h1")).getText();
		System.out.println(text_inneriframe);
		
		driver.switchTo().parentFrame();
		
		String text_outeriframe=driver.findElement(By.xpath("/html/body/h2")).getText();
		System.out.println(text_outeriframe);
		Thread.sleep(3000);		
		driver.findElement(By.xpath("/html/body/p[1]/a")).click();  //w3schools.com link
	*/
		
		
		driver.switchTo().frame("iframeResult");  //outer iframe
		
		
		String text_outeriframe=driver.findElement(By.xpath("/html/body/h2")).getText();
		System.out.println(text_outeriframe);
		Thread.sleep(3000);		
		driver.findElement(By.xpath("/html/body/p[1]/a")).click();  //w3schools.com link
		//driver.switchTo().parentFrame();
		
		driver.switchTo().frame("iframe_a");    //inner iframe
		WebElement searchbox=driver.findElement(By.xpath("//*[@id=\"search2\"]"));
		searchbox.sendKeys("css");
		String text_inneriframe=searchbox.getText();
		System.out.println("Entered Text in searchbox is:"+text_inneriframe);
		
		driver.switchTo().parentFrame();

		String textouteriframe1=driver.findElement(By.xpath("/html/body/h2")).getText();
		System.out.println(textouteriframe1);
		
		
		
		
		//driver.close();
	}

}
