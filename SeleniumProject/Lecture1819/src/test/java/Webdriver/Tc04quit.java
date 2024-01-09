package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tc04quit {
public static void main(String[] args) {
		
	    WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
		driver.get("http://www.omayo.blogspot.com");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Blogger")).click();
		driver.quit();
	
		
	}

}
