package model;

import java.util.ArrayList;

/**
 * Contains a list of the orders contained in the system.
 * 
 * @author Penrose
 * @version 07/12/2023
 */
public class OrderContainer {

	private ArrayList<AbstractOrder> orders;
	private static OrderContainer instance;
	
	private OrderContainer() {
		orders = new ArrayList<>();
	}
/**
 * @return instance of the singleton
 */
	public static OrderContainer getInstance() {
		if(instance == null) {
			instance = new OrderContainer();
		}
		return instance;
	}
/**
 * adds an order to list
 * @param order		
 * @return 
 */
	public boolean addOrder(AbstractOrder order) {
		//TODO: Make sure no two orders can have the same orderNo
		orders.add(order);
		return true;
	}
}
