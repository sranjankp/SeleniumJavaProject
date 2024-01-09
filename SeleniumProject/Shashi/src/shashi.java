import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class shashi {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sranjank\\Music\\SeleniumProject\\Shashi\\Driver\\chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*"); //<-this is the fix
		WebDriver driver = new ChromeDriver(chromeOptions);
	        driver.get("http://www.omayo.blogspot.com");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//textarea[contains(text(),'cat')]")).clear();

	}

}
