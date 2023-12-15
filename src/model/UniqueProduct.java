package model;

import java.time.LocalDateTime;

/**
 * @author Jonas, Penrose
 * @version 15-12-2023
 * @since 12-12-2023
 */
public class UniqueProduct extends AbstractProduct {
	private String defaultWarrenty;
	private TemporalPriceList price;
	private TemporalPriceList discount;
	
	public UniqueProduct(String name, String descripton, String barcode, double purchasePrice, double price, double discount, LocalDateTime creationDate, String defaultWarrenty) {
		super(name, descripton, barcode, purchasePrice);
		this.defaultWarrenty = defaultWarrenty;
		this.price = new TemporalPriceList();
		this.price.addPrice(price, creationDate);
		this.discount = new TemporalPriceList();
		this.discount.addPrice(discount, creationDate);
	}

	public void setDefaultWarrenty(String warrenty) {
		this.defaultWarrenty = warrenty;
	}

	public double getPrice(LocalDateTime date) {
		return price.getPrice(date) * (1 - discount.getPrice(date));
	}

	public void addPrice(double price, LocalDateTime date) {
		this.price.addPrice(price, date);
	}

	public void addDiscount(double discount, LocalDateTime date) {
		this.discount.addPrice(discount, date);
	}
	
	public String getDefaultWarrenty() {
		return defaultWarrenty;
	}

	public boolean isUnique() {
		return true;
	}
	

}
