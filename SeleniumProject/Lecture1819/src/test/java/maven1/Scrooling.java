package maven1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scrooling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
	    driver.get("http://www.omayo.blogspot.com");
		driver.manage().window().maximize();
	    Thread.sleep(3000);
	    WebElement login = driver.findElement(By.xpath("//input[@value='Login']"));
	    Actions a= new Actions(driver);
	    a.scrollToElement(login);

	}

}
