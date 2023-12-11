package unitTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.SaleOrderLine;
import model.SellableIF;
import model.ShelfProduct;

public class SaleOrderLineTest {
	private SaleOrderLine saleOrderLine;
	private SellableIF product;

@BeforeEach
public void setup() {
	product = new ShelfProduct("Hammer", "Used to hit nails", "0666", 20.50, 50.0, 10);
	saleOrderLine = new SaleOrderLine(product,1);
}

@Test
public void testGetPrice() {
	double expectedPrice = 50.0;
	double actualPrice = saleOrderLine.getPrice();
	Assertions.assertEquals(expectedPrice, actualPrice,0.01);
	}
}
