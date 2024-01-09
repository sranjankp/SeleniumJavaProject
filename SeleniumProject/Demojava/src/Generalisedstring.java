
public class Generalisedstring {

	public static void main(String[] args) {
		 String input = "Selenium@1234";
         String[] parts = input.split("@");
	      //  if (parts.length == 2) {
	            String username = parts[0];
	            String password = parts[1];
	            System.out.println("Username: " + username);
	            System.out.println("Password: " + password);
	   //     } else {
	         //   System.out.println("Invalid input format");
	      //  }
	}

}
