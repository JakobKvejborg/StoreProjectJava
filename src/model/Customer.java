package model;

import java.time.LocalDateTime;

/**
 * The <code>Customer</code> class represents a customer.
 * 
 * @author Jonas
 * @version 15/12/2023
 * @since 07/12/2023
 */
public class Customer extends AbstractPerson{
	private CustomerGroup customerGroup;
	
	/**
     * This method constructs a <code>Customer</code> object with the provided details.
     *
     * @param name    The name associated with the customer.
     * @param address The address associated with the customer.
     * @param phone   The phone number associated with the customer.
     * @param email   The email address associated with the customer.
     */
	public Customer(String name, String address, String phone, String email) {
		super(name, address, phone, email);
		customerGroup = CustomerGroup.getDefaultCustomerGroup();
	}

	/**
     * Sets the customer group of this customer.
     * @param customerGroup The CustomerGroup object representing the customer's group.
     */
	public void setCustomerGroup(CustomerGroup customerGroup) {
		this.customerGroup = customerGroup;
	}

	/**
	 * This method gets <code>customerGroup</code>.
	 * @return a <code>customerGroup</code> representing a <code>CustomerGroup</code>.
	 */
	public CustomerGroup getCustomerGroup() {
		return customerGroup;
	}
	
	public void setPhone(String phone) {
		super.setPhone(phone);
	}
	
	/**
     * Retrieves the maximum discount applicable to this customer based on their group.
     * @return The maximum discount available for this customer.
     */
	public double getMaxDiscount(LocalDateTime date) {
		return getCustomerGroup().getMaxDiscount(date);
		//TODO
	}
}
