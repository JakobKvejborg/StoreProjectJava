package model;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * @author Majbritt Kjeldgaard Harsfort
 * @version 14/12/2023
 */
public class Loan extends AbstractOrder {
	private double price;
	private LocalDateTime endDate;
	private LendableIF product;
	

	public Loan(int orderNo,LocalDateTime endDate) {
		super(orderNo, endDate);	
	}

	public boolean isUnique() {
		return false;
	}

	public double getPrice() {
		return price;
	}

	public LocalDateTime endDate(){
		return endDate;
	}
}