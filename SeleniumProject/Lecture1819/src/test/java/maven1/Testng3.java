package maven1;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class Testng3 {
	@Test
	public void son() throws Exception
	{
		int a= 5;
		if(a<18)
		{
			throw new SkipException("shahsi");
		}
	}

}
