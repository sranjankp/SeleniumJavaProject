package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tc09navigate {
	public static void main(String args[]) throws InterruptedException {

		 WebDriverManager.chromedriver().setup();
	     WebDriver driver = new ChromeDriver();	
	     driver.navigate().to("http://www.omayo.blogspot.com");
		// driver.get("http://www.omayo.blogspot.com");
		 driver.manage().window().maximize();
		 driver.findElement(By.linkText("compendiumdev")).click();
		 Thread.sleep(5000);
		 driver.navigate().back();
		 Thread.sleep(5000);
		 driver.navigate().forward();
		 Thread.sleep(3000);
		 driver.navigate().refresh();
		 Thread.sleep(3000);
		 driver.close();
		 
	}

}
