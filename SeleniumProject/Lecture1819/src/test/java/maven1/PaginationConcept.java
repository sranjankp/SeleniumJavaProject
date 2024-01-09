package maven1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PaginationConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/admin/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("demo");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("demo");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn-close']")).click();
		driver.findElement(By.xpath("//*[@id=\"menu-sale\"]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"collapse-4\"]/li[1]/a")).click();
		Thread.sleep(5000);
		String page = driver.findElement(By.xpath("//div[contains(text(),'Showing 1 to 10 of')]")).getText();
        int strt = page.indexOf("(");
        int start = strt+1;
        System.out.println(start);
        int e = page.indexOf("P");
        int end = e-1;
        System.out.println(end);
        String pageno = page.substring(start, end);
        int p=Integer.parseInt(pageno);
        System.out.println(pageno);
		Thread.sleep(5000);
        for(int i=0;i<=p;i++)
        {
        	if(driver.findElement(By.xpath("//td[text()='Dominic Walsh']")).isDisplayed())
        	{
        		driver.findElement(By.xpath("//td[text()='Dominic Walsh']/preceding-sibling::td[3]")).click();
        		break;
        	}
        	else {
        		driver.findElement(By.xpath("//li[contains(@class,' active')]/span/following::li[1]/a")).click();
        	}
        	
                }
		
	}

}
