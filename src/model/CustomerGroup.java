package model;


/**
 * @author Jonas
 */
public class CustomerGroup {
	private String name;
	private String type;
	private int maxDiscount;
	
	public CustomerGroup(String name, String type, int maxDiscount) {
		this.name = name;
		this.type = type;
		this.maxDiscount = maxDiscount;
	}

	public int getMaxDiscount() {
		return maxDiscount;
	}
	
}
