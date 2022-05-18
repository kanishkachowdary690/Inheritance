package inheritance;

public class Tester1 {

	public static void main(String[] args) {
		Employee employee=new Employee();
		Trainee trainee=new Trainee();
		System.out.println(employee.noOfEmployees);
		System.out.println(employee.salary);
		System.out.println(trainee.noOfEmployees);
        System.out.println(employee.display());
        trainee.display1();
	}

}
class Company{
	int noOfEmployees=1000;
	public int display() {
		return noOfEmployees;
	}
}
class Employee extends Company{
	int salary=45000;
	/*
	 * public int display() {
	 * 
	 * return salary*noOfEmployees; }
	 */
}
class Trainee extends Company{
	int noOfEmployees=100000;
	void display1() {
		System.out.println(super.noOfEmployees);
	}
	
}