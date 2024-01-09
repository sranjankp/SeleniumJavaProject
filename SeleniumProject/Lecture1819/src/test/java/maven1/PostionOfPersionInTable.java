package maven1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PostionOfPersionInTable {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver d= new ChromeDriver();
		d.get("http://omayo.blogspot.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10000,TimeUnit.SECONDS);
		Thread.sleep(3000);
		List<WebElement>     p= d.findElements(By.xpath("//table[@id='table1']//tr//td[1]"));    
		int row=0;
		for(int i=0;i<p.size();i++)
		{
			if(p.get(i).getText().equals("Praveen"))
			{
		row=i;
			}
	
		}
		Thread.sleep(3000);
		String Path="//table[@id='table1']//tr["+(row+1)+"]//td[3]";
		Thread.sleep(3000);
	    System.out.println(d.findElement(By.xpath(Path)).getText());
        d.quit();
	}
	
	

}
