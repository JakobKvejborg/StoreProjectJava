package controller;

import model.Customer;
import model.OrderContainer;
import model.Sale;
import model.SellableIF;

/**
 * @author Jonas og Jakob
 */
public class SaleCtrl implements SaleCtrlIF {
	private OrderContainer orderContainer;
	private ProductCtrl productCtrl;
	private CustomerCtrl customerCtrl;
	private Sale sale;
	
	public SaleCtrl() {
	
	}

	public Customer setCustomer(String phone) {
		//TODO
		return null;
	}
	
	//Maybe this function should throw errors if the product isn't sellable,
	//or if no product is found.
	public SellableIF addProduct(String barcode) {
		//TODO
		return null;
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
