import java.util.Scanner;

public class PalindromNumber {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner s= new Scanner(System.in);
		int num=s.nextInt();
		int tem=num;
		int rev = 0;
		while(num>0) {
			int d=num%10;
			rev= rev*10+d;
			num=num/10;
		}
		System.out.println(rev);
		if(tem==rev) {
			 System.out.println(tem+" is Panlindrom Number");

		}else {
			System.out.println(tem+" is not Panlindrom Number");

		}
		 
       	}

}
