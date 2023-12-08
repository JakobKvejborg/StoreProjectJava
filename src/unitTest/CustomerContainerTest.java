package unitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.Customer;
import model.CustomerContainer;

/**
 * @author Patrick Thor Sorenson De Siqueira
 * @version 
 */

public class CustomerContainerTest {

	CustomerContainer customerContainer = CustomerContainer.getInstance();
	
	@Test
	public void addCustomerTest() {
		assertTrue(CustomerContainer.getInstance().addCustomer(new Customer(1)));	
	}	
	
}
