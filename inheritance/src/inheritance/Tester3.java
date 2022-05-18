package inheritance;

public class Tester3 {

	public static void main(String[] args) {
		Customer customer=new Customer("c101","jack",1696324653l,"jshjfhf,1213,kkd");
		customer.updateDetails(66665995);
		customer.updateDetails("hghghjhjjvps,9999");
		customer.display();
		}

}
class Customer{
	public String customerId;
	public String customerName;
	public long phone;
	public String address;
	Customer(String customerId,String customerName,long phone,String address){
		this.customerId=customerId;
		this.customerName=customerName;
		this.phone=phone;
		this.address=address;
	}
	
		public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.setAddress(address);
	}

		public void updateDetails(long phone) {
			this.setPhone(phone);
	}
	public void updateDetails(String address) {
		this.address="hghghjhjjvps,9999";
	}
	public void display() {
		System.out.println(address);
		System.out.println(phone);
	}
}