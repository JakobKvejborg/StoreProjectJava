package controller;

import model.*;
import java.time.LocalDateTime;

/**
 * @author Jakob, Jonas, Majbritt Kjeldgaard Harsfort
 * 
 * @version 15/12/2023
 * @since 13/12/2023
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
}
