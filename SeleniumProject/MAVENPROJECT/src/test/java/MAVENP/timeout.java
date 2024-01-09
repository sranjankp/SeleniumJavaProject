package MAVENP;

import org.testng.annotations.Test;

public class timeout {
	@Test
	public void flipcart()
	{
		System.out.println("flipcart");
	}
   
	@Test
	public void amazon()
	{
		System.out.println("amazon");
	}
   
	@Test(timeOut=5000)
	public void phonepay() throws InterruptedException
	{
		Thread.sleep(4000);;
		System.out.println("phonepay");
	}
   
	@Test
	public void googlepay()
	{
		System.out.println("googlepay");
	}
   

}
