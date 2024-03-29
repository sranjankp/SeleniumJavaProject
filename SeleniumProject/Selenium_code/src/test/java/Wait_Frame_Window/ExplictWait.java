package SHASHI;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplictWait {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriverManager.chromedriver().setup();
		// ChromeOptions co= new ChromeOptions();
	//		co.addArguments("--remote-allow-origins=*");
			WebDriver driver= new ChromeDriver();
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
		 driver.get("http://www.omayo.blogspot.com");
		 driver.manage().window().maximize();
		 driver.findElement(By.className("dropbtn")).click();
		 WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Facebook")));
		 element.click();	
		 driver.navigate().back();
		 Thread.sleep(3000);
		 driver.findElement(By.className("dropbtn")).click();
		 driver.findElement(By.linkText("Flipkart")).click();
		

	}

}
