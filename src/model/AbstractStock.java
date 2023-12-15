package model;

import java.util.ArrayList;

public abstract class AbstractStock {

	private Location location;
	private ArrayList<Aisle> aisles;
	private int minQuantity;
	private int maxQuantity;
	
	public AbstractStock(Location location, int minQuantity, int maxQuantity) {
		this.location = location;
		this.setMinQuantity(minQuantity);
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

	public int getMinQuantity() {
		return minQuantity;
	}

	public void setMinQuantity(int minQuantity) {
		this.minQuantity = minQuantity;
	}

	/**
	 * implementation depends on the subclass.
	 * 
	 * @return the quantity of the product
	 */
	public abstract int getQuantity();
	
}
