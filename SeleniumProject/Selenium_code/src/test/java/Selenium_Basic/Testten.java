package maven1;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;
public class Testten {
	 @Test

	  public void Testtena() throws Exception {
	  int a=1;
	  int b= 5,c=6;
	  WebDriverManager.chromedriver().setup();
	  ChromeOptions co= new ChromeOptions();
	  co.addArguments("--remote-allow-origins=*");
	  WebDriver d= new ChromeDriver(co);
	  d.get("http://omayo.blogspot.com/");
	  d.manage().window().maximize();
	  if(a==1) {
		  Assert.assertTrue(b<c);
  }
	  if(a==2) {
		  Assert.assertTrue(b>c);
  }
	  if(a==3) {
		throw new SkipException("Skiped test");
  }

}}
