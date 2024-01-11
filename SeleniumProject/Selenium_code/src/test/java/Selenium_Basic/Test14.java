package maven1;



import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test14 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver d= new ChromeDriver();
		d.get("http://omayo.blogspot.com/");
		d.manage().window().maximize();
		d.findElement(By.linkText("Open a popup window")).click();
		Thread.sleep(5000);
	      Set<String> r = d.getWindowHandles();
		Iterator<String> it= r.iterator();
		while(it.hasNext())
		{
			String c = it.next();
			System.out.println(c);
		}
		Thread.sleep(5000);
		d.quit();
		
		


	}

}