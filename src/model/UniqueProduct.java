package model;

public class UniqueProduct extends AbstractProduct {
	private String barcode;
	private String warrenty;
	
	public UniqueProduct(String name, String descripton, String barcode, double purchasePrice, double price, double discount, String barcode2, String warrenty) {
		super(name, descripton, barcode, purchasePrice, price, discount);
		this.warrenty = warrenty;
	}

	public void setWarrenty(String warrenty) {
		this.warrenty = warrenty;
	}

	@Override
	public boolean isUnique() {
		// TODO Auto-generated method stub
		return false;
	}
	

}
