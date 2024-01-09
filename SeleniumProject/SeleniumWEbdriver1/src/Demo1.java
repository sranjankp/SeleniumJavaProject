import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sranjank\\Music\\SeleniumProject\\SeleniumWEbdriver1\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
		 driver.get("http://www.omayo.blogspot.com");
		 driver.manage().window().maximize();
		 driver.findElement(By.className("dropbtn")).click();
		 WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Facebook")));
		 element.click();	
		/* driver.navigate().back();
		 Thread.sleep(3000);
		 driver.findElement(By.className("dropbtn")).click();
		 driver.findElement(By.linkText("Flipkart")).click();*/
		

	}

}
