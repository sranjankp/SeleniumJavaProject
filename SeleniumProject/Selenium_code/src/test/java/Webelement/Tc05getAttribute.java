package Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tc05getAttribute {
public static void main(String[] args) {
		
	    WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
		driver.get("http://www.omayo.blogspot.com");
		driver.manage().window().maximize();
		String str = driver.findElement(By.name("fname")).getAttribute("value");
		System.out.println(str);
		driver.quit();
	
		
	}

}
