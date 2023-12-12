package model;

/**
 * @author Jonas
 * @version 12-12-2023
 * @since 12-12-2023
 */
public class UniqueCopy extends AbstractProduct{
	private String warrenty;
	
	
	public UniqueCopy(String name, String descripton, String barcode, double purchasePrice, String warrenty) {
		super(name, descripton, barcode, purchasePrice);
		this.warrenty = warrenty;
	}

	public void setWarrenty(String defaultWarrenty) {
		this.warrenty = warrenty;
	}
	

	public boolean isUnique() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
