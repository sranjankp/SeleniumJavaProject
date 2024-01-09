package MAVENP;

import org.testng.annotations.Test;

public class DependsOnmethod1 {
	@Test
	public void flipcart()
	{
		System.out.println("flipcart");
	}
   
	@Test(dependsOnMethods= {"flipcart"} )
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
