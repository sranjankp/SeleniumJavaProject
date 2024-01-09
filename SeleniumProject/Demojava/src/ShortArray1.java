
public class ShortArray1 {

	public static void main(String[] args) {
		int a[]= {10,12,13,1,11,16};	
		int te;
		for(int i=0;i<=a.length-1;i++) {
			for(int j=i+1;j<=a.length-1;j++) {
				if(a[i]>a[j]) {
					 te = a[i];
					a[i]=a[j];
					a[j]=te;
				}
			}
		}
		for(int i=0;i<=a.length-1;i++)
		{
		  System.out.println(a[i]);	
		}
	}

}
