package model;

/**
 * @author Jonas
 */
public class ShelfProduct extends AbstractProduct implements SellableIF {
	private AbstractProduct abstractProduct;
	
	public ShelfProduct(String name, String descripton, String barcode, double purchasePrice, double price, int discount) {
		super(name, descripton, barcode, purchasePrice, price, discount);
	}
	
	public boolean isUnique() {
		return false;
	}
}
