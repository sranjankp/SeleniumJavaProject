import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Readfile3 {

	public static void main(String[] args) throws IOException {
	FileReader f= new FileReader("C:\\Users\\sranjank\\Documents\\ranjan.txt");
    int i=0;
	while((i=f.read())!=-1) {
		System.out.print((char)i);
		
	}
	}

}
