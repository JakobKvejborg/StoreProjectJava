package model;

import java.time.LocalDateTime;

/**
 * @author Jonas, penrose
 * @version 12-12-2023
 * @since 12-12-2023
 */
public class UniqueCopy extends AbstractCopy implements SellableIF{
	private String warrenty;
	private UniqueProduct product;	
	private UniqueStock stock;
	
	public UniqueCopy(String barcode,UniqueProduct product) {
		super(barcode);
		this.product = product;
		this.warrenty = product.getDefaultWarrenty();
		
	}

	public void setWarrenty(String warrenty) {
		this.warrenty = warrenty;
	}
	

	public boolean isUnique() {
		return true;
	}

	@Override
	public double getPrice(LocalDateTime date) {
		return product.getPrice(date);
	}

	@Override
	public String getName() {
		return product.getName();
	}

	@Override
	public int getStock(Location location) {
		int res = 0;
		//check if it has stock assigned, and if it is at the given location.
		if(stock != null && stock.getLocation() == location) {
			res = 1;
		}
		return 1;
	}

	@Override
	public boolean decrementStock(int quanity, Location location) {
		boolean res = false;
		if (getStock(location) == 1) {
			res = stock.removeCopy(this);
			stock = null;
		}
		return res;
	}
	
}
