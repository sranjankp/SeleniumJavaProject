package Properties1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Properties2 {

	public static void main(String[] args) throws IOException {
		Properties p=new Properties();
		FileInputStream f= new FileInputStream("data.Properties");
		p.load(f);

		WebDriverManager.chromedriver().setup();
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver d= new ChromeDriver(co);
		d.get(p.getProperty("URL"));
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10000,TimeUnit.SECONDS);
		d.findElement(By.id("input-email")).sendKeys(p.getProperty("email"));
		d.findElement(By.id("input-password")).sendKeys(p.getProperty("Password"));
		d.findElement(By.xpath("//input[@value='Login']")).click();
		
		
	}

}
