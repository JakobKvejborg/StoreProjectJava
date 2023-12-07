package controller;

import model.Customer;
import model.Sale;
import model.SellableIF;

public interface SaleCtrlIF {

	public Customer setCustomer(String phone);
	public SellableIF addProduct(String barcode);
	public Sale makeSale();
	public Sale completeSale(double payment);
	
}
