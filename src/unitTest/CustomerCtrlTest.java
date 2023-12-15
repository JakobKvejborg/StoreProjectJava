package unitTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import controller.CustomerCtrl;
import model.Customer;
import model.CustomerContainer;

/**
 * This class represents a test of CustomerCtrl
 * 
 * @author Majbritt Kjeldgaard Harsfort
 * @version 11/12/2023
 */

public class CustomerCtrlTest {
	private CustomerCtrl customerCtrl;
	private CustomerContainer customerContainer;

	@BeforeEach
	public void setUp() {
		customerContainer = CustomerContainer.getInstance();
		customerCtrl = new CustomerCtrl();
	}

	@Test
	public void testFindCustomer() {
		Customer sampleCustomer = new Customer("John Doe", "Gade 1", "1234567890", "john@example.dk");
		customerContainer.addCustomer(sampleCustomer);

		String phoneNumber = "1234567890";
		Customer foundCustomer = customerCtrl.findCustomer(phoneNumber);

		assertEquals(sampleCustomer, foundCustomer);

	}

}
