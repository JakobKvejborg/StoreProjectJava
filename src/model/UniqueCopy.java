package model;

public class UniqueCopy extends AbstractProduct{
	private String defaultWarrenty;
	
	
	public UniqueCopy(String name, String descripton, String barcode, double purchasePrice) {
		super(name, descripton, barcode, purchasePrice);
		this.defaultWarrenty = defaultWarrenty;
	}

	public boolean isUnique() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
