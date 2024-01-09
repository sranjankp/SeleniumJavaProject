package maven1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Shashi12 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10000,TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("20 best place in india");
	    driver.findElement(By.name("btnK")).click();
	    driver.findElement(By.xpath("//h3[normalize-space()='20 Best Places to Visit in India | PlanetWare']")).click();
	    List<WebElement> name = driver.findElements(By.xpath("//h2[@class='sitename']"));
	    for(WebElement place:name)
	    {
	    	String P = place.getText();
	    	
           System.out.println(P);	   
           }
	    Thread.sleep(3000);
	    driver.close();

	}

}
