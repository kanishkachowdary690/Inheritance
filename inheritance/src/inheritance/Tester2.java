package inheritance;

public class Tester2 {

	public static void main(String[] args) {
		College st=new Class();
		//Class su=new Class();
		//su.display();
		st.display();
	  
	}

}
class College{
	int emp=1000;
	public void display() {
		System.out.println("helllo ");
		
	}
	
}




class Class extends College{
	int emp=100;
	/*
	 * void display() { System.out.println("students"+","+emp); }
	 */
}