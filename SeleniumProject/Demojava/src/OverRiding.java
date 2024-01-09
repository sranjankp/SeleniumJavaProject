class Puba{
	public void AB() {
		System.out.println("A");
	}
}
class Pune extends Puba{
	public void AB() {
		System.out.println("B");
	}
}

public class OverRiding {

	public static void main(String[] args) {
		Puba a= new Pune();
		a.AB();

	}

}
