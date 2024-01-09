package Test;


import java.io.IOException;
import java.util.Set;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Test1 {
	public static void main(String [] args) throws IOException {
    System.setProperty("webdriver.chrome.driver","C:\\Users\\sranjank\\Music\\SeleniumJavaProject\\SeleniumProject\\Prince\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://omayo.blogspot.com/");
	driver.manage().window().maximize();
	/*driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	WebElement sel = driver.findElement(By.xpath("//a[.='onlytestingblog']"));
	Actions a= new Actions(driver);
	a.moveToElement(sel).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
	String tiu = driver.getTitle();
	String text=null;
     System.out.println(tiu);
	Set<String> win = driver.getWindowHandles();
    Iterator<String> it = win.iterator();
    while(it.hasNext())
    { String c = it.next();
    	driver.switchTo().window(c);
    	if(driver.getTitle().equals("404 Not found")) {
    		 text=driver.findElement(By.xpath("//h2[.='404 Not found']")).getText(); 
    		System.out.println(text);
    	}
    	
    }*/
	      	   
	}

}