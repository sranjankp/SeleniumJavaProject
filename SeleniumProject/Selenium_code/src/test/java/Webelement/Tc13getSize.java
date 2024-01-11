package Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tc13getSize {
	public static void main(String[] args) throws InterruptedException {
	    WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
		driver.get("http://www.omayo.blogspot.com");
		driver.manage().window().maximize();
		Dimension di = driver.findElement(By.id("but2")).getSize();
		Thread.sleep(1000);
		System.out.println("height="+di.height);
		System.out.println("width="+di.width);
		driver.quit();
	}		
}
