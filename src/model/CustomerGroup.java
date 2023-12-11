package model;


/**
 * @author Jonas
 * 
 * @version 11/12/2023
 * @since 07/12/2023
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
