package Extent_Report;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class DemoTest {
	ExtentReports extent;
	WebDriver d;
	@BeforeMethod
	public void configuration() 
	{
    String path = System.getProperty("user.dir")+"\\Shashi\\shi.html";
	ExtentSparkReporter repoter=new ExtentSparkReporter(path);
	repoter.config().setReportName("\"Omayo Test Results");
	repoter.config().setDocumentTitle("A Test Results");
	extent =new ExtentReports();
	extent .attachReporter(repoter);
	extent.setSystemInfo("Operating System","Windows 10");
	extent.setSystemInfo("Tested By","Shashi Ranjan");

	
	}
	@Test
	public void mOne() throws InterruptedException
	{  
		ExtentTest eTest = extent.createTest("Test One ");
		System.out.println("class one exicuted");
		WebDriverManager.chromedriver().setup();
		eTest.info("Chrome Browser Launnched");
	    d= new ChromeDriver();
		d.get("http://omayo.blogspot.com/");
	    eTest.info("Navigated to Application");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10000,TimeUnit.SECONDS);
		eTest.fail("Test got failed");
		Assert.assertEquals(d.findElement(By.id("pah")), "PracticeAutomationHereABC");
		
		
	}
	@AfterMethod
	public void mne() throws InterruptedException
	{
		Thread.sleep(3000);
		d.quit();	
	}

	}


