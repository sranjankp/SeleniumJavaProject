import java.io.File;
import java.io.IOException;


public class FileCreate1 {

	public static void main(String[] args) throws IOException  {
		File f=new File("C:\\Users\\sranjank\\OneDrive - Capgemini\\Documents\\Jci\\ranjan.txt");
		if(f.createNewFile())
		{
			System.out.println("New has been created");
		}
		else
		{
			System.out.println("file is already exist");
		}
	
	
	}
	

}
