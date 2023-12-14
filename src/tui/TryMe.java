package tui;

import java.time.LocalDateTime;

import model.Customer;
import model.CustomerContainer;
import model.OrderContainer;
import model.ShelfProduct;
import model.ProductContainer;

/**
 * This class is used to create test environment with dummy data.
 * 
 * @author Patrick Thor Sorenson De Siqueira
 * @version 14/12/2023
 * @since 14/12/2023
 */
public class TryMe {
	private static CustomerContainer customerContainer;
	private static ProductContainer productContainer;
	private static OrderContainer orderContainer;
	
	public static void createCustomers() {
		customerContainer = CustomerContainer.getInstance();
		Customer customer1 = new Customer("CustomerName1", "Address1", "11111111", "mail1@mail.dk");
		Customer customer2 = new Customer("CustomerName2", "Address2", "22222222", "mail2@mail.dk");
		
		customerContainer.addCustomer(customer1);
		customerContainer.addCustomer(customer2);
	}
	
	public static void createProducts() {
		productContainer = ProductContainer.getInstance();
		ShelfProduct product1 = new ShelfProduct("ProductName1", "ProductDestription1", "123456", 9.99, 19.99, 0, LocalDateTime.now());
		ShelfProduct product2 = new ShelfProduct("ProductName2", "ProductDestription2", "654321", 25.99, 35.99, 15, LocalDateTime.now());
	
		productContainer.addProduct(product1);
		productContainer.addProduct(product2);
	}
	
}
