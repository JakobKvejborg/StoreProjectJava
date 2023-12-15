package model;

import java.time.LocalDateTime;

public abstract class AbstractCopy {
	
	private String barcode;
	
	public AbstractCopy(String barcode) {
		this.barcode = barcode;
	}
	
	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	
	public abstract double getPrice(LocalDateTime date);
}
