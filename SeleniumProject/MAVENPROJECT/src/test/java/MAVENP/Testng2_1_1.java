package MAVENP;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testng2_1_1 {	
	@BeforeMethod
	public void SUM() {
	System.out.println("Operationi is done");	
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
