package tui;

import java.time.LocalDateTime;

import model.Customer;
import model.CustomerContainer;
import model.OrderContainer;
import model.ShelfProduct;
import model.UniqueCopy;
import model.UniqueProduct;
import model.ProductContainer;

/**
 * This class is used to create test environment with dummy data.
 * 
 * @author Patrick Thor Sorenson De Siqueira
 * @version 15/12/2023
 * @since 14/12/2023
 */
public class TryMe {
	private static CustomerContainer customerContainer;
	private static ProductContainer productContainer;
	private static OrderContainer orderContainer;
	
	/**
	 * This method creates two <code>Customer</code> as dummy data and adds them to <code>customerContainer</code>.
	 */
	public static void createCustomers() {
		customerContainer = CustomerContainer.getInstance();
		Customer customer1 = new Customer("John", "UCN", "12345678", "School@UCN.dk");
		Customer customer2 = new Customer("Jane", "The Moon", "87654321", "Moonbase@Alpha.dk");
		
		customerContainer.addCustomer(customer1);
		customerContainer.addCustomer(customer2);
	}
	
	/**
	 * This method creates two <code>ShelfProduct</code> as dummy data and adds them to <code>productContainer</code>.
	 */
	public static void createProducts() {
		productContainer = ProductContainer.getInstance();
		ShelfProduct product1 = new ShelfProduct("Table", "Has 4 legs", "123456", 9.99, 19.99, 0, LocalDateTime.now());
		ShelfProduct product2 = new ShelfProduct("Chair", "Only has 3 legs", "654321", 25.99, 35.99, 0.15, LocalDateTime.now());
	
		productContainer.addProduct(product1);
		productContainer.addProduct(product2);
		
		UniqueProduct product3 = new UniqueProduct("Fridge", "Very cold", "111", 399.99, 699.99, 0.05, LocalDateTime.now(), "This warrenty is a String!");
		
		productContainer.addProduct(product3);
		
		UniqueCopy copy1 = new UniqueCopy("222", product3);
		UniqueCopy copy2 = new UniqueCopy("333", product3);
		
		productContainer.addCopy(copy1);
		productContainer.addCopy(copy2);

		

	}
	
}
