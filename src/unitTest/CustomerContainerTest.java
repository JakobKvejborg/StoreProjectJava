package unitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Customer;
import model.CustomerContainer;

/**
 * @author Patrick Thor Sorenson De Siqueira
 * @version 0.1.0
 */
public class CustomerContainerTest {
	
	private CustomerContainer customerContainer;
	
	/**
	 * <code>setUp()</code> runs before each test method.
	 */
	@BeforeEach
	public void setUp() {
		customerContainer = CustomerContainer.getInstance();
	}
	
	@Test
	public void addCustomerTest() {
		assertTrue(CustomerContainer.getInstance().addCustomer(new Customer("Peder", "Pedervej", "88888888", "peder@leasy.dk")));	
	}	
	
	/**
	 * Svende is added to the <code>ArrayList</code> named <code>customers</code> in the <code>CustomerContainer</code> class
	 * <code>assertEquals</code> method compares the output of <code>findCustomer</code> with the created <code>customer</code>
	 */
	@Test
	public void findCustomerTest() {
		Customer customer = new Customer("Svende", "Svendevej", "4444", "svende@ikkeleasy.dk");
		customerContainer.addCustomer(customer);
		assertEquals(customerContainer.findCustomer("4444"), customer);
	}
	
}
