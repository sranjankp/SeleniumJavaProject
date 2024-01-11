import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Write2 {

	public static void main(String[] args) {
		try
		{
			FileWriter f= new FileWriter("C:\\Users\\sranjank\\Documents\\ranjan.txt");
		try
		{
			
			f.write("Shashi Ranjan Kumar");
		}
		finally
		{
			f.close();
		}
		System.out.println("File is succesfully created and wrote");
		}
		catch(IOException i)
		{
			System.out.println(i);
		}
	}

}
