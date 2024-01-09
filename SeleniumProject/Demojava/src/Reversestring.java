import java.util.HashMap;
public class Reversestring {

	public static void main(String[] args) {
     String str= "My name is Shashi";
     String[] a=str.split(" ");
     String rev="";
     for(int i=0;i<=a.length-1;i++)
     {
    	 StringBuilder s=new StringBuilder();
    	 s.append(a[i]);
    	 s.reverse();
    	 rev=rev+" "+s;
     }
		System.out.println(rev.trim());
		

	}

}
