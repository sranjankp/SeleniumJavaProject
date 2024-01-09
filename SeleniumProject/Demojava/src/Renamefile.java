import java.io.File;

public class Renamefile {

	public static void main(String[] args) {
		File f=new File("C:\\Users\\sranjank\\OneDrive - Capgemini\\Documents\\Jci\\ranjan.txt");
		File r=new File("C:\\Users\\sranjank\\OneDrive - Capgemini\\Documents\\Jci\\Shashi.txt");
		if(f.exists())
		{
			System.out.println(f.renameTo(r));
		}
		else 
		{
			System.out.println("file doesnot exist");
		}
	}

}
