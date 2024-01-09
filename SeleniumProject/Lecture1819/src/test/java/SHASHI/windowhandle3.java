package SHASHI;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class windowhandle3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver= new ChromeDriver(co);
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		String Mainwindow = driver.getWindowHandle();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Open a popup window")).click();
		Thread.sleep(3000);
	Set<String> Windows = driver.getWindowHandles();
	/*Iterator<String> itr=Windows.iterator();
    String para1=null;
	while (itr.hasNext())
	{
		String window = itr.next();
		driver.switchTo().window(window);
		if(driver.getTitle().equals("Basic Web Page Title"))
		{	
			System.out.println(driver.getTitle());
		para1 = driver.findElement(By.xpath("//p[@id='para1']")).getText();	
		System.out.println(para1);
		driver.close();
		}
		}*/
	  String para=null;
	for(String winm:Windows){
		driver.switchTo().window(winm);
		if(driver.getTitle().equals("Basic Web Page Title"))
		{	
			System.out.println(driver.getTitle());
		para = driver.findElement(By.xpath("//p[@id='para1']")).getText();	
		System.out.println(para);
		driver.close();
		}
		}
		
		
	
		Thread.sleep(3000);
	driver.switchTo().window(Mainwindow);
	driver.findElement(By.id("link1")).click();
	Thread.sleep(3000);
	driver.quit();

	}

}
