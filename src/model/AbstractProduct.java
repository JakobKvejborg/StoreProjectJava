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
	
	
	public AbstractProduct(String name, String descripton, String barcode, double purchasePrice) {
		this.name = name;
		this.descripton = descripton;
		this.barcode = barcode;
		this.purchasePrice = purchasePrice;
	}
	
	public abstract boolean isUnique();
	
	public String getName() {
		return name;
	}
	

	public String getBarcode() {
		return barcode;
	}
	
	
}
