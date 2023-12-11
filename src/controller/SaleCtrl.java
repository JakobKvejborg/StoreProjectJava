package controller;

import model.AbstractProduct;
import model.Customer;
import model.Employee;
import model.OrderContainer;
import model.Sale;
import model.SellableIF;

/**
 * @author Jonas og Jakob
 */
public class SaleCtrl implements SaleCtrlIF {
	
	private Employee employee;
	private OrderContainer orderContainer;
	private ProductCtrl productCtrl;
	private CustomerCtrl customerCtrl;
	private SellableIF product;
	private Sale sale;
	
	public SaleCtrl(Employee employee) {
		this.employee = employee;
	}

	public Customer setCustomer(String phone) {
		Customer customer = customerCtrl.findCustomer(phone);
		sale.setCustomer(customer);
		return customer;
	}
	
	//Maybe this function should throw exceptions if the product isn't sellable,
	//or if no product is found.
	public SellableIF addProduct(String barcode) {
		AbstractProduct abstractProduct = productCtrl.findProduct(barcode);
		product = null;
		if(abstractProduct instanceof SellableIF) {
			product = (SellableIF) abstractProduct;
		}
		return product;
	}
	
	public boolean setQuantity(int quantity) {
		
		return false;
	}
	
	public Sale makeSale() {
		//TODO
		return null;
	}

	public Sale completeSale(double payment) {
		// TODO Auto-generated method stub
		return null;
	}
}
