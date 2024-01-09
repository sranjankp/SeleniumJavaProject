import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Javsript_Click {

	public static void main(String[] args) {
		WebDriver d= new ChromeDriver();
    	d.get("https://omayo.blogspot.com/");
    	d.manage().window().maximize();
    	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5) );
    	WebElement ele = d.findElement(By.xpath("//a[.='SeleniumTutorial']"));
    	JavascriptExecutor js= (JavascriptExecutor)d;
    	js.executeScript("arguments[0].click()", ele);
    	
	}

}
