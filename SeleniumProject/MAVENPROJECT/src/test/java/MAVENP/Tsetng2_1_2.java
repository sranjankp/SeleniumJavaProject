package MAVENP;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tsetng2_1_2 {
	@BeforeMethod
	public void SoM() {
	System.out.println("Operationi is done");	
	}
	@AfterMethod
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

