package maven1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class java1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.get("https://books-pwakit.appspot.com/");
        JavascriptExecutor jse=(JavascriptExecutor)driver;
        WebElement shadowdown1= (WebElement) jse.executeScript("return document.querySelector('book-app').shadowRoot.querySelector('#input')" );
        String js = "arguments[0].setAttribute('value','Shashi')";
       // ((JavascriptExecutor)driver).executeScript(js,shadowdown1);
       jse.executeScript(js,shadowdown1 );
      //  driver.close();
        
        
	}

}
