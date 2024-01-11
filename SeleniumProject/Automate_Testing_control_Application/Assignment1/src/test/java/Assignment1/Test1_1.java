package Assignment1;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1_1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver d= new ChromeDriver();
		d.get("http://www.uitestpractice.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(1000000,TimeUnit.SECONDS);
		Thread.sleep(3000);
		
	//Drag and Drop control
		WebElement Drag = d.findElement(By.id("draggable"));
		WebElement Drop= d.findElement(By.id("droppable"));	
		Actions a= new Actions(d);
	    a.dragAndDrop(Drag, Drop).perform();
	    Thread.sleep(3000);
	//Button Double Click
		WebElement  DoubleClick = d.findElement(By.name("dblClick"));
	    a.doubleClick(DoubleClick).perform();
	    Thread.sleep(3000); 
	    Alert alert = d.switchTo().alert();
	    alert.accept();
		Thread.sleep(3000);
		
	//Iframe
	    WebElement frame = d.findElement(By.name("iframe_a"));
	    d.switchTo().frame(frame);
		d.findElement(By.id("name")).sendKeys("SHASHI RANJAN KUMAR");
	    Thread.sleep(3000);
	  
	//click on the below link:
	//uitestpractice.com
		d.switchTo().defaultContent();
		d.findElement(By.xpath("//a[contains(text(),'uitestpractice.com')]")).click();
		Thread.sleep(3000);
		
	//Click on the below button to open link in new Tab
		d.findElement(By.xpath("//a[contains(text(),'Visit uitest practice')]")).click();
		Set<String> SIT = d.getWindowHandles();
		Iterator<String>i=SIT.iterator();
		String m= i.next();
		String c = i.next();
		d.switchTo().window(c);
		Thread.sleep(3000);
		d.close();
		d.switchTo().window(m);
		Thread.sleep(3000);
		
	//Click on the below button to open link in new Window
		d.findElement(By.xpath("//a[contains(text(),'Click here to watch videos on C#')]")).click();
		Set<String> Sit = d.getWindowHandles();
	    Iterator<String> IT= Sit.iterator();
	    String MAIN= IT.next();
		String CHI = IT.next();
		d.switchTo().window(CHI);
		Thread.sleep(10000);
		d.close();
		d.switchTo().window(MAIN);
		Thread.sleep(3000);
		
	//Toggle icons
		d.findElement(By.xpath("//span[contains(text(),'Toggle icons')]")).click();
		Thread.sleep(1000);
		d.findElement(By.id("ui-id-1")).click();
		String MVCFramework= d.findElement(By.xpath("//p[contains(text(),'Mauris mauris ante, blandit et, ultrices a, suscip')]")).getText();
		System.out.println(MVCFramework);
		Thread.sleep(1000);
		d.findElement(By.id("ui-id-2")).click();
		String Selenium = d.findElement(By.xpath("//p[contains(text(),'Sed non urna. Donec et ante. Phasellus eu ligula. ')]")).getText();
		System.out.println(Selenium);
		Thread.sleep(1000);
		d.findElement(By.id("ui-id-3")).click();
		String CodedUI = d.findElement(By.xpath("//p[contains(text(),'Nam enim risus, molestie et, porta ac, aliquam ac,')]")).getText();
		System.out.println(CodedUI);
		Thread.sleep(1000);
		d.findElement(By.id("ui-id-4")).click();
		String MobileAppTesting= d.findElement(By.xpath("//p[contains(text(),'Cras dictum. Pellentesque habitant morbi tristique')]")).getText();
		System.out.println(MobileAppTesting);
		Thread.sleep(1000);
		
	//Selectable Control
		d.findElement(By.xpath(" //li[contains(text(),'1')]")).click();
		 a.keyDown(Keys.CONTROL).perform();
		 d.findElement(By.xpath(" //li[contains(text(),'2')]")).click();
		 d.findElement(By.xpath(" //li[contains(text(),'3')]")).click();
		 d.findElement(By.xpath(" //li[contains(text(),'4')]")).click();
		 d.findElement(By.xpath(" //li[contains(text(),'5')]")).click();
		 d.findElement(By.xpath(" //li[contains(text(),'6')]")).click();
		 d.findElement(By.xpath(" //li[contains(text(),'7')]")).click();
		 d.findElement(By.xpath(" //li[contains(text(),'8')]")).click();
		 d.findElement(By.xpath(" //li[contains(text(),'9')]")).click();
		 d.findElement(By.xpath(" //li[contains(text(),'10')]")).click();
		 d.findElement(By.xpath(" //li[contains(text(),'11')]")).click();
		 d.findElement(By.xpath(" //li[contains(text(),'12')]")).click();
		 a.keyUp(Keys.CONTROL).build().perform();
		 
		Thread.sleep(3000);
		
	//Sortable Control
		/*d.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[11]/div[1]/div[1]/div[1]/span[1]")).click();
		d.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[11]/div[2]/div[1]/div[1]/span[1]")).click();
		d.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[11]/div[3]/div[1]/div[1]/span[1]")).click();
		d.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[11]/div[1]/div[2]/div[1]/span[1]")).click();
		d.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[11]/div[3]/div[2]/div[1]/span[1]")).click();
		Thread.sleep(3000);*/
	//Dialog Control
		d.findElement(By.id("create-user")).click();
		WebElement name = d.findElement(By.id("name"));
		name.clear();
		name.sendKeys("Shashi Ranjan");
		WebElement email = d.findElement(By.id("email"));
		email.clear();
		email.sendKeys("ranjan181995@gmail.com");
		WebElement password = d.findElement(By.id("password"));
		password.clear();
		password.sendKeys("12345");
		Thread.sleep(4000);
		d.findElement(By.xpath("//button[.='Create an account']")).click();
		Thread.sleep(3000);
		
	//Menu Control
	    WebElement delphi = d.findElement(By.id("ui-id-10"));
	    a.moveToElement(delphi).perform();
	    Thread.sleep(2000);
        WebElement saarland = d.findElement(By.id("ui-id-12"));
	    a.moveToElement(saarland).perform();
	    Thread.sleep(2000);     
	    WebElement Salzburg = d.findElement(By.id("ui-id-15"));
	    a.moveToElement(Salzburg).perform();
	    Thread.sleep(2000);
        WebElement delph = d.findElement(By.id("ui-id-16"));
	    a.moveToElement(delph).perform();
	    WebElement sal = d.findElement(By.id("ui-id-19"));
	    Thread.sleep(2000);
	    a.moveToElement(sal).perform();
	    Thread.sleep(3000); 
	    
	 //Progressbar Control
	    d.findElement(By.id("downloadButton")).click();
		Thread.sleep(12000);
		 
	    //d.findElement(By.className("ui-button-text")).click();
		 WebElement slider = d.findElement(By.className("ui-handle-helper-parent"));
		 a.dragAndDropBy(slider , -100, 0).perform();
		 Thread.sleep(3000);
		 
	//	Tabs Control
			d.findElement(By.id("add_tab")).click();
			WebElement addtitle = d.findElement(By.id("tab_title"));
			addtitle.clear();
			addtitle.sendKeys("Narendra Modi");
			WebElement Content = d.findElement(By.id("tab_content"));
			Content.clear();
			Content.sendKeys("Narendra Damodardas Modi (Gujarati: [ˈnəɾendɾə dɑmodəɾˈdɑs ˈmodiː] (listen); born 17 September 1950)[a] is an Indian politician serving as the 14th and current prime minister of India since 2014. Modi was the chief minister of Gujarat from 2001 to 2014 and is the Member of Parliament from Varanasi. He is a member of the Bharatiya Janata Party (BJP) and of the Rashtriya Swayamsevak Sangh (RSS), a right-wing Hindu nationalist paramilitary volunteer organisation. He is the first prime minister to have been born after India's independence in 1947 and the second prime minister not belonging to the Indian National Congress to have won two consecutive majorities in the Lok Sabha, or the lower house of India's parliament. He is also the longest serving prime minister from a non-Congress party.");
			d.findElement(By.xpath("//button[.='Add']")).click();	
			
	//Class Demo
			Thread.sleep(3000);
		    WebElement DropX = d.findElement(By.id("effectTypes"));
		    Select select= new Select(DropX);
	        select.selectByVisibleText("Fade");
	        Thread.sleep(3000);
	        d.findElement(By.id("button")).click();
	        Thread.sleep(3000);
	        
//HOME PAGE
	        
	        d.findElement(By.xpath("//a[.='Home']")).click();
	        //Search
			d.findElement(By.id("Search_Data")).sendKeys("Prakash");
			Thread.sleep(2000);
			//next
			d.findElement(By.xpath("//input[@class='btn ']")).click();
			Thread.sleep(2000);
			d.findElement(By.xpath("//a[contains(text(),'»')]")).click();
			Thread.sleep(2000);
			d.navigate().back();
		    for(int I=0;I<=1;I++)
			{
			d.findElement(By.xpath("//a[contains(text(),'»')]")).click();
			}
		    //Edit
		    d.findElement(By.xpath("//button[contains(text(),'EDIT')]")).click();
		    WebElement FirstName = d.findElement(By.id("FirstName"));
		    FirstName.clear();
		    FirstName.sendKeys("JAYA") ;
		    WebElement LastName = d.findElement(By.id("LastName"));
		    LastName.clear();
		    LastName.sendKeys("PRAKASH KUMAR") ;
		    WebElement EnrollmentDate= d.findElement(By.id("EnrollmentDate"));
		    EnrollmentDate.clear();
		    EnrollmentDate.sendKeys("3/12/2021 11:00:00 PM") ;
		    Thread.sleep(2000);
		    d.findElement(By.xpath("//input[@value='Save']")).click();
		    Thread.sleep(2000);
		    //Details
		    d.findElement(By.xpath("//button[normalize-space()='DETAILS']")).click();
		    Thread.sleep(3000);
		    
// Ajax link Page
			
		    d.findElement(By.xpath("//a[normalize-space()='AjaxCall']")).click();
		    d.findElement(By.xpath("//a[contains(text(),'This is a Ajax link')]")).click();
		    Thread.sleep(8000);	
		    
// Form  Page
			
			d.findElement(By.xpath("//a[normalize-space()='Form']")).click();
			d.navigate().back();
			d.findElement(By.xpath("//a[normalize-space()='Form']")).click();
			d.findElement(By.id("firstname")).sendKeys("SHASHI RANJAN ");
			d.findElement(By.id("lastname")).sendKeys("KUMAR");
			d.findElement(By.xpath("//label[normalize-space()='Single']")).click();
			d.findElement(By.xpath("//input[@value='cricket']")).click();
			WebElement Country = d.findElement(By.id("sel1"));
			Select selectC= new Select(Country);
		    selectC.selectByVisibleText("Canada");
		    d.findElement(By.id("datepicker")).click();
			Thread.sleep(2000);
			WebElement month = d.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
			Select selectM= new Select(month);
		    selectM.selectByVisibleText("Jul");
		    WebElement year = d.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		    Select selectY= new Select(year);
		    selectY.selectByVisibleText("1998");
		    List<WebElement> days = d.findElements(By.xpath("//a[@class='ui-state-default']"));

		    for(int l=0;l<days.size();l++) {
		    	
		    	if(days.get(l).getText().equals("18")) {
		    		
		    		days.get(l).click();
		    		break;
		    		
		    	}
		    	
		    }
		    d.findElement(By.id("phonenumber")).sendKeys("8405051259");
		    d.findElement(By.id("username")).sendKeys("sranjank");
		    d.findElement(By.id("email")).sendKeys("ranjan181995@gmail.com");
		    d.findElement(By.id("comment")).sendKeys("Shashi Ranjan is an Software Engineer");
		    d.findElement(By.id("pwd")).sendKeys("Shashi@1234");
		    d.findElement(By.xpath("//button[normalize-space()='Submit']")).click();
		    Thread.sleep(3000);

//Widgets Page		    
		    
		    d.findElement(By.xpath("//a[normalize-space()='Widgets']")).click();
	        d.findElement(By.xpath("//input[@id='image_file']")).sendKeys("C:\\Users\\sranjank\\Pictures\\Screenshots\\Screenshot (2).png");
	        d.findElement(By.xpath("//input[@value='Upload']")).click();
	        Thread.sleep(5000);
	        d.findElement(By.xpath(" //a[normalize-space()='Download a image']")).click();
	        Thread.sleep(3000);
	        
//Action Page        
	        
	        d.findElement(By.xpath("//a[normalize-space()='Actions']")).click();
			d.findElement(By.xpath("//button[normalize-space()='Click Me !']")).click();
			Alert alertA = d.switchTo().alert();
			alertA.accept();
			Thread.sleep(3000);
			WebElement Double = d.findElement(By.xpath("//button[normalize-space()='Double Click Me !']"));
			a.doubleClick(Double).perform();
			Alert alertB = d.switchTo().alert();
			alertB.accept();
			WebElement DragA = d.findElement(By.xpath("//p[normalize-space()='Drag me to my target']"));
			WebElement DropA = d.findElement(By.id("div2"));
		    a.dragAndDrop(DragA, DropA).perform();
		    d.findElement(By.xpath("//li[@name='one']")).click();
		    a.keyDown(Keys.CONTROL).perform();
		    d.findElement(By.xpath("//li[@name='seven']")).click();
		    d.findElement(By.xpath("//li[@name='four']")).click();
		    a.keyUp(Keys.CONTROL).build().perform();
		    Thread.sleep(3000);
           
            
//Switch to    
            
        	d.findElement(By.xpath("//a[normalize-space()='Switch to']")).click();
    		d.findElement(By.id("alert")).click();
    		Alert alertC = d.switchTo().alert();
    		alertC.accept();
    		Thread.sleep(2000);
    		d.findElement(By.id("confirm")).click();
    		Alert alertD = d.switchTo().alert();
    		alertD.accept();
    		Thread.sleep(2000);
    		d.findElement(By.id("prompt")).click();
    		Alert alertE = d.switchTo().alert();
    	    alertE.sendKeys("SHASHI RANJAN KUMAR");
    		alertE.accept();
    		Thread.sleep(2000);
    		d.findElement(By.xpath("//button[normalize-space()='Launch modal']")).click();
    		d.findElement(By.xpath("//button[normalize-space()='Ok']")).click();
    		Thread.sleep(2000);
    		WebElement frameA = d.findElement(By.name("iframe_a"));
    	    d.switchTo().frame(frameA);
    		d.findElement(By.id("name")).sendKeys("SHASHI RANJAN KUMAR");
    		Thread.sleep(2000);
    	    d.switchTo().defaultContent();
    	    d.findElement(By.xpath("//a[normalize-space()='uitestpractice.com']")).click();
    		Thread.sleep(3000);
    		d.findElement(By.xpath("//a[normalize-space()='Opens in a new window']")).click();
    		
// Select Page
    		
    		Set<String> siT = d.getWindowHandles();
			Iterator<String>iT=siT.iterator();
			String M= iT.next();
			String C = iT.next();
			d.switchTo().window(M);
			d.findElement(By.xpath("//a[normalize-space()='Select']")).click();
			WebElement country = d.findElement(By.id("countriesSingle"));
			country.click();
			Select selectD= new Select(country);
		    selectD.selectByVisibleText("China");
		    d.findElement(By.xpath("//select[@id='countriesMultiple']//option[@value='china'][normalize-space()='China']")).click();
		    d.findElement(By.xpath("(//option[@value='india'][normalize-space()='India'])[2]")).click();
		    d.findElement(By.xpath("//button[@id='dropdownMenu1']")).click();
		    d.findElement(By.xpath("//a[normalize-space()='India']")).click();
    		Thread.sleep(3000);  
    		  d.quit();

	}

}
