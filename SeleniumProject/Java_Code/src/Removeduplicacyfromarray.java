
public class Removeduplicacyfromarray {

	public static void main(String[] args) {
		int a[]= {5,5,6,44,55,5,6,4,8,8,7};

		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					a[i]=-1;
				}
			}
		}
	         for(int i=0;i<a.length;i++)
	         {
	           if(a[i] !=-1)
	           {
	        	  System.out.println(a[i]);
	           }
	         }
	}

}
