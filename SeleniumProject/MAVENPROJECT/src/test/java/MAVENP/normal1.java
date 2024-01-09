package MAVENP;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class normal1 {

	public static void main(String[] args) {
    
		WebDriverManager.chromedriver().setup();  
		WebDriver d =new ChromeDriver();
		d.get("http://omayo.blogspot.com/");
		d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		d.findElement(By.id("alert1")).click();
		
		
		
		
		
	}

}
