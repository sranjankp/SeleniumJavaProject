package Properties1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Property1 {

	public static void main(String[] args) throws IOException {
		Properties p=new Properties();
		FileInputStream f= new FileInputStream("data.Properties");
		p.load(f);

		System.out.println(p.getProperty("URL"));
		System.out.println(p.getProperty("email"));
		System.out.println(p.getProperty("Password"));
		p.setProperty("result", "pass");
		FileOutputStream fo= new FileOutputStream("data.Properties");
		p.store(fo, null);
		
	}

}
