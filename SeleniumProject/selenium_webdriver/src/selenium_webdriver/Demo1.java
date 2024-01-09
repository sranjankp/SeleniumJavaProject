package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\sranjank\\Music\\Selenium Project\\selenium_webdriver\\Driver\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("http://omayo.blogspot.com/");
		d.manage().window().maximize();
		WebElement r = d.findElement(By.id("multiselect1"));
		Select s= new Select(r);
		Thread.sleep(5000);
		s.selectByVisibleText("Volvo");
		Thread.sleep(5000);
		s.selectByVisibleText("Audi");
		Thread.sleep(5000);
		s.deselectByVisibleText("Audi");
		Thread.sleep(5000);
		d.quit();

	}

}
