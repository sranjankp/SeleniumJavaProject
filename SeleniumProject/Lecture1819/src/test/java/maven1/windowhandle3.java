package maven1;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class windowhandle3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver d= new ChromeDriver();
		d.get("http://omayo.blogspot.com/");
		d.manage().window().maximize();
		Thread.sleep(3000);
		d.findElement(By.linkText("Blogger")).click();
		Set<String> win = d.getWindowHandles();
		Iterator<String> i=win.iterator();
		String M= i.next();
		String c = i.next();
		d.switchTo().window(c);
		Thread.sleep(3000);
		d.close();
		d.switchTo().window(M);
		Thread.sleep(3000);
		d.findElement(By.linkText("Open a popup window")).click();
		Thread.sleep(3000);
	Set<String> Win = d.getWindowHandles();
	
	Iterator<String> it=Win.iterator();
String p=null;
	while (it.hasNext())
	{
		String m = it.next();
		d.switchTo().window(m);
		if(d.getTitle().equals("Basic Web Page Title"))
		{	
			System.out.println(d.getTitle());
		p = d.findElement(By.xpath("//p[@id='para1']")).getText();	
		System.out.println(p);
		d.close();
		}
		}
	Thread.sleep(3000);
	d.switchTo().window(M);
	d.findElement(By.id("link1")).click();
	Thread.sleep(3000);
	d.quit();

	}

}
