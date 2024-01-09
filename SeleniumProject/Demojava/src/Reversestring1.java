import java.util.Scanner;

public class Reversestring1 {

	public static void main(String[] args) {
		System.out.println("Enter the neme");
	       Scanner s= new Scanner(System.in);
	       String name= s.nextLine();
	       System.out.println(name);
	       String rn="";
	       String org=name;
	       for(int i=name.length()-1;i>=0;i--)
	       { 
	    	rn=rn+ name.charAt(i);  
	       }
	       System.out.println(rn);
}
}