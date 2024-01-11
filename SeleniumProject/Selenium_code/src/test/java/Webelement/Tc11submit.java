package Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tc11submit {
	public static void main(String[] args) throws InterruptedException {
	    WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
		driver.get("http://www.omayo.blogspot.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@class='gsc-input']")).sendKeys("ranjan181995@gmail.com");
		Thread.sleep(4000);
	    driver.findElement(By.xpath("//input[@value='Search']")).submit();
		//driver.findElement(By.xpath("//input[@value='Search']")).click();
}
}