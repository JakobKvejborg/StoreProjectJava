package controller;

import model.AbstractProduct;
import model.Customer;
import model.OrderContainer;
import model.Sale;

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
	
	public AbstractProduct addProduct(String barcode) {
		//TODO
		return null;
	}
	
	public Sale makeSale() {
		//TODO
		return null;
	}
	
	public Sale compSale(double payment) {
		//TODO
		return null;
	}
}
