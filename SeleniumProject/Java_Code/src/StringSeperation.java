
public class StringSeperation {

	public static void main(String[] args) {
	String str="Selenium1234";
//	String[] pa=str.split("");
	String no="";
	for(int i=8;i<=str.length()-1;i++) {
		no=no+str.charAt(i);
	}
	System.out.println(no);
	
		
		/*String str="Selenium1234";
		String no=str.replaceAll("[^0-9]", "");
		String strr=str.replaceAll("[^a-zA-Z]", "");
		System.out.println(no);
		System.out.println(strr);*/
		
	}

}
