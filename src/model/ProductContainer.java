package model;

import java.util.ArrayList;
/**
 * @author Jonas
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
		//TODO
		return null;
	}
	
	public boolean addProduct(AbstractProduct product) {
		//TODO
		return true;
	}
}

