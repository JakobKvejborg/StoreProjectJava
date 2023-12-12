package model;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * is a not unique product
 * @author Jonas
 * 
 *@version 11/12/2023
 *@since 07/12/2023
 */
public class ShelfProduct extends AbstractProduct implements SellableIF {
	
	private ArrayList<ShelfStock> stocks;	
	//TODO: Make price not break old sales when it is changed.
	private double price;
	//TODO: Make discount not break old sales when it is changed.
	private double discount;
	
	public ShelfProduct(String name, String descripton, String barcode, double purchasePrice, double price, double discount) {
		super(name, descripton, barcode, purchasePrice);
		this.price = price;
		this.discount = discount;
		stocks = new ArrayList<>();
	}
	
	public int getQuantity(Location location) {
		int res = 0;
		for(int i = 0; i < stocks.size(); i++) {
			if(stocks.get(i).getAisle().getLocation().equals(location)) {
				res += stocks.get(i).getQuantity();
			}
		}
		return res;
	}
	
	/**
	 * makes it so the class can't be unique
	 */
	public boolean isUnique() {
		return false;
	}
	
	public double getPrice(LocalDateTime date) {
		return price * (1-discount);
	}
}
