package inheritance;

public class Tester6 extends A {

	public static void main(String[] args) {
	  A obj=new Tester6();
	  obj.display();

	}

}
class A{
	protected void display() {
		System.out.println("display");
	}
}