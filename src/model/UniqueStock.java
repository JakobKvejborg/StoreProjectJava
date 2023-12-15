package model;

import java.util.ArrayList;



/**
 * Handle stock for UniqueCopies, and thereby UniqueProducts.
 * 
 * @author penrose
 * 
 * @version 15/12/2023
 * @since 15/12/2023
 */
public class UniqueStock extends AbstractStock {
	
	private ArrayList<AbstractCopy> copies;
	
	public UniqueStock(Location location, int minQuantity, int maxQuantity) {
		super(location, minQuantity, maxQuantity);
		copies = new ArrayList<>();
	}

	/**
	 * gets the quantiy of the stock.
	 * 
	 * @return the quantity
	 */
	public int getQuantity() {
		return copies.size();
	}
	
	public boolean addCopy(AbstractCopy copy) {
		//check if the copy does not already exist
		boolean res = !hasCopy(copy);
		if(res) {
			copies.add(copy);
		}
		return res;
	}
	
	
	/**
	 * checks if a given copy exists in the stock.
	 * 
	 * @param copy
	 * @return
	 */
	public boolean hasCopy(AbstractCopy copy) {
		boolean found = false;
		for(int i = 0; i < copies.size() && !found; i++) {
			if(copies.get(i) == copy) {
				found = true;
			}
		}
		return found;
	}
	
	
	/**
	 * removes a copy from the stock.
	 * 
	 * @param copy the copy to remove
	 * @return true if the copy was successfully removed. 
	 */
	public boolean removeCopy(AbstractCopy copy) {
		return copies.remove(copy);
	}
	
	/**
	 * gets the quantity of items in the stock
	 * 
	 * @return the quantity
	 */
	
}
