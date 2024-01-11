package maven1;



import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import scala.math.Ordering.SymbolOrdering;

public class Table12 {

	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	ChromeOptions co= new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	WebDriver d= new ChromeDriver(co);
	d.get("http://omayo.blogspot.com/");
	d.manage().window().maximize();
	List<WebElement> r = d.findElement(By.id("table1")).findElements(By.tagName("tr"));
	System.out.println(r.size());
	int rn = r.size();

	for(int i=1; i<=rn-1; i++)
	{
		List<WebElement> c = r.get(i).findElements(By.tagName("td"));
		int cn = c.size();
		System.out.println(cn);
		for(int j=1;j<=cn;j++) {
		String element = d.findElement(By.xpath("//table[@id='table1']//tbody//tr["+i+"]//td["+j+"]")).getText();
		System.out.println("Row: "+i+" Col: "+j+" value: "+element);
		}
	}
	
	//Thread.sleep(3000);
  //  d.close();

	}

}
