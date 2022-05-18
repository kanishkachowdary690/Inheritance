package inheritance;

public class Tester7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ab obj=new B();
        System.out.println(obj.i);
	}

}
class Ab{
	int i=10;
}
class B extends Ab{
	int i=20;
}
