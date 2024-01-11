package SHASHI;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicIteWaite {
	public static void main(String[] args) throws InterruptedException {
		 WebDriverManager.chromedriver().setup();  
		 WebDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 driver.get("http://www.omayo.blogspot.com");
		 driver.manage().window().maximize();
		 driver.findElement(By.className("dropbtn")).click();
		 driver.findElement(By.linkText("Facebook")).click(); 
		 driver.findElement(By.id("email")).sendKeys("8405051259");
		 Thread.sleep(3000);
		 driver.navigate().back();
		 driver.findElement(By.className("dropbtn")).click();
		 driver.findElement(By.linkText("Flipkart")).click(); 
		



		 
		

}
}