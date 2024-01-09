package MAVENP;

import org.testng.annotations.Test;

       public class Testng10_1 {
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
