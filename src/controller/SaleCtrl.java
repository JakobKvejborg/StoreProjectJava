package controller;

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
	private Sale sale;
	
	public SaleCtrl(Employee employee) {
		this.employee = employee;
	}

	public Customer setCustomer(String phone) {
		//TODO
		return null;
	}
	
	//Maybe this function should throw exceptions if the product isn't sellable,
	//or if no product is found.
	public SellableIF addProduct(String barcode) {
		//TODO
		return null;
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
