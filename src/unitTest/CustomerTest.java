package unitTest;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Customer;
import model.CustomerGroup;

/**
 * This class represents a J-Unit test for the class <code>Customer</class>.
 * 
 * @author Majbritt Kjeldgaard Harsfort
 * @version 13/12/2023
 * @since 11/12/2023
 */
public class CustomerTest {
	private Customer customer;
	private CustomerGroup groupWithDiscount;
	private CustomerGroup groupWithoutDiscount;
	
	/**
	 * <code>setUp()</code> runs before each test method.
	 */
	@BeforeEach
	public void setUp() {
		customer = new Customer("John Doe","Gade 1","1234567890","john@example.dk");		
		
	groupWithDiscount = new CustomerGroup("default group", "private", 15, LocalDateTime.of(2023, 1, 1, 1, 1));
	
	groupWithoutDiscount = new CustomerGroup("default group number two", "public", 0, LocalDateTime.of(2023, 1, 1, 1, 1));
	
	}
	
	/**
	 * This test checks to see if <code>groupWithDiscount</code> shares the <code>double</code> attribute <code>MaxDiscount</code> with <code>maxDiscount</code>.
	 */
	@Test
	public void testGetMaxDiscountWithDiscount() {
		customer.setCustomerGroup(groupWithDiscount);
		double maxDiscount = customer.getMaxDiscount(LocalDateTime.of(2023, 1, 1, 1, 1));
		Assertions.assertEquals(15,maxDiscount);	
	}
	
	/**
	 * This test checks to see if <code>groupWithoutDiscount</code> shares the <code>double</code> attribute <code>MaxDiscount</code> with <code>maxDiscount</code>.
	 */
	@Test
	public void testGetMaxDiscountWithoutDiscount() {
		customer.setCustomerGroup(groupWithoutDiscount);
		double maxDiscount = customer.getMaxDiscount(LocalDateTime.of(2023, 1, 1, 1, 1));
		Assertions.assertEquals(0,maxDiscount);	
		}
}
