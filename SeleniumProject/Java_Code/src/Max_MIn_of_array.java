
public class Max_MIn_of_array {

	public static void main(String[] args) {
		 int a[]= {1,2,5,9,199,5};
    	 int l= a.length;
    	 int max=a[0];
    	 int min= a[0];
    	 for(int i=0;i<=l-1;i++)
    	 {
    		
    			 if(a[i]>max)
    			 { 
    				max=a[i];
    			 }
    			 if(a[i]<min)
    			 {
    				min=a[i];
    			 }
    		 
    	 }
    	
    	
    	 System.out.println(min);
    	 System.out.println(max);
		//Another method
		/* int a[]= {1,2,5,9,199,5};
    	 int l= a.length;
    	 int te;
    	 for(int i=0;i<=l-1;i++)
    	 {
    		 for(int j=i+1;j<=l-1;j++)
    		 {
    			 if(a[i]>a[j])
    			 {
    				 
    				 te=a[i];
    				 a[i]=a[j];
    				 a[j]=te;
    				 
    			 }
    		 }
    	 }
    	 for(int k=0;k<=l-1;k++)
    	 {
    		 System.out.print(a[k]+" ");
    	 }
    	 System.out.println();
    	 System.out.println(a[0]);
    	 System.out.println(a[l-1]);*/
		
		
	 
	}

}
