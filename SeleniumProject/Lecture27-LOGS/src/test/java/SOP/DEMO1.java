package SOP;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DEMO1 {

	public static void main(String[] args) throws InterruptedException {
		Logger l = LogManager.getLogger(DEMO1.class.getName());
		l.debug("Test Execution Started");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		l.debug("Chrome Browser got launched");
		driver.get("http://omayo.blogspot.com/");
		l.debug("Omayo Application got opened");
		driver.manage().window().maximize();
		l.debug("Browser got maximized");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.linkText("compendiumdev")).click();
		l.debug("Compendiumdev link got clicked");
		driver.navigate().back();
		l.debug("Browser navigated back to Omayo website");
		driver.navigate().forward();
		l.debug("Browser navigated forward to Compendiumdev page");
		
		if(driver.getTitle().equals("Basic Web Page Title aba=c")) {
			l.info("Success: We are in correct page");
			
		}else {
			
			l.error("Error: We are in wrong page");
			
		}
		Thread.sleep(3000);
		
		driver.close();
		l.debug("Browser got close");
		
	}

}
