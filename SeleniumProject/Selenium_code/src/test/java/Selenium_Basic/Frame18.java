package maven1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame18 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver d= new ChromeDriver();
		d.get("http://omayo.blogspot.com/");
		d.manage().window().maximize();
	    d.manage().window().fullscreen();
	    WebElement r = d.findElement(By.id("navbar-iframe"));
	    d.switchTo().frame(r);
	    d.findElement(By.id("b-query")).sendKeys("shashi");
		Thread.sleep(5000);
		d.switchTo().defaultContent();
		d.findElement(By.id("ta1")).sendKeys("shashi ranjan ");
		Thread.sleep(5000);
        d.quit();
	}

}
