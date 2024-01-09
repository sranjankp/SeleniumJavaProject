package maven1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScroollToElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		 driver.get("http://www.omayo.blogspot.com");
			driver.manage().window().maximize();
	     Thread.sleep(3000);
	     JavascriptExecutor js = (JavascriptExecutor) driver;
	    // js.executeScript("window.scrollBy(0,250)", "");
	     js.executeScript("arguments[0].scrollIntoView(true)", driver.findElement(By.xpath("//input[@value='Login']")));
	}

}
