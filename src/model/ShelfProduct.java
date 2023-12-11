package model;

/**
 * @author Jonas
 * 
 *@version 11/12/2023
 *@since 07/12/2023
 */
public class ShelfProduct extends AbstractProduct implements SellableIF {
	private AbstractProduct abstractProduct;
	
	public ShelfProduct(String name, String descripton, String barcode, double purchasePrice, double price, double discount) {
		super(name, descripton, barcode, purchasePrice, price, discount);
	}
	
	public boolean isUnique() {
		return false;
	}
}
