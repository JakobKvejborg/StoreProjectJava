package controller;

import model.Customer;
import model.CustomerContainer;

/**
 * This class represents customer controller which creates an instance of
 * customer container and sends the commands to the container
 * @author Patrick Thor Sorenson De Siqueira, Majbritt Kjeldgaard Harsfort
 * @version 0.1.0
 */

public class CustomerCtrl {
	private CustomerContainer customerContainer;
	
	/**
	 * Constructor creates an instance of customer container
	 */
	public CustomerCtrl() {
		this.customerContainer = CustomerContainer.getInstance();
	}
	
	/**
	 * This method is used to call a method from customer container
	 * 
	 * @param phone phone number of customer
	 * @return object customer
	 */
	public Customer findCustomer(String phone) {
		return customerContainer.findCustomer(phone);
	}

	public void createCustomer(String name, String address, String phone, String email) {
		customerContainer.createCustomer(name, address, phone, email);
	}

}
