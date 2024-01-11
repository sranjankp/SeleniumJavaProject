 class Shashi{
	private int value;
	public void setvalue(int x) {
		value=x;
	}
	public int getvalue() {
		return value;
	}
	
}
public class Encapsulation {

	public static void main(String[] args) {
		Shashi s= new Shashi();
		s.setvalue(10);
		System.out.println(s.getvalue());
	}

}
