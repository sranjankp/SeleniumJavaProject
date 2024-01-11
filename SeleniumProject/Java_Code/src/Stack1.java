
import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {
		Stack<String> s= new Stack<String>();//Last in First out
		s.add("shashi");
		s.add("Pruvi");
		s.push("neha");
		System.out.println(s);
		s.pop();
		System.out.println(s);
		

	}

}
