package model;

import java.util.ArrayList;
/**
 * @author Jonas og Jakob
 * @version 07/12/2023
 * @since 07/12/2023
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
	
	/** 
	 * Finds a product by barcode
	 * is O(n) 
	 * @param barcode		a barcode in string
	 * @return product, null if no product is found
	 */
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
	/** 
	 * adds a product to list 
	 * @param product		represents a product
	 * @return true if the product has been added to the list
	 */
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

