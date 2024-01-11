package maven1;



	import java.util.List;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class FileUpload {

		public static void main(String[] args) throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			WebDriver d= new ChromeDriver();
			d.get("http://www.uitestpractice.com/");
			d.manage().window().maximize();
			d.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
			d.findElement(By.xpath("//a[normalize-space()='Widgets']")).click();
			Thread.sleep(3000);
	        d.findElement(By.xpath("//input[@id='image_file']")).sendKeys("C:\\Users\\sranjank\\Pictures\\Screenshots\\Screenshot (2).png");
	        

}}
