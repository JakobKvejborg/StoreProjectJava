package model;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * @author Jakob, Jonas, Majbritt Kjeldgaard Harsfort
 * 
 * @version 15-12-2023
 * @since 13-12-2023
 */
public class LeaseContainer {
	private ArrayList<Lease> leases;
	private static LeaseContainer instance;
	private double totalPaid;
	private LocalDateTime paymentDue;
	private String state;

	public static LeaseContainer getInstance() {
		if (instance == null) {
			instance = new LeaseContainer();
		}
		return instance;
	}

	public void addProduct(Lease product) {
		leases.add(product);
	}
}
