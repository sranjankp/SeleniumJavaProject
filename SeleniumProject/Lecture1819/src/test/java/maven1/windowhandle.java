package maven1;


import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowhandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver d= new ChromeDriver();
		d.get("http://omayo.blogspot.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		d.findElement(By.linkText("Open a popup window")).click();
		Thread.sleep(5000);
 Set<String> windowid = d.getWindowHandles();
	Iterator<String>i=windowid.iterator();
	String mainwindow= i.next();
	String childwindow = i.next();
	d.switchTo().window(childwindow);
	String text = d.findElement(By.id("para1")).getText();
   System.out.println(text);
   d.close();
    d.switchTo().window(mainwindow);
    d.findElement(By.id("link1")).click();
    Thread.sleep(2000);
  d.close();
	
	
	}

}
