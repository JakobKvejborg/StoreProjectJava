package model;

/**
 * is a not unique product
 * @author Jonas
 * 
 *@version 11/12/2023
 *@since 07/12/2023
 */
public class ShelfProduct extends AbstractProduct implements SellableIF {
	
	public ShelfProduct(String name, String descripton, String barcode, double purchasePrice, double price, double discount) {
		super(name, descripton, barcode, purchasePrice, price, discount);
	}
	/**
	 * makes it so the class can't be unique
	 */
	public boolean isUnique() {
		return false;
	}
}
