package unitTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.SaleOrderLine;
import model.SellableIF;
import model.ShelfProduct;

/**
 * This class represents a test of SaleOrderLine
 * @author Majbritt Kjeldgaard Harsfort
 * @version 11/12/2023
 */

public class SaleOrderLineTest {
	private SaleOrderLine saleOrderLine;
	private SellableIF product;

	/**
	 * <code>setUp()</code> runs before each test method.
	 */

	@BeforeEach
	public void setUp() {
		product = new ShelfProduct("Hammer", "Used to hit nails", "0666", 20.50, 50.0, 0.10);
		saleOrderLine = new SaleOrderLine(product, 1);
	}

	@Test
	public void testGetPrice() {
		double expectedPrice = 50.0;
		double actualPrice = saleOrderLine.getPrice();
		Assertions.assertEquals(expectedPrice, actualPrice, 0.10);
	}
}
