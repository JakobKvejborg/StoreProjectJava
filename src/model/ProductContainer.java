package model;

import java.util.ArrayList;
/**
 * @author Jonas og Jakob
 */
public class ProductContainer {
	private static ProductContainer instance;
	private ArrayList<AbstractProduct> products;
	
	public ProductContainer() {
	
	}
	
	public static ProductContainer getInstance() {
		if(instance == null) {
			instance = new ProductContainer();
		}
		return instance;
	}
	
	public AbstractProduct findProduct(String barcode) {
		//Binary Search could be implemented if the list is always sorted.
		AbstractProduct res = null;
		boolean found = false;
		for (int i = 0; i < products.size() && !found; i++) {
			//ProductContainer product = products.get(i);
			AbstractProduct product = products.get(i);
			if (product.getBarcode().equals(barcode)) {
				res = product;
				found = true;
			}
		}
		return res;
	}
	
	public boolean addProduct(AbstractProduct product) {
		//TODO
		return true;
	}
}

