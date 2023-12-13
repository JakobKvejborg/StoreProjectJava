package unitTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import controller.CustomerCtrl;
import model.Customer;
import model.CustomerContainer;

/**
 * This class represents a J-Unit test for the class <code>CustomerCtrl</class>.
 * 
 * @author Majbritt Kjeldgaard Harsfort
 * @version 13/12/2023
 * @since 11/12/2023
 */
public class CustomerCtrlTest {
	private CustomerCtrl customerCtrl;
	private CustomerContainer customerContainer;

	/**
	 * <code>setUp()</code> runs before each test method.
	 */
	@BeforeEach
	public void setUp() {
		customerContainer = CustomerContainer.getInstance();
		customerCtrl = new CustomerCtrl();
	}

	/**
	 * This test creates a new <code>Customer</code> and adds it to <code>ArrayList</code> then checks to see if 
	 * <code>sampleCustomer</code> and <code>foundCustomer</code> share the same <code>String</code> attribute <code>phone</code>
	 */
	@Test
	public void testFindCustomer() {
		Customer sampleCustomer = new Customer("John Doe", "Gade 1", "1234567890", "john@example.dk");
		customerContainer.addCustomer(sampleCustomer);

		String phoneNumber = "1234567890";
		Customer foundCustomer = customerCtrl.findCustomer(phoneNumber);

		assertEquals(sampleCustomer, foundCustomer);
	}
}
