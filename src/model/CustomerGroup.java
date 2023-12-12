package model;

import java.time.LocalDateTime;

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
	private TemporalPriceList maxDiscount;
	private static CustomerGroup defaultCustomerGroup;
	/**
	 * creates a customer group
	 * @param name			name of the group in string
	 * @param type			represents the type of group in string
	 * @param maxDiscount	the maximum amount of discount represented in double
	 */
	public CustomerGroup(String name, String type, double maxDiscount, LocalDateTime date) {
		this.name = name;
		this.type = type;
		this.maxDiscount = new TemporalPriceList();
		this.maxDiscount.addPrice(maxDiscount, date);
	}
	/**
	 * 
	 * @return a double representing the maximum discount a costumer group can get
	 * 0.2 = 20%
	 */
	public double getMaxDiscount(LocalDateTime date) {
		return maxDiscount.getPrice(date);
	}
	public static CustomerGroup getDefaultCustomerGroup() {
		if(defaultCustomerGroup == null) {
			defaultCustomerGroup = new CustomerGroup("Default Group", "Default", 0.2d, LocalDateTime.of(2020, 1,1,1,1));
		}
		return defaultCustomerGroup;
		
	}
	
}
