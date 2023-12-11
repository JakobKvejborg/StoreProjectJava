package model;


/**
 * @author Jonas
 */
public class CustomerGroup {
	private String name;
	private String type;
	private double maxDiscount;
	
	public CustomerGroup(String name, String type, double maxDiscount) {
		this.name = name;
		this.type = type;
		this.maxDiscount = maxDiscount;
	}

	public double getMaxDiscount() {
		return maxDiscount;
	}
	
}
