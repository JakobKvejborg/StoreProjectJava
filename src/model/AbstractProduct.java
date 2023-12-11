package model;

/**
 * @author Jonas
 * 
 *@version 11/12/2023
 *@since 07/12/2023
 */
public abstract class AbstractProduct {
	private String name;
	private String descripton;
	private String barcode;
	private double purchasePrice;
	//TODO: Make price not break old sales when it is changed.
	private double price;
	//TODO: Make discount not break old sales when it is changed.
	private double discount;
	
	public AbstractProduct(String name, String descripton, String barcode, double purchasePrice, double price, double discount) {
		this.name = name;
		this.descripton = descripton;
		this.barcode = barcode;
		this.purchasePrice = purchasePrice;
		this.price = price;
		this.discount = discount;
	}
	
	public abstract boolean isUnique();
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}

	public String getBarcode() {
		return barcode;
	}
	
	
}
