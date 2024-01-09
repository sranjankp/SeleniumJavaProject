package maven1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Practice {
	public static void main(String[] args)  {
	
		WebDriverManager.chromedriver().setup();  
		WebDriver 	d= new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		d.get("http://omayo.blogspot.com/");	}

}
