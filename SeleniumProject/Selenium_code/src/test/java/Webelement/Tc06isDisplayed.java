package Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tc06isDisplayed {
public static void main(String args[]) {
		
	    WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();	
		driver.get("http://www.omayo.blogspot.com");
		driver.manage().window().maximize();
		boolean b = driver.findElement(By.id("but2")).isDisplayed();
		System.out.println(b); //Prints true if the element is displayed on the page
		boolean c = driver.findElement(By.id("hbutton")).isDisplayed();
		System.out.println(c); //Prints false as the element is not displayed on the page
		driver.quit();
		
	}
	

}
