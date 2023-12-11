package unitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.ShelfProduct;
import model.ProductContainer;

/**
 * @author Patrick Thor Sorenson De Siqueira
 * @version 0.1.0
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
	
	@Test
	public void addProductTest() {
		assertTrue(ProductContainer.getInstance().addProduct(new ShelfProduct("Bucket", "Lava certified", "873289", 19.99, 29.99, 50)));
	}
	
	/**
	 * Door hinges is added to the <code>ArrayList</code> named <code>shelfProduct</code> in the <code>ProductContainer</code> class
	 * <code>assertEquals</code> method compares the output of <code>findProduct</code> with the created <code>shelfProduct</code> 
	 */
	@Test
	public void findProductTest() {
		ShelfProduct shelfProduct = new ShelfProduct("Door hinges", "Door certified", "294829", 15.99, 25.99, 30);
		productContainer.addProduct(shelfProduct);
		assertEquals(productContainer.findProduct("294829"), shelfProduct);
	}
	
}
