
interface A{
	void a();
	void b();
	void c();
}
class B implements A
{
	public void a()
	{
		System.out.println("I am in a");
	}
	public void b()
	{
		System.out.println("I am in b");
	}
	public void c()
	{
		System.out.println("I am in c");
	}
}
public class AbstractionByInterface {

	public static void main(String[] args) {
	
B b= new B();
b.a();
b.b();
b.c();
	}

}
