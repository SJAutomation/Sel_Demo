package sel2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class iframe {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		
		//System.setProperty("webdriver.chrome.driver", "D://Downloads//Software Downloads//Drivers//ChromeDriver 114//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/main/ul/li[4]/a")).click();
		driver.switchTo().defaultContent();
		//driver.switchTo().parentFrame();
		
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.xpath("/html/body/main/div/section[1]/ul/li[3]/a")).click();
		driver.switchTo().defaultContent();
		//driver.switchTo().parentFrame();
		
		driver.switchTo().frame("classFrame");
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/header/nav/div[1]/div[1]/ul/li[2]")).click();
		
		//driver.close();
	}

}
