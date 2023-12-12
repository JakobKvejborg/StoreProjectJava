package controller;

import model.Customer;

public interface CustomerCtrlIF {

	public Customer createCustomer(String name, String address, String phone, String email);

}
