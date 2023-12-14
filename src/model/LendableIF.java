package model;

import java.time.LocalDateTime;

public interface LendableIF {
	/**
	 * it gets the price of a product
	 * @return price in double
	 */
	double getPrice(LocalDateTime date);
	/**
	 * @return true if the Sellable is only allowed to sell in quantities of 1
	 */
	boolean isUnique();
	/**
	 * @return The name of the Sellable.
	 */
	String getName();
}