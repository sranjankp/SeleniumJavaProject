import java.io.FileReader;
import java.io.IOException;

public class Readfile2 {

	public static void main(String[] args)  throws IOException {
		FileReader f=new FileReader("C:\\Users\\sranjank\\OneDrive - Capgemini\\Documents\\Jci\\Shashi.txt");
		int i;
		while((i=f.read())!=-1)
		{
		System.out.print((char)i);	
		}
	}

}
