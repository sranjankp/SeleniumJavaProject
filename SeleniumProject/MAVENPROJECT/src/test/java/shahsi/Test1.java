package shahsi;

import java.util.Set;

import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.sdk.metrics.internal.exemplar.AlwaysOffFilter;


public class Test1 {

	public static void main(String[] args) throws InterruptedException {
	//	WebDriverManager.chromedriver().setup();
	    WebDriver d =new ChromeDriver();
	    d.get("https://omayo.blogspot.com/");
	    Thread.sleep(3000);
	    Actions a=new Actions(d);
	    WebElement sel = d.findElement(By.xpath("(//a[.=' Selenium143 '])[1]"));
	    a.moveToElement(sel).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
	    
	    
	    
	    
		}
	}