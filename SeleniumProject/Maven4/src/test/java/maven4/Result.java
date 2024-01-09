package maven4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import scala.math.Ordering.SymbolOrdering;

public class Result {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver= new ChromeDriver(co);
		Thread.sleep(15000);
        driver.get("http://results.akuexam.net/BEd2ndYr21-23Results2023.aspx");
		driver.manage().window().maximize();
		int i=1; 
		while(i<=100)		{ 	
			if (i<10) {
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("2150153400"+i);
				}
			else {
				driver.findElement(By.xpath("//input[@type='text']")).sendKeys("215015340"+i);
			}
	    	driver.findElement(By.xpath("//input[@value='Show']")).click();
	    	try {
	     	String reg = driver.findElement(By.xpath("(//span[@style='font-weight: 700'])[1]")).getText();
			String name = driver.findElement(By.xpath("(//span[@style='font-weight: 700'])[2]")).getText();
			String per = driver.findElement(By.xpath("(//tr[@align='center'])[4]//td[3]")).getText();
			System.out.println(reg+"="+name+"="+per+"=");}
	    	catch(Exception e) {
	    		System.out.println("blank");
	    	}
	    	finally{
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[.='View another Result']")).click();
			i++;}
			
		}
			
	
	}
}
