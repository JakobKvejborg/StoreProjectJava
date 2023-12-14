package model;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * @author Jakob & Jonas
 * 
 * @version 13-12-2023
 * @since 13-12-2023
 */
public class LeaseContainer {
	private ArrayList<Lease> leases;
	private static LeaseContainer instance;
	private double totalPaid;
	private LocalDateTime paymentDue;
	private String state;
	
	public LeaseContainer() {
		leases = new ArrayList<>();
	}
	
	public static LeaseContainer getInstance() {
		if (instance == null) {
			instance = new LeaseContainer();
		}
		return instance;
	}
	
	public Lease findProduct(String barcode) {
		//Binary Search could be implemented if the list is always sorted.
		Lease res = null;
		boolean found = false;
		for (int i = 0; i < leases.size() && !found; i++) {
			//ProductContainer product = products.get(i);
			Lease product = leases.get(i);
			if (product.getBarcode().equals(barcode)) {
				res = product;
				found = true;
			}
		}
		return res;
	}
	
	public boolean addProduct(Lease product) {
		boolean res = false;
		if(findProduct(product.getBarcode()) == null) {
			leases.add(product);
			//TODO: sort the list
			res = true;
		}
		return res;
	}
}
