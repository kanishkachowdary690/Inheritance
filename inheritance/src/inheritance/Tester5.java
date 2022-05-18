package inheritance;
class Customers {
	private String customerId;
	private String customerName;
	private long contactNumber;
	private String address;
	// Parameterless constructor
	public Customers() {
		System.out.println("Inside parameterless constructor");
	}
	// Parameterized constructor
	public Customers(String customerId, String customerName, long contactNumber,
			String address) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.contactNumber = contactNumber;
		this.address = address;
	}
	// Parameterized constructor
	public Customers(String customerName, long contactNumber, String address) {
		this.customerName = customerName;
		this.contactNumber = contactNumber;
		this.address = address;
	}
	// Methods including getter and setter and other methods
}
public class Tester5 {
	@SuppressWarnings("unused")
	public static void main(String[] args) throws Exception {
		/*
		 Parameterless constructor will be invoked, instance variables should
		 be initialized using setter methods
		 */
		
		Customers customerOne = new Customers();
		/*
		 Parameterized constructor with four parameters instance variables are
		 initialized in the constructor
		 */
       
		Customers customerTwo = new Customers("C1016", "Stephen Abram",7856341287L,"D089, St. Louis Street,Springfield,62729");
		/*
		 Parameterized constructor with three parameters instance variables
		 are initialized in the constructor
		 */
		Customers customerThree = new Customers("James Jonathan", 7828171287L, "D159, St. Louis Street, Springfield, 62729");
	}
}
