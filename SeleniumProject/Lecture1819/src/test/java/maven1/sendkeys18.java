package maven1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sendkeys18 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver d= new ChromeDriver();
		d.get("http://omayo.blogspot.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10000,TimeUnit.SECONDS);
		WebElement r = d.findElement(By.name("userid"));
		WebElement p = d.findElement(By.name("pswrd"));
		Actions a= new Actions(d);
		Thread.sleep(2000);
		r.sendKeys("shashi@1234");
		Thread.sleep(2000);
		a.sendKeys(Keys.TAB).perform();
		Thread.sleep(2000);
		p.sendKeys("ranjan@1234");
		Thread.sleep(2000);
		a.sendKeys(Keys.TAB).perform();
		Thread.sleep(2000);
		a.sendKeys(Keys.ENTER).perform();
		Thread.sleep(5000);
		
		
		d.quit();

	}

}
