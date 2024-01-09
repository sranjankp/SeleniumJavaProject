import java.util.Scanner;

public class PalindromString {

	public static void main(String[] args) {
		 System.out.println("Enter the string value");
		Scanner s= new Scanner(System.in);
	    String str= s.nextLine();
	    String orgstr=str;
	    int len= str.length();
	    String rev="";
	    for(int i=len-1;i>=0;i--)
	    {
	    	rev=rev+str.charAt(i);
	    }
	    if(orgstr.equals(rev))
	    {
	    	System.out.println(orgstr+" is palindrome string");
	    }
	    else {
	    	System.out.println(orgstr+" is not palindrome string");
	    }
	}

}
