package maven1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keyschord {

	public static void main(String[] args) throws InterruptedException {
		
	    WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10000,TimeUnit.SECONDS);
		WebElement r = d.findElement(By.id("ta1"));
		r.sendKeys("shashi ranjan kumar");
		Thread.sleep(5000);
		r.sendKeys(Keys.chord(Keys.CONTROL,"z"));
		Thread.sleep(5000);
		d.quit();

	}

}
