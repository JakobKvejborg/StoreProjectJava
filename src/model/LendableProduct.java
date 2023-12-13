package model;

public class LendableProduct extends AbstractProduct{
	private double lendPrice;
	private double lendDiscount;
	private double leasePrice;
	private double leaseDiscount;
	private LendableCopy lendableCopy;
	
	public LendableProduct(String name, String descripton, String barcode, double purchasePrice, double lendPrice, double lendDiscount, double leasePrice, double leaseDiscount) {
		super(name, descripton, barcode, purchasePrice);
		this.lendPrice = lendPrice;
		this.lendDiscount = lendDiscount;
		this.leasePrice = leasePrice;
		this.leaseDiscount = leaseDiscount;
	}
	
	public double getLendPrice() {
		return lendPrice;
	}

	public double getLendDiscount() {
		return lendDiscount;
	}

	public double getLeasePrice() {
		return leasePrice;
	}

	public double getLeaseDiscount() {
		return leaseDiscount;
	}

	public boolean isUnique() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
