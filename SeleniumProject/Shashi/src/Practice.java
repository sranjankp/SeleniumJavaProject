import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sranjank\\Music\\SeleniumProject\\Shashi\\Driver\\chromedriver.exe");
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver d= new ChromeDriver(co);
		d.manage().window().maximize();
        d.get("http://omayo.blogspot.com"); 
        System.out.println( d.getTitle());
        d.findElement(By.xpath("//a[.='SeleniumTutorial']")).click();
    
        
        	}

}
