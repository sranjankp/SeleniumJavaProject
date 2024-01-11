import java.util.Scanner;

public class Io1 {

	public static void main(String[] args) {
	
	try{
		int a;
		System.out.println("enter the value of a");
	Scanner s= new Scanner(System.in);
	a=s.nextInt();
System.out.println("a="+a);
	int b=(100/a);
		{
			System.out.println(b);
		}
	}
	catch(Exception e)
	{
		System.out.println("worng iput");
	}
	}

}
