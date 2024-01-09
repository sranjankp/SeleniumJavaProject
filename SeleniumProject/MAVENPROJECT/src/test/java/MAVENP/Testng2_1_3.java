package MAVENP;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.Test;

public class Testng2_1_3 {
	@AfterClass
	public void SoM() {
	System.out.println("Operationi is done");	
	}
	@BeforeClass
	public void SUM() {
	System.out.println("Operationi is close");	
	}
	
			@Test  (priority=1)
			public void testHome() {
				System.out.println("Homepage");
			}
			@Test (priority=2)
			public void testRegistration() {
				System.out.println("Registration Page");
			}
			@Test (priority=3)
			public void testLogin() {
				System.out.println("Loginpage");
			}

}
