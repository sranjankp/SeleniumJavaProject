package cpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Practice {

	public static void main(String[] args) {
	   // WebDriverManager.chromedriver().setup();
	  //  ChromeOptions co= new ChromeOptions();
		//  co.addArguments("--remote-allow-origins=*");
			WebDriver 	d= new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		d.get("http://omayo.blogspot.com/");
	}

}
