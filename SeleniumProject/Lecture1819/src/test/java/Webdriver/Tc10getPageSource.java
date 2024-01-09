package Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tc10getPageSource {
	public static void main(String[] args) throws InterruptedException {

		 WebDriverManager.chromedriver().setup();
	     WebDriver driver = new ChromeDriver();	
		 driver.get("http://www.omayo.blogspot.com");
		 driver.manage().window().maximize();
		 String str = driver.getPageSource();
		 System.out.println(str);
		 		 		 
	}

}
