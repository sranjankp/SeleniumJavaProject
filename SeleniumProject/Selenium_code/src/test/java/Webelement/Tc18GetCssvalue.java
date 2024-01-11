package Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tc18GetCssvalue {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
	     WebDriver driver = new ChromeDriver();	
		 driver.get("http://www.omayo.blogspot.com");
		 driver.manage().window().maximize();
		 String cssvalue = driver.findElement(By.id("home")).getCssValue("text-align");
         System.out.println(cssvalue);
	}

}
