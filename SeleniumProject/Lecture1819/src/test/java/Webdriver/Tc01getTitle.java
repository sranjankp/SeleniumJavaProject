package Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tc01getTitle {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
		  ChromeOptions options = new ChromeOptions();
		   options.addArguments("--remote-allow-origins=*");
		   WebDriver driver = new ChromeDriver(options);
	     driver.get("http://www.msn.com");
		 driver.manage().window().maximize();	
		 String str = driver.getTitle();
		 System.out.println(str);

	}

}
