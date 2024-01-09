package Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tc08isSelected {
	public static void main(String args[]) {

		
		 WebDriverManager.chromedriver().setup();
	     WebDriver driver = new ChromeDriver();	
		 driver.get("http://www.omayo.blogspot.com");
		 driver.manage().window().maximize();	 
		 boolean b = driver.findElement(By.xpath("//input[@name='vehicle'][2]")).isSelected();		 
		 System.out.println(b);  //Prints true
		 boolean c = driver.findElement(By.xpath("//input[@name='vehicle'][1]")).isSelected();
		 System.out.println(c);  //Prints false
		 
		 
	}


}
