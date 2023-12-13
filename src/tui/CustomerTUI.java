package tui;

import controller.CustomerCtrl;
import controller.CustomerCtrlIF;
import model.Customer;

public class CustomerTUI {

	private CustomerCtrlIF customerCtrl;
	private TextInput textInput;

	public CustomerTUI() {
		customerCtrl = new CustomerCtrl();
		textInput = TextInput.getInstance();
	}

	public Customer createCustomer() {
		System.out.println("Enter customer details:");
		System.out.print("Name: ");
		String name = textInput.readString();
		System.out.print("Address: ");
		String address = textInput.readString();
		System.out.print("Phone: ");
		String phone = textInput.readString();
		System.out.print("Email: ");
		String email = textInput.readString();
		System.out.println(name + "\n" + address + "\n" + phone + "\n" + email + "\n");
		return customerCtrl.createCustomer(name, address, phone, email);
	}

}
