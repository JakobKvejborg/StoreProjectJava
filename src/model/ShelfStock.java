package model;

public class ShelfStock {
	
	private Aisle aisle;
	private int quantity;
	private int minQuantity;
	private int maxQuantity;
	
	public ShelfStock(Aisle aisle, int quantity, int minQuantity, int maxQuantity) {
		this.aisle = aisle;
		this.quantity = quantity;
		this.minQuantity = minQuantity;
		this.maxQuantity = maxQuantity;
	}
	
	public Aisle getAisle() {
		return aisle;
	}

	public int getQuantity() {
		return quantity;
	}

	public boolean decreaseQuantity(int amount){
		boolean res = false;
		if(quantity >= amount) {
			quantity -= amount;
			res = true;
		}
		return res;
	}

}
