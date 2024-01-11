package maven1;

import java.util.concurrent.TimeUnit;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Place {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10000,TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/");
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("20 best place in india");
		driver.findElement(By.name("btnK")).click();
	    driver.findElement(By.xpath("//h3[normalize-space()='20 Best Places to Visit in India | PlanetWare']")).click();

		String Agra = driver.findElement(By.className("sitename")).getText();
		System.out.println(Agra);
		String NewDelhi = driver.findElement(By.xpath("//h2[normalize-space()='2. New Delhi']")).getText();
		System.out.println(NewDelhi);
		String Mumbai = driver.findElement(By.cssSelector("body > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(8) > h2:nth-child(1)")).getText();
		System.out.println(Mumbai);
		String Rajasthan = driver.findElement(By.xpath("//h2[normalize-space()='4. Rajasthan']")).getText();
		System.out.println(Rajasthan);
		String Rishikesh = driver.findElement(By.xpath("//h2[normalize-space()='5. Rishikesh']")).getText();
		System.out.println(Rishikesh);
		String Varanasi = driver.findElement(By.xpath("//h2[normalize-space()='6. Varanasi']")).getText();
		System.out.println(Varanasi);
		String Amritsar = driver.findElement(By.xpath("//h2[normalize-space()='7. Amritsar']")).getText();
		System.out.println(Amritsar);
		String Goa = driver.findElement(By.xpath("//h2[normalize-space()='8. Goa']")).getText();
		System.out.println(Goa);
		String Kerala = driver.findElement(By.xpath("//h2[normalize-space()='9. Kerala']")).getText();
		System.out.println(Kerala);
		String Ajanta = driver.findElement(By.xpath("//h2[normalize-space()='10. Ajanta and Ellora Caves']")).getText();
		System.out.println(Ajanta);
		String Darjeeling = driver.findElement(By.xpath("//h2[normalize-space()='11. Darjeeling']")).getText();
		System.out.println(Darjeeling);
		String Kolkata = driver.findElement(By.xpath("//h2[normalize-space()='12. Kolkata']")).getText();
		System.out.println(Kolkata);
		String Ahmedabad = driver.findElement(By.xpath("//h2[normalize-space()='13. Ahmedabad']")).getText();
		System.out.println(Ahmedabad);
		String Shimla = driver.findElement(By.xpath("//h2[normalize-space()='14. Shimla']")).getText();
		System.out.println(Shimla);
		String Mysore = driver.findElement(By.xpath("//h2[normalize-space()='15. Mysore']")).getText();
		System.out.println(Mysore);
		String Ladakh = driver.findElement(By.xpath("//h2[normalize-space()='16. Ladakh']")).getText();
		System.out.println(Ladakh);
		String Manali = driver.findElement(By.xpath("//h2[normalize-space()='17. Manali']")).getText();
		System.out.println(Manali);
		String Kodagu = driver.findElement(By.xpath("//h2[normalize-space()='18. Kodagu']")).getText();
		System.out.println(Kodagu);
		String Andaman = driver.findElement(By.xpath("//h2[normalize-space()='19. Andaman Islands']")).getText();
		System.out.println(Andaman);
		String McLeod = driver.findElement(By.xpath("//h2[normalize-space()='20. McLeod Ganj']")).getText();
		System.out.println(McLeod);
		
		driver.close();
		
		

	}

}
