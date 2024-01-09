package Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tc03close {
public static void main(String[] args) throws InterruptedException {
		
	   WebDriverManager.chromedriver().setup();
	   ChromeOptions options = new ChromeOptions();
	   options.addArguments("--remote-allow-origins=*");
	   WebDriver driver = new ChromeDriver(options);
	   driver.get("http://www.msn.com");
	   driver.manage().window().maximize();
	   Thread.sleep(30000);
	   driver.close();
	
		
	}

}
