package model;

/**
 * Handles stock for ShelfProducts.
 * 
 * @author Penrose
 * 
 * @version 15/12/2023
 * @since 14/12/2023
 */
public class ShelfStock extends AbstractStock {
	
	private int quantity;
	
	public ShelfStock(Location location, int quantity, int minQuantity, int maxQuantity) {
		super(location, minQuantity, maxQuantity);
		this.quantity = quantity;
		
	}

	/**
	 * returns the quantity of the product.
	 * 
	 * @return the quantity of the product.
	 */
	public int getQuantity() {
		return quantity;
	}

	
	/**
	 * decreases the quantity by the given amount.
	 * 
	 * @param amount
	 * @return true if the quantity was successfully reduced
	 */
	public boolean decreaseQuantity(int amount){
		boolean res = false;
		if(quantity >= amount) {
			quantity -= amount;
			res = true;
		}
		return res;
	}

}
