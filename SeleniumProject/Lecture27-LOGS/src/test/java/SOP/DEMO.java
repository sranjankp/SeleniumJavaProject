package SOP;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DEMO {
public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Test Execution Started");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		System.out.println("Chrome Browser got launched");
		driver.get("http://omayo.blogspot.com/");
		System.out.println("Omayo Application got opened");
		driver.manage().window().maximize();
		System.out.println("Browser got maximized");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.linkText("compendiumdev")).click();
		System.out.println("Compendiumdev link got clicked");
		driver.navigate().back();
		System.out.println("Browser navigated back to Omayo website");
		driver.navigate().forward();
		System.out.println("Browser navigated forward to Compendiumdev page");
		
		if(driver.getTitle().equals("Basic Web Page Title")) {
			
			System.out.println("Success: We are in correct page");
			
		}else {
			
			System.out.println("Error: We are in wrong page");
			
		}
		Thread.sleep(3000);
		
		driver.close();
		System.out.println("Browser got close");
		
	
	}


}
