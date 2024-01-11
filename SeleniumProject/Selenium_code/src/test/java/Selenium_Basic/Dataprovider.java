package maven1;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;


public class Dataprovider {
	@Test(dataProvider="getData")
	public void flipkart(String datas) {
		
	
		WebDriver d= new ChromeDriver();
        d.get("http://www.omayo.blogspot.com");
		d.get(datas);
		d.manage().window().maximize();
		
	}
	
	@DataProvider
	public String[] getData() {
		String data []=new String[3];
		  data[0] = "http://omayo.blogspot.com/";
		  data[1] = "http://omayo.blogspot.com/";
		  data[2] = "http://omayo.blogspot.com/";
		
		
		return data;
		
	}
}
