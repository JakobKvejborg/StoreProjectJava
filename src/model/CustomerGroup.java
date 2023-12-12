package model;


/**
 * creates a a customer group and manages its maximum discount
 * @author Jonas
 * 
 * @version 11/12/2023
 * @since 07/12/2023
 */
public class CustomerGroup {
	private String name;
	private String type;
	private double maxDiscount;
	private static CustomerGroup defaultCustomerGroup;
	/**
	 * creates a customer group
	 * @param name			name of the group in string
	 * @param type			represents the type of group in string
	 * @param maxDiscount	the maximum amount of discount represented in double
	 */
	public CustomerGroup(String name, String type, double maxDiscount) {
		this.name = name;
		this.type = type;
		this.maxDiscount = maxDiscount;
	}
	/**
	 * 
	 * @return a double representing the maximum discount a costumer group can get
	 * 0.2 = 20%
	 */
	public double getMaxDiscount() {
		return maxDiscount;
	}
	public static CustomerGroup getDefaultCustomerGroup() {
		if(defaultCustomerGroup == null) {
			defaultCustomerGroup = new CustomerGroup("Default Group", "Default", 0.2d);
		}
		return defaultCustomerGroup;
		
	}
	
}
