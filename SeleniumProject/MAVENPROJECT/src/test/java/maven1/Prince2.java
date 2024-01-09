package maven1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Prince2 {
	@Parameters("URL")
	@Test
	public void testHomeD(String url1) {
		System.out.println("Homepage D");
		
		WebDriverManager.chromedriver().setup();  
		WebDriver d =new ChromeDriver();
		d.get(url1);
		d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

}
