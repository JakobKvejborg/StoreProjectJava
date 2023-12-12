package model;

import java.time.LocalDateTime;

/**
 * contains a date and price
 * @author Julia Rafn & Penrose
 * version 12/12/2023
 * since 12/12/2023
 */

public class TemporalPrice {
	private LocalDateTime date;
	private double price;
	
	
	public TemporalPrice(LocalDateTime date, double price) {
		this.date = date;
		this.price = price;
	}
	
	public LocalDateTime getDate() {
		return date;
	}
	public double getPrice() {
		return price;
	}
	
	

}
