package MAVENP;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class Testng4 {
@Test
public void shashi() throws Exception{
int a=10;
if(a<55)
{
	throw new SkipException ("shashi ranjan kumar");
}


}

}
