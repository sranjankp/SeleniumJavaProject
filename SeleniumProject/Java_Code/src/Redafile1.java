import java.io.FileReader;
import java.io.IOException;

public class Redafile1 {

	public static void main(String[] args) {
		try
		{
			FileReader f=new FileReader("C:\\Users\\sranjank\\Documents\\ranjan.txt");
			try
			{
				int i;
				while((i=f.read())!=-1)
				{
				System.out.print((char)i);	
				
				}
				System.out.println();
			}
			
			finally{
				f.close();
				System.out.println("file is close");
			}
			
		}
		catch(IOException i)
		{
			System.out.println("Exception handled");
		}
	}

}