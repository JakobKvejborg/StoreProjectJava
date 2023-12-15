package model;

import java.util.ArrayList;

public abstract class AbstractStock {

	private Location location;
	private ArrayList<Aisle> aisles;
	private int minQuanity;
	private int maxQuantity;
	
	public AbstractStock(Location location, int minQuantity, int maxQuantity) {
		this.location = location;
		this.setMinQuanity(minQuantity);
		this.setMaxQuantity(maxQuantity);
	}

	public Location getLocation() {
		return location;
	}

	public int getMaxQuantity() {
		return maxQuantity;
	}

	public void setMaxQuantity(int maxQuantity) {
		this.maxQuantity = maxQuantity;
	}

	public int getMinQuanity() {
		return minQuanity;
	}

	public void setMinQuanity(int minQuanity) {
		this.minQuanity = minQuanity;
	}

	/**
	 * implementation depends on the subclass.
	 * 
	 * @return the quantity of the product
	 */
	public abstract int getQuantity();
	
}
