package model;

/**
 * @author Jonas
 */
public abstract class AbstractProduct {
	private String name;
	private String descripton;
	private String barcode;
	private double purchasePrice;
	private double price;
	private int discount;
	
	public AbstractProduct(String name, String descripton, String barcode, double purchasePrice, double price, int discount) {
		this.name = name;
		this.descripton = descripton;
		this.barcode = barcode;
		this.purchasePrice = purchasePrice;
		this.price = price;
		this.discount = discount;
	}
	
	public boolean isUnique() {
		return true;
	}

	
	public double getPrice() {
		return price;
	}

	public String getBarcode() {
		return barcode;
	}
	
	
}
