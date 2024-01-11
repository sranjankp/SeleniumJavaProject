abstract class Bike{
	abstract void run();
}
class Hero extends Bike{
	public void run()
	{
		System.out.println("Hero bike is running");
		
	}
}
class Hunda extends Bike{
	public void run()
	{
		System.out.println("Hunda bike is running");
		
	}
}
public class Abstraction {

	public static void main(String[] args) {
		Hero h=new Hero();
		h.run();
		Hunda H=new Hunda();
		H.run();
		

	}

}
