package maven1;

import org.testng.annotations.Test;

public class Testng2 {
	@Test
	public void som()
	{
		int a=20;
		int c=a/0;
		System.out.println(c);
	}

}
