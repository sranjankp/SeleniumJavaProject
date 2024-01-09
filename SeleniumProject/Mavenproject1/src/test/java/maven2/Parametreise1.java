package maven2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parametreise1 {
	@Parameters("URL")
	@Test
	public void flipcart(String url1) throws InterruptedException
	{
		System.out.println("flipcart");

		WebDriverManager.chromedriver().setup();  
		WebDriver d =new ChromeDriver();
		d.get(url1);
		d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	//	d.findElement(By.id("alert1")).click();
	//Thread.sleep(4000);
	//d.close();
		
	}
   
	@Test@Parameters("URL")
	public void amazon(String url1) throws InterruptedException
	{
		System.out.println("amazon");

		WebDriverManager.chromedriver().setup();  
		WebDriver d =new ChromeDriver();
		d.get(url1);
		d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		d.findElement(By.id("alert1")).click();
		//Thread.sleep(4000);
		//d.close();
		

		
	}
   
	@Test@Parameters("URL")
	public void phonepay(String url1) throws InterruptedException
	{
		System.out.println("phonepay");

		WebDriverManager.chromedriver().setup();  
		WebDriver d =new ChromeDriver();
		d.get(url1);
		d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		d.findElement(By.id("alert1")).click();
		//Thread.sleep(4000);
	//	d.close();
		
	}
   
	@Test
	public void googlepay()
	{
		System.out.println("googlepay");
	

}}
