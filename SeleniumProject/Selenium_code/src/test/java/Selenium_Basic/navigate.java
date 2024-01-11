package maven1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class navigate {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver d= new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.navigate().to("http://omayo.blogspot.com/");
		String e = d.getTitle();
		String f = d.getCurrentUrl();
		String g = d.getPageSource();
		System.out.println(e);
		System.out.println("--------------------------");
		System.out.println(f);
		System.out.println("----------------------------");
		System.out.println(g);
		
	}

}
