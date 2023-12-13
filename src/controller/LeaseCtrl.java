package controller;

import model.AbstractProduct;
import model.LeaseContainer;

public class LeaseCtrl {
	private LeaseContainer leaseContainer;
	private ProductCtrl productCtrl;
	
	public LeaseCtrl() {
		
	}
	
	public AbstractProduct findProduct(String barcode) {
		return productCtrl.findProduct(barcode);
	}
}
