package controller;

import java.time.LocalDateTime;

import model.AbstractProduct;
import model.Customer;
import model.Employee;
import model.Location;
import model.OrderContainer;
import model.Sale;
import model.SaleOrderLine;
import model.SellableIF;

/**
 * @author Jonas og Jakob
 * 
 * @version 12/12/2023
 * @since 08/12/2023
 */
//TODO: add null checks to everything
public class SaleCtrl implements SaleCtrlIF {
	
	private Employee employee;
	private Location location;
	private OrderContainer orderContainer;
	private ProductCtrl productCtrl;
	private CustomerCtrl customerCtrl;
	private Sale sale;
	
	public SaleCtrl(Employee employee, Location location) {
		this.employee = employee;
		this.location = location;
	}

	/**
	 * finds a customer by their phone number and adds them to the sale.
	 * it is not necessary to add a customer to complete a sale.
	 * 
	 * @return returns the customer added to the sale.
	 */
	public Customer setCustomer(String phone) {
		Customer customer = customerCtrl.findCustomer(phone);
		sale.setCustomer(customer);
		return customer;
	}
	
	/**
	 * finds a product, checks if it can be sold, and adds it to the sale in the form of a <code>SaleOrderLine</code>.
	 * 
	 * @param the barcode of the product to be added
	 * @return the found product in the form of a <code>SellableIF</code>.
	 * returns null if the no product has the barcode or the product cannot be sold.
	 */
	//Maybe this function should throw exceptions if the product isn't sellable,
	//or if no product is found.
	public SellableIF addProduct(String barcode) {
		//find the product
		AbstractProduct abstractProduct = productCtrl.findProduct(barcode);
		//initialise the SellableIF to null.
		SellableIF product = null;
		//check if the product can be sold (implements SellableIF). this is also false if no product was found.
		if(abstractProduct instanceof SellableIF) {
			//cast the abstractProduct as a SellableIF. Aka, changing the static type to SellableIF.
			//this is always possible because of the previous if statement making sure it is.
			product = (SellableIF) abstractProduct;
			//create a SaleOrderLine with the SellableIF product, and a quantity of 1.
			//the quantity can be updated via the setQuantity method.
			sale.addSaleOrderLine(new SaleOrderLine(product, 1));
		}
		//return the product
		return product;
	}
	
	/**
	 * sets the quantity of the last added OrderLine.
	 * 
	 * @param quantity
	 * @return returns true if the quantity was successfully set.
	 */
	public boolean setQuantity(int quantity) {
		//make sure that you cannot add 0 or negative quantities (guard clause)
		if(quantity < 1) {
			return false;
		}
		//get the last SaleOrderLine in the sale
		SaleOrderLine saleOrderLine = sale.getSaleOrderLine(sale.getSaleOrderLinesSize() - 1);
		//check if the SaleOrderLine exists and if the quantity can be anything other than 1 (guard clause)
		if(saleOrderLine == null || saleOrderLine.getProduct().isUnique()) {
			return false;
		}
		//set the quantity
		saleOrderLine.setQuantity(quantity);
		return true;
	}
	
	/**
	 * creates a new sale.
	 * @return returns the created sale.
	 */
	public Sale makeSale() {
		//TODO Assign proper orderNo
		sale = new Sale(1, LocalDateTime.now());
		return sale;
	}

	/**
	 * completes a sale, checks payment, and makes sure everything is correctly set up.
	 * persists the sale.
	 * 
	 * @return returns the created sale. returns null if the sale was improperly created, or not enough was paid.
	 */
	//TODO: figure out what to do if the customer overpays.
	public Sale completeSale(double payment) {
		// TODO make sure the sale has proper values
		if(payment >= sale.getPrice()) {
			sale.setEmployee(employee);
			orderContainer.addOrder(sale);
			return sale;
		}
		return null;
	}

	@Override
	public void createCustomer(String name, String address, String phone, String email) {

	}
}
