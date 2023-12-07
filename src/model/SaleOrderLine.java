package model;


/**
 * contains a sellable product, and the quantity for the product. '
 * Should never have a quantity more than 1 for unique products.
 * 
 * @author Rumu11
 * @version 07/12/2023
 */
public class SaleOrderLine {

	private SellableIF product;
	private int quantity;
	
	public SaleOrderLine(SellableIF product, int quantity) {
		this.product = product;
		this.quantity = quantity;
	}
	
	public double getPrice() {
		return product.getPrice();
	}
}
