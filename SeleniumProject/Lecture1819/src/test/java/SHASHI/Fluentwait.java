package SHASHI;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fluentwait {

	public static void main(String[] args) throws InterruptedException {
	

		 WebDriverManager.chromedriver().setup();
	     WebDriver driver = new ChromeDriver();
	     Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
	    		  .withTimeout(Duration.ofSeconds(10))
	    		  .pollingEvery(Duration.ofSeconds(1))
	    		  .ignoring(NoSuchElementException.class);
		 driver.get("http://www.omayo.blogspot.com");
		 driver.manage().window().maximize();
		 driver.findElement(By.className("dropbtn")).click();
		 WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Facebook")));
		 element.click();	
		 /*driver.navigate().back();
		 Thread.sleep(3000);
		 driver.findElement(By.className("dropbtn")).click();
		 driver.findElement(By.linkText("Flipkart")).click(); */
		

	}

}
