package model;

import java.util.ArrayList;
/**
 * @author Jonas og Jakob
 */
public class ProductContainer {
	private static ProductContainer instance;
	private ArrayList<AbstractProduct> products;
	
	public ProductContainer() {
	ArrayList<AbstractProduct> products = new ArrayList<>();
	}
	
	public static ProductContainer getInstance() {
		if(instance == null) {
			instance = new ProductContainer();
		}
		return instance;
	}
	
	public AbstractProduct findProduct(String barcode) {
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
	//TODO make sure barcode is Unique
	public boolean addProduct(AbstractProduct product) {
		boolean res = false;
		if(findProduct(product.getBarcode()) == null) {
			products.add(product);
			//TODO: sort the list
			res = true;
		}
		return res;
	}
}

