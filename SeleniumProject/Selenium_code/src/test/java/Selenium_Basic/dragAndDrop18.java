package maven1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dragAndDrop18 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
	    WebDriver d = new ChromeDriver(co);
		d.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10000,TimeUnit.SECONDS);
		Thread.sleep(5000);
		WebElement r = d.findElement(By.id("box5"));
	    WebElement n = d.findElement(By.xpath("//div[@id='box101']"));
		
		Actions a= new Actions(d);
       a.dragAndDrop(r, n).perform();
		Thread.sleep(5000);
		d.quit();

	}

}
