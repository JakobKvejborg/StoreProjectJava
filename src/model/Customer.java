package model;


/**
 * @author Jonas
 * 
 *@version 11/12/2023
 *@since 07/12/2023
 */
public class Customer extends AbstractPerson{
	private CustomerGroup customerGroup;
	
	/**
     * Constructs a Customer object with the provided details.
     *
     * @param name    The name of the customer.
     * @param address The address of the customer.
     * @param phone   The phone number of the customer.
     * @param email   The email address of the customer.
     */
	public Customer(String name, String address, String phone, String email) {
		super(name, address, phone, email);
		// TODO Auto-generated constructor stub
	}

	
	/**
     * Sets the customer group of this customer.
     *
     * @param customerGroup The CustomerGroup object representing the customer's group.
     */
	public void setCustomerGroup(CustomerGroup customerGroup) {
		this.customerGroup = customerGroup;
	}
	
	
	public void setPhone(String phone) {
		super.setPhone(phone);
	}
	
	/**
     * Retrieves the maximum discount applicable to this customer based on their group.
     *
     * @return The maximum discount available for this customer.
     */
	public double getMaxDiscount() {
		return customerGroup.getMaxDiscount();
		//TODO
	}
}
