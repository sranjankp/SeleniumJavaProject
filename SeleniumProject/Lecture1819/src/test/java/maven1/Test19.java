package maven1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test19 {

	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver d= new ChromeDriver();
	d.get("https://www.path2usa.com/travel-companions");
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
	Thread.sleep(2000);
	d.findElement(By.id("travel_date")).click();
	Thread.sleep(2000);
	while(!d.findElement(By.className("datepicker-switch")).getText().contains("December"))
	{
		d.findElement(By.className("next")).click();
	}
	Thread.sleep(2000);
   List<WebElement> r = d.findElements(By.xpath("//td[@class='active day' or @class='day']"));
	for(int i=0;i<r.size();i++)
	{
		if(r.get(i).getText().equals("15"))
		{
			r.get(i).click();
		}
	}
		
	
	
		//Thread.sleep(1000);
	d.close();

	}

}
