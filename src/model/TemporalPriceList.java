package model;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * makes a list of prices and what time they got updated
 * @author Julia Rafn & Penrose
 * version 12/12/2023
 * since 12/12/2023
 */

public class TemporalPriceList {
	private ArrayList<TemporalPrice> prices;

	
	
	public TemporalPriceList() {
		this.prices = new ArrayList<>();
	}

	public ArrayList<TemporalPrice> getPrices() {
		return prices;
	}
	/**
	 * gets a price 
	 * @param date
	 * @return 
	 */
	public double getPrice(LocalDateTime date) {
		double res = 0.0d;
		for(int i = prices.size()-1; i >= 0; i--) {
			if(prices.get(i).getDate().compareTo(date)>=0) {
				res = prices.get(i).getPrice();
			}
		}
		return res;
	}
	
	/**
	 * add price to list with a date
	 * @param price
	 * @param date
	 */
	public void addPrice(double price, LocalDateTime date) {
		TemporalPrice temporalPrice = new TemporalPrice(date, price);
		prices.add(temporalPrice);
		//TODO sort
	}
}