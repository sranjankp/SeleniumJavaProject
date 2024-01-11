package very.nice;
import java.util.function.Consumer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeDriverService;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class sample {
	private WebDriver driver;
    private static Actions action;
public static void main(String[] args) throws InterruptedException {
	// TODO Auto-generated method stub
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.get("http://www.uitestpractice.com/");
	//new tab
	driver.findElement(By.xpath("//a[normalize-space()='Visit uitest practice']")).click();
	//new window with video link
	driver.findElement(By.xpath("//a[normalize-space()='Click here to watch videos on C#']")).click();
	//Accordian Control
	driver.findElement(By.xpath("//h3[@id='ui-id-1']")).click();
	driver.findElement(By.xpath("//h3[@id='ui-id-2']//span[@class='ui-accordion-header-icon ui-icon ui-icon-circle-arrow-e']")).click();
	driver.findElement(By.xpath("//h3[@id='ui-id-3']//span[@class='ui-accordion-header-icon ui-icon ui-icon-circle-arrow-e']")).click();
	driver.findElement(By.xpath("//h3[@id='ui-id-4']//span[@class='ui-accordion-header-icon ui-icon ui-icon-circle-arrow-e']")).click();
	//Selectable Control numbers from 1 to 12
    driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[1]")).click();
	driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[2]")).click();
	driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[3]")).click();
	driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[4]")).click();
	driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[5]")).click();
	driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[6]")).click();
	driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[7]")).click();
	driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[8]")).click();
	driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[9]")).click();
	driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[10]")).click();
	driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[11]")).click();
	driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[12]")).click();
	//Dialog Control
    driver.findElement(By.xpath("//span[contains(@class,'ui-button-text')][normalize-space()='Create new user']")).click();
    driver.findElement(By.xpath("//input[@id='name']")).clear();
   driver.findElement(By.id("name")).sendKeys("Rohith");
   driver.findElement(By.id("email")).clear();
   driver.findElement(By.id("email")).sendKeys("Rohith@yes");
   driver.findElement(By.id("password")).clear();
   driver.findElement(By.id("password")).sendKeys("as12asda");
   driver.findElement(By.xpath("//span[normalize-space()='Create an account']")).click();
//Menu Control
   WebElement Salzburg = driver.findElement(By.id("ui-id-15"));
	Actions a= new Actions(driver);
	a.moveToElement(Salzburg).perform();
	Thread.sleep(2000);
	WebElement delphi = driver.findElement(By.id("ui-id-16"));
	a.moveToElement(delphi).perform();
	WebElement sal = driver.findElement(By.id("ui-id-17"));
	a.moveToElement(sal).click();
	Thread.sleep(3000);
	//Progressbar Control
	driver.findElement(By.xpath("//span[normalize-space()='Start Download']")).click();
	Thread.sleep(7000);
	driver.findElement(By.xpath("//body[1]/div[4]/div[3]/div[1]/button[1]")).click();
	//Slider Control
	WebElement Slider = driver.findElement(By.xpath("//div[@class='scroll-bar ui-slider ui-slider-horizontal ui-widget ui-widget-content ui-corner-all']"));
	Thread.sleep(3000);

	Actions moveSlider = new Actions(driver);
	//moveSlider.moveToElement(Slider).clickAndHold().moveByOffset(100, 0).release().perform();
	moveSlider.dragAndDropBy(Slider, -100, 0).perform();
	//Tabs Control
   driver.findElement(By.id("add_tab")).click();
   driver.findElement(By.id("tab_title")).clear();
   driver.findElement(By.id("tab_title")).sendKeys("Life On Earth");
   driver.findElement(By.id("tab_content")).clear();
   driver.findElement(By.id("tab_content")).sendKeys("The existence of diverse definitions of life, as detailed in the previous section, surely means that life is complex and difficult to briefly define. A scientific understanding of living systems has existed since the second half of the 19th century. But the diversity of definitions and lack of consensus among professionals suggest something else as well. As detailed in this section, all organisms on Earth are extremely closely related, despite superficial differences. The fundamental pattern, both in form and in matter, of all life on Earth is essentially identical. Also, as noted in this section, this identity implies that all organisms on Earth are evolved from a single instance of the origin of life");
//Class Demo
   driver.findElement(By.xpath("/html/body/div[5]/div[3]/div/button[1]")).click();
	Select effect = new Select(driver.findElement(By.id("effectTypes")));
   effect.selectByVisibleText("Bounce");
   driver.findElement(By.xpath("//button[@id='button']")).click();
}

}



