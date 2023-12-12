package unitTest;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import controller.SaleCtrl;
import model.AbstractProduct;
import model.Customer;
import model.SaleOrderLine;
import model.ShelfProduct;
import model.Employee;
import model.Location;

/**
 * 
 * @author Julia Rafn
 * @version 11/12/2023
 * @since 11/12/2023
 */
/**
 * TODO test if can find customer by phone number
 * TODO test if can find product
 * TODO test if can set quantity
 * TODO test if can create new sale
 * TODO test if can complete sale
 * all done together in a test!
 */
class SaleCtrlTest {
	private SaleCtrl saleCtrl;
	private Customer customer;
	private ShelfProduct skovlProduct;
	private SaleOrderLine saleOrderLine;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		customer = new Customer("Bob", "Gadevej", "654789321", "John@hotmail.dk");
		skovlProduct = new ShelfProduct("skovel", "den kan grave", "92864731", 15, 20, 0, LocalDateTime.of(2023, 1, 1, 1, 1));
		saleCtrl = new SaleCtrl(new Employee("ProjectGroup", "UCN", "11234567", "noreply@UCN.dk", "PG"),
				new Location("Hjem & Fix", "Pioner Alle 2"));
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}

}
