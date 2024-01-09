package maven1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class java12 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.get("chrome://downloads/");
        Thread.sleep(3000);
        JavascriptExecutor jse=(JavascriptExecutor)driver;
        WebElement shadowdown1= (WebElement) jse.executeScript("return document.querySelector('downloads-manager').shadowRoot.querySelector('#toolbar').shadowRoot.querySelector('#toolbar').shadowRoot.querySelector('#search').shadowRoot.querySelector('#searchInput')");
        String js = "arguments[0].setAttribute('value','Shashi')";
        ((JavascriptExecutor)driver).executeScript(js,shadowdown1);
      //jse.executeScript(js,shadowdown1 );

}}
