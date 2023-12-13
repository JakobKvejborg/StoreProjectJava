package unitTest;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.SaleOrderLine;
import model.SellableIF;
import model.ShelfProduct;

/**
 * This class represents a J-Unit test for the class <code>SaleOrderLine</code>.
 * 
 * @author Majbritt Kjeldgaard Harsfort
 * @version 13/12/2023
 * @since 11/12/2023
 */
public class SaleOrderLineTest {
	private SaleOrderLine saleOrderLine;
	private SellableIF product;

	/**
	 * <code>setUp()</code> runs before each test method.
	 */
	@BeforeEach
	public void setUp() {
		product = new ShelfProduct("Hammer", "Used to hit nails", "0666", 20.50, 50.0, 0,LocalDateTime.of(2023, 1, 1,1, 1));
		saleOrderLine = new SaleOrderLine(product, 1);
	}

	/**
	 * This test checks if the price created in <code>setUp()</code> and <code>expectedPrice</code> equal the same.
	 */
	@Test
	public void testGetPrice() {
		double expectedPrice = 50.0;
		double actualPrice = saleOrderLine.getPrice(LocalDateTime.of(2023, 1, 1,1, 1));
		Assertions.assertEquals(expectedPrice, actualPrice);
	}
}
