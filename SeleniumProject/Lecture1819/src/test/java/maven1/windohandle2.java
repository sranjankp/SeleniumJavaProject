package maven1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windohandle2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver d= new ChromeDriver();
		d.get("https://stqatools.com/");
		d.manage().window().maximize();
		String m = d.getWindowHandle();
		System.out.println(m);
	//	d.findElement(By.)
	}

}
