package Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tc14getLocation {
	public static void main(String[] args) throws InterruptedException {
	    WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
		driver.get("http://www.omayo.blogspot.com");
		driver.manage().window().maximize();
	    Point loc = driver.findElement(By.id("but2")).getLocation();
		Thread.sleep(1000);
		System.out.println("x-cordinate="+loc.x);
		System.out.println("Y-coordinate="+loc.y);
	}

}
