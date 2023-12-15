package controller;

import model.AbstractProduct;
import model.ProductContainer;

/**
 * @author Jonas og Jakob
 */
public class ProductCtrl {
	private ProductContainer productContainer;

	public ProductCtrl() {
		this.productContainer = ProductContainer.getInstance();
	}
	
	public AbstractProduct findProduct(String productId) {
		return productContainer.findProduct(productId);
	}
}
