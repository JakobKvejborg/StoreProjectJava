package controller;

import model.AbstractProduct;
import model.ProductContainer;

/**
 * @author Jonas og Jakob
 */
public class ProductCtrl {
	private ProductContainer productContainer;

	public ProductCtrl() {
	
	}
	
	public AbstractProduct findProduct(String barcode) {
		return productContainer.findProduct(barcode);
	}
}
