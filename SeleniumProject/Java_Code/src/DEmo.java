import java.util.Scanner;

public class DEmo {

	public static void main(String[] args) {
	System.out.println("Updated in git");
	System.out.println("Enter name");
	Scanner s= new Scanner(System.in);
	String str=s.nextLine();
	String org=str;
	String rev="";
	int len=str.length();
	for(int i=len-1;i>=0;i--) {
		rev=rev+str.charAt(i);
	}
	if(rev.equals(org)) {
		System.out.println(org+" is palindrome");
	}
	else
	{
		System.out.println(org+" is not palindrome");
	}
	}

}
