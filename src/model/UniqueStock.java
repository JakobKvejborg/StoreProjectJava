package model;

import java.util.ArrayList;

public class UniqueStock {
	private int minQuanity;
	private int maxQuantity;
	private Aisle aisle;
	private ArrayList<AbstractCopy> copies;
	
	public UniqueStock(Aisle aisle, int minQuanity, int maxQuantity) {
		this.minQuanity = minQuanity;
		this.maxQuantity = maxQuantity;
		copies = new ArrayList<>();
	}

	public int getMinQuanity() {
		return minQuanity;
	}

	public int getMaxQuantity() {
		return maxQuantity;
	}

	public Aisle getAisle() {
		return aisle;
	}
	
}
