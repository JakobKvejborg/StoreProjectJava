package model;


/**
 * This interface should be implemented for anything that can be sold.
 * 
 * @author Penrose
 * @version 07/12/2023
 */
public interface SellableIF {

	double getPrice();
	
	boolean isUnique();
}
