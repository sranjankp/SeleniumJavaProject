package maven1;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class calender {

	public static void main(String[] args) throws InterruptedException {
	    WebDriver d = new ChromeDriver();
		d.get("https://www.path2usa.com/travel-companions");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10000,TimeUnit.SECONDS);
		d.findElement(By.id("travel_date")).click();
		Thread.sleep(2000);
while(!d.findElement(By.className("datepicker-switch")).getText().contains("December")) {
			
			d.findElement(By.className("next")).click();
			
		}

List<WebElement> days = d.findElements(By.xpath("//td[@class='active day' or @class='day']"));

for(int i=0;i<days.size();i++) {
	
	if(days.get(i).getText().equals("15")) {
		
		days.get(i).click();
		break;
		
	}
	
}

		Thread.sleep(5000);
		d.quit();
	}

}
