package Webelement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tc16findElements {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10000,TimeUnit.SECONDS);
		driver.get("https://www.planetware.com/india/best-places-to-visit-in-india-ind-1-26.htm");
		List<WebElement> name = driver.findElements(By.xpath("//h2[@class='sitename']"));
		    for(WebElement place:name)
		    {
		    	String P = place.getText();
		        System.out.println(P);	    
	           
		    }
	}
}
