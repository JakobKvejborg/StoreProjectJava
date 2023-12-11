package model;


/**
 * This interface should be implemented for anything that can be sold.
 * 
 * @author Penrose
 * @version 07/12/2023
 */
public interface SellableIF {
	/**
	 * it gets the price of a product
	 * @return price in double
	 */
	double getPrice();
	/**
	 * @return true if is only allowed to sell quantities of 1
	 */
	boolean isUnique();
	/**
	 * @return The name of the Sellable.
	 */
	String getName();
}
