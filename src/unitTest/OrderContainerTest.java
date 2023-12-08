package unitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.OrderContainer;
import model.Sale;

/**
 * @author Patrick Thor Sorenson De Siqueira
 * @version 0.1.0
 */
public class OrderContainerTest {
	
	@BeforeEach
	public void setUp() {
		OrderContainer.getInstance();
	}
	
	@Test
	public void addOrderTest() {
		assertTrue(OrderContainer.getInstance().addOrder(new Sale(4829343, null)));
	}
}
