package Assignment1;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver d= new ChromeDriver();
		d.get("http://www.uitestpractice.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		//Selectable Control
				//d.findElement(By.xpath(" //li[contains(text(),'11')]")).click();
				//Thread.sleep(3000);
				
			//Sortable Control
				d.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[11]/div[1]/div[1]/div[1]/span[1]")).click();
				d.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[11]/div[2]/div[1]/div[1]/span[1]")).click();
				d.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[11]/div[3]/div[1]/div[1]/span[1]")).click();
				d.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[11]/div[1]/div[2]/div[1]/span[1]")).click();
				d.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[11]/div[3]/div[2]/div[1]/span[1]")).click();
				Thread.sleep(3000);
			//Dialog Control
				//d.findElement(By.id("create-user")).click();
				//WebElement name = d.findElement(By.id("name"));
				//name.clear();
	
}}
