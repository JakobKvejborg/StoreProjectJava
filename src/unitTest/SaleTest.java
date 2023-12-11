package unitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.SaleOrderLine;
import model.Sale;
import model.ShelfProduct;

/**
 * This class represents a test of Sale.
 * 
 * @author Patrick Thor Sorenson De Siqueira
 * 
 * @version 11/12/2023
 * @since 11/12/2023
 */
public class SaleTest {
	private Sale sale;
	private SaleOrderLine saleOrderLineTest;
	
	@BeforeEach
	public void setUp() {
		sale = new Sale(1, null);
		saleOrderLineTest = new SaleOrderLine(new ShelfProduct("Oakwood planks", "Plank space", "087543", 9.99, 19.99, 10), 1);
		sale.addSaleOrderLine(saleOrderLineTest);
	}
	
	@Test
	public void GetPriceTest() {
		double expectedPrice = saleOrderLineTest.getQuantity() * saleOrderLineTest.getProduct().getPrice();
		double actualPrice = sale.getPrice();
		assertEquals(expectedPrice, actualPrice, 0.01);
	}
}
