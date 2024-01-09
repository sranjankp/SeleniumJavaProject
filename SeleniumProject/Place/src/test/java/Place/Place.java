package Place;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Place {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver= new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10000,TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/");
		WebElement frames = driver.findElement(By.xpath("//iframe[@name='callout']"));
		driver.switchTo().frame(frames);
		driver.findElement(By.xpath("//button[text()='No thanks']")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("20 best place in india");
		driver.findElement(By.name("btnK")).click();
	    driver.findElement(By.xpath("//h3[text()='20 Best Places to Visit in India']")).click();
	    int j=1;
	   /* List<WebElement> name = driver.findElements(By.xpath("//h2[@class='sitename']"));
	    for(WebElement place:name)
	    {
	    	String P = place.getText();
	        System.out.println(P);	    
           
	    }*/
 /*  for(int i=1;i<=20;i++)
	    {
	    	
	   String s = driver.findElement(By.xpath("//h2[@class='sitename']["+j+"]")).getText();
		System.out.println(s);
		j++;
	    }*/
		  while(driver.findElement(By.xpath("//h2[@class='sitename']["+j+"]")).isDisplayed())
	    {
	    	
	 	   String s = driver.findElement(By.xpath("//h2[@class='sitename']["+j+"]")).getText();
	 		System.out.println(s);
	 		j++;
	    }
	   
	    driver.close();
	}

}
