package controller;

import model.Customer;
import model.Sale;
import model.SellableIF;


/**
 * all the methods that are required for the SaleTUI to work,
 * so mock SaleCtrl is possible to make.
 * 
 * @author Penrose
 * @version 07/12/2023
 */
public interface SaleCtrlIF {

	public Customer setCustomer(String phone);
	public SellableIF addProduct(String barcode);
	public Sale makeSale();
	public Sale completeSale(double payment);
	
}
