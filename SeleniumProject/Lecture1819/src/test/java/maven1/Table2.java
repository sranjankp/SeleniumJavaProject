package maven1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Table2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver d= new ChromeDriver();
		d.get("http://omayo.blogspot.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10000,TimeUnit.SECONDS);
List<WebElement> names = d.findElements(By.xpath("//table[@id='table1']/tbody/tr/td[1]"));
		
		int j=0;
		
		for(int i=0;i<names.size();i++) {
			
			j = i;
			
			if(names.get(i).getText()=="Praveen") {
				
				break;
				
			}
			
		}
		
		String placeXPath = "//table[@id='table1']/tbody/tr["+j+"]/td[3]";
		
		String location = d.findElement(By.xpath(placeXPath)).getText();
		
		System.out.println(location);
		
		d.quit();
	}

}
