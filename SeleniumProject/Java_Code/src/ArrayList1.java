import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList s= new  ArrayList();
		s.add("shashi");
		s.add("Pruvi");
		s.add("neha");
		System.out.println(s);
		s.add("niki");
		System.out.println(s);
	    s.add(1, "Puja");
		System.out.println(s); 
        s.add(0,"ranjana");
        System.out.println(s);
        s.remove(0);
        System.out.println(s);
        s.remove(4);
        System.out.println(s);
		s.set(0,"ranjan");
		System.out.println(s);
		System.out.println(s.get(2));
		s.clear();
		System.out.println(s);
		
		
	}

}
