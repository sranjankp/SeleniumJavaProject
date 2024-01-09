package mpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class OneTest {
	WebDriver d;
	@Test
	public void mOne() throws InterruptedException
	{   System.out.println("class one exicuted");
		WebDriverManager.chromedriver().setup();
	    d= new ChromeDriver();
		d.get("http://omayo.blogspot.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10000,TimeUnit.SECONDS);
		Assert.assertEquals(d.findElement(By.id("pah")), "PracticeAutomationHereABC");
		
		
	}
	@AfterMethod
	public void mne() throws InterruptedException
	{
		Thread.sleep(3000);
		d.quit();	
	}
}
