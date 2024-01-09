package MAVENP;

import org.testng.annotations.Test;

public class Enabled1 {
	@Test
	public void flipcart()
	{
		System.out.println("flipcart");
	}
   
	@Test(enabled=false)
	public void amazon()
	{
		System.out.println("amazon");
	}
   
	@Test
	public void phonepay()
	{
		System.out.println("phonepay");
	}
   
	@Test
	public void googlepay()
	{
		System.out.println("googlepay");
	}
   

}
