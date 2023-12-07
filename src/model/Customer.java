package model;


/**
 * @author Jonas
 */
public class Customer extends AbstractPerson{
	private CustomerGroup customerGroup;
	
	public Customer(String name, String address, String phone, String email) {
		super(name, address, phone, email);
		// TODO Auto-generated constructor stub
	}

	public void setCustomerGroup(CustomerGroup customerGroup) {
		this.customerGroup = customerGroup;
	}
	
	public int getMaxDiscount() {
		return customerGroup.getMaxDiscount();
		//TODO
	}
}
