package maven1;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testng1 {

	@BeforeClass
	public void openApplication(){
		
		System.out.println("Opening Application under test - Inside @BeforeClass");
		
	}
	
	@Test (priority=2)
	public void testLogin(){
		
		System.out.println("Testing Login functionality");
		
	}		
	
	@Test (priority=3)
	public void testHomePage(){
		
		System.out.println("Testing Home Page functionality");
		
	}
	
	@Test(priority=1)
	public void testRegistration(){
		
		System.out.println("Testing Registration functionality");
		
	}	
}
