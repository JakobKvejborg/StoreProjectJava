package model;

import java.util.ArrayList;

public class UniqueStock {
	private int minQuanity;
	private int maxQuantity;
	private ArrayList<UniqueCopy> uniqueCopies;
	private LendableCopy lendableCopy;
	
	public UniqueStock(int minQuanity, int maxQuantity) {
		this.minQuanity = minQuanity;
		this.maxQuantity = maxQuantity;
		uniqueCopies = new ArrayList<>();
	}

	public int getMinQuanity() {
		return minQuanity;
	}

	public int getMaxQuantity() {
		return maxQuantity;
	}
	
}
