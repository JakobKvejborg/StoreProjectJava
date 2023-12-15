package controller;

import model.AbstractProduct;
import model.Lease;
import model.LendableIF;
import model.SaleOrderLine;

/**
 * @author Jakob, Majbritt Kjeldgaard Harsfort
 *
 * @version 15/12/2023
 * @since 14/12/2023
 */

public interface LeaseCtrlIF {
	public Lease makeLease();
	public Lease completeLease(double payment);
}
