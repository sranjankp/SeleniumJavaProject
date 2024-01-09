package SHASHI;


import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowhandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver= new ChromeDriver(co);
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Open a popup window")).click();
		Thread.sleep(5000);
    Set<String> windowid = driver.getWindowHandles();
	Iterator<String>i=windowid.iterator();
	String mainwindow= i.next();
	String childwindow = i.next();
	driver.switchTo().window(childwindow);
	String text = driver.findElement(By.id("para1")).getText();
   System.out.println(text);
   driver.close();
   driver.switchTo().window(mainwindow);
   driver.findElement(By.id("link1")).click();
   Thread.sleep(3000);
   driver.quit();
  
	
	}

}
