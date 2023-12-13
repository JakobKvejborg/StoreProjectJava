package model;

import java.time.LocalDateTime;
/**
 * @author Jakob & Jonas
 * 
 * @version 13-12-2023
 * @since 13-12-2023
 */
public class Lease extends AbstractProduct {
	private double totalPaid;
	private LocalDateTime paymentDue;
	private String state;
	
	
	public Lease(String name, String descripton, String barcode, double purchasePrice, double totalPaid, LocalDateTime paymentDue, String state) {
		super(name, descripton, barcode, purchasePrice);
		this.totalPaid = totalPaid;
		this.paymentDue = paymentDue;
		this.state = state;
		
	}
	
	public double getTotalPaid() {
		return totalPaid;
	}


	public LocalDateTime getPaymentDue() {
		return paymentDue;
	}


	public String getState() {
		return state;
	}

	public boolean isUnique() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
