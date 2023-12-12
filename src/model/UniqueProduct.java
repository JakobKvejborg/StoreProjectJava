package model;

/**
 * @author Jonas
 * @version 12-12-2023
 * @since 12-12-2023
 */
public class UniqueProduct extends AbstractProduct {
	private String warrenty;
	
	public UniqueProduct(String name, String descripton, String barcode, double purchasePrice, String warrenty) {
		super(name, descripton, barcode, purchasePrice);
		this.warrenty = warrenty;
	}

	public void setWarrenty(String warrenty) {
		this.warrenty = warrenty;
	}

	public boolean isUnique() {
		// TODO Auto-generated method stub
		return false;
	}
	

}
