import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copyfile1 {

	public static void main(String[] args) throws IOException {
		FileInputStream f=new FileInputStream("C:\\Users\\sranjank\\Documents\\create\\ranjan.txt");
		FileOutputStream r=new FileOutputStream("C:\\Users\\sranjank\\Documents\\create\\Prince.txt");
		int i;
		while((i=f.read())!=-1)
		{
			r.write((char)i);
		}
		
		System.out.println("data coppied succesfully");

	}

}
