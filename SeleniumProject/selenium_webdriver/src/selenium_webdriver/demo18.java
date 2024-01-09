package selenium_webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo18 {

	public static void main(String[] args)   {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sranjank\\Music\\Selenium Project\\selenium_webdriver\\Driver\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("http://omayo.blogspot.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(1500,TimeUnit.SECONDS);
		/*WebElement r = d.findElement(By.id("iframe2"));
		//d.switchTo().frame(r);
		Thread.sleep(5000);
		//d.switchTo().defaultContent();
		
		d.findElement(By.id("ta1")).sendKeys("shashi ranjan ");
		Thread.sleep(5000);*/
        d.quit();
		
		
		
	
	}

}
