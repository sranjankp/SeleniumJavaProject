import java.util.HashSet;
import java.util.Iterator;

public class Hasset
{
	public static void main(String[] args)
	{
  HashSet<String> hs = new HashSet<String>();
		
		hs.add("Shashi");
		hs.add("Ranjan");
		hs.add("Kumar");
		
		Iterator<String> itr = hs.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
			
		}
	}
}