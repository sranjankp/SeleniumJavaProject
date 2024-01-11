package maven1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lightbox18 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver d= new ChromeDriver();
		d.get("https://www.flipkart.com/");
		d.manage().window().maximize();
	    d.manage().window().fullscreen();
	    Thread.sleep(5000);
        d.findElement(By.xpath("//button[contains(text(),'✕')]")).click(); 
        Thread.sleep(5000);
        d.findElement(By.className("_3704LK")).sendKeys("mobile");
        Thread.sleep(5000);
        d.quit();
	}

}
