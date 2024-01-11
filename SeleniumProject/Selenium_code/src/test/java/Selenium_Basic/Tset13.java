package maven1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tset13 {

	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver d= new ChromeDriver();
	d.get("http://omayo.blogspot.com/");
	d.manage().window().maximize();
    d.manage().window().fullscreen();
    List<WebElement> r = d.findElements(By.tagName("a"));
    for(int i=0;i<r.size();i++)
    {
    	if(r.get(i).getText().length()>0)
    	{
    System.out.println(r.get(i).getText());
    }}
	d.quit();

	}

}
