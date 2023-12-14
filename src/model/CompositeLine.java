package model;
/**
 * Gives the products inside CompositeProduct quantities
 * @author Julia Rafn
 * @version 14/12/2023
 * @since 14/12/2023 
 */
public class CompositeLine {
	private int quantity;	
	private AbstractProduct product;
	
	/**
	 * contains a product and the quantity of it
	 * @param quantity		the amount of a specific product
	 * @param product		a specific product
	 */
	public CompositeLine(int quantity, AbstractProduct product) {
		this.quantity = quantity;
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}
	
	
}
