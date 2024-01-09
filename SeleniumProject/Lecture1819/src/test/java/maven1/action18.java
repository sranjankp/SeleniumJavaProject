package maven1;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class action18 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver d= new ChromeDriver();
		d.get("http://omayo.blogspot.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10000,TimeUnit.SECONDS);
		WebElement r = d.findElement(By.xpath("//body[1]/div[4]/div[2]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]"));
		Actions a= new Actions(d);
		a.moveToElement(r).perform();
		Thread.sleep(2000);
		WebElement s = d.findElement(By.xpath("//span[contains(text(),'Selenium143')]"));
		a.moveToElement(s).click().build().perform();
		Thread.sleep(5000);
		d.quit();
		
		
	}

}
