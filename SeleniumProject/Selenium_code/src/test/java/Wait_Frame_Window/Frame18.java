package SHASHI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame18 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
	    WebElement frame = driver.findElement(By.id("navbar-iframe"));
	    driver.switchTo().frame(frame);
	    driver.findElement(By.className("arrow")).click();
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		driver.findElement(By.id("ta1")).sendKeys("shashi ranjan ");
		Thread.sleep(5000);
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		driver.quit();
	}

}
