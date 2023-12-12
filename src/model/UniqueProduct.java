package model;

/**
 * @author Jonas
 * @version 12-12-2023
 * @since 12-12-2023
 */
public class UniqueProduct extends AbstractProduct {
	private String defaultWarrenty;
	private double price;
	private double discount;
	
	public UniqueProduct(String name, String descripton, String barcode, double purchasePrice, double price, double discount, String defaultWarrenty) {
		super(name, descripton, barcode, purchasePrice);
		this.defaultWarrenty = defaultWarrenty;
		this.price = price;
		this.discount = discount;
	}

	public void setDefaultWarrenty(String warrenty) {
		this.defaultWarrenty = defaultWarrenty;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public boolean isUnique() {
		// TODO Auto-generated method stub
		return false;
	}
	

}