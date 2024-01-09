package Place;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Practice {

	
	public static void main(String[] args) throws InterruptedException, SQLException {
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "Ranjan@1234");
		Statement statement = connection.createStatement();
		ResultSet resultset = statement.executeQuery("select * from login;\r\n");
		WebDriverManager.chromedriver().setup();
		WebDriverManager.chromedriver().setup();
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver d= new ChromeDriver(co);
		d.get("http://tutorialsninja.com/demo/index.php?route=account/login");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		while(resultset.next())
		{
			d.findElement(By.id("input-email")).sendKeys(resultset.getString("username"));
		    d.findElement(By.id("input-password")).sendKeys(resultset.getString("password"));	
		}
		
	    Thread.sleep(3000);
	 	d.findElement(By.xpath("//input[@value='Login']")).click();
		

}

	}

