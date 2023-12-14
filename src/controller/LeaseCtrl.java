package controller;

import model.AbstractProduct;
import model.Lease;
import model.LeaseContainer;
import model.LendableIF;
import model.SaleOrderLine;
/**
 * @author Jakob & Jonas
 * 
 * @version 13-12-2023
 * @since 13-12-2023
 */
public class LeaseCtrl {
	private LeaseContainer leaseContainer;
	private ProductCtrl productCtrl;
	private Lease lease;
	
	public LeaseCtrl() {
		
	}
	
	public AbstractProduct findProduct(String barcode) {
		return productCtrl.findProduct(barcode);
	}

	public LendableIF addTools(String barcode) {
		//find the product
		AbstractProduct abstractProduct = productCtrl.findProduct(barcode);
		//initialise the SellableIF to null.
		LendableIF tools = null;
		//check if the product can be sold (implements SellableIF). this is also false if no product was found.
		if(abstractProduct instanceof LendableIF) {
			//cast the abstractProduct as a SellableIF. Aka, changing the static type to SellableIF.
			//this is always possible because of the previous if statement making sure it is.
			tools = (LendableIF) abstractProduct;
			//create a SaleOrderLine with the SellableIF product, and a quantity of 1.
			//the quantity can be updated via the setQuantity method.
			lease.addSaleOrderLine(new SaleOrderLine(tools, 1));
		}
		//return the product
		return tools;
	}
}
