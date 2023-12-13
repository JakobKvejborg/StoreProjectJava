package unitTest;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.ShelfProduct;
import model.ProductContainer;

/**
 * This class represents a J-Unit test for the class <code>ProductContainer</class>.
 * 
 * @author Patrick Thor Sorenson De Siqueira
 * @version 13/12/2023
 * @since 08/12/2023
 */
public class ProductContainerTest {
	private ProductContainer productContainer;
	
	/**
	 * <code>setUp()</code> runs before each test method.
	 */
	@BeforeEach
	public void setUp() {
		productContainer = ProductContainer.getInstance();
	}
	
	/**
	 * This test checks if <code>addProduct</code> from the <code>ProductContainer</code> succeeds by adding new <code>ShelfProduct</code>.
	 */
	@Test
	public void addProductTest() {
		assertTrue(ProductContainer.getInstance().addProduct(
				new ShelfProduct("Bucket", "Lava certified", "87327689", 19.99, 29.99, 50, LocalDateTime.of(2023, 1, 1, 1, 1))));
	}
	
	/**
	 * Door hinges is added to the <code>ArrayList</code> named <code>shelfProduct</code> in the <code>ProductContainer</code> class
	 * <code>assertEquals</code> method compares the output of <code>findProduct</code> with the created <code>shelfProduct</code> 
	 */
	@Test
	public void findProductTest() {
		ShelfProduct shelfProduct = new ShelfProduct("Door hinges", "Door certified", "294829", 15.99, 25.99, 30,LocalDateTime.of(2023, 1, 1, 1, 1));
		productContainer.addProduct(shelfProduct);
		assertEquals(productContainer.findProduct("294829"), shelfProduct);
	}
	
}
