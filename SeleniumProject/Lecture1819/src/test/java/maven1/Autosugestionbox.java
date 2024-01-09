package maven1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autosugestionbox {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
	    WebDriver d = new ChromeDriver(co);
		d.get("https://www.makemytrip.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10000,TimeUnit.SECONDS);
		Actions a=new Actions(d);
		WebElement r = d.findElement(By.xpath("//img[@alt='Make My Trip']"));
		a.moveToElement(r).click().build().perform();
		WebElement s= d.findElement(By.id("fromCity"));
		s.click();
		WebElement p = d.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']"));
		p.sendKeys("Goa");
		Thread.sleep(3000);
		p.sendKeys(Keys.DOWN);
		p.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
	//	d.quit();
		
	}

}
