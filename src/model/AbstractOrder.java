package model;

import java.time.LocalDateTime;


/**
 * the abstract order than all the different lending or sale types inherit from.
 * 
 * @author Penrose
 * @version 07/12/2023
 */

/**
 * The AbstractOrder class represents an abstract order entity.
 * It contains common attributes and methods for orders.
 */
public abstract class AbstractOrder {
	private int orderNo;
	private LocalDateTime date; 
	private Customer customer;
	private Employee employee;
	
	 /**
     * Constructs an AbstractOrder object with the provided order number and date.
     *
     * @param orderNo The order number associated with this order.
     * @param date    The date and time when the order was made.
     */
	public AbstractOrder(int orderNo, LocalDateTime date) {
		this.orderNo = orderNo;
		this.date = date;
	}
	
	/**
     * Sets the customer associated with this order.
     *
     * @param customer The Customer object linked to this order.
     */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public Customer getCustomer() {
		return customer;
	}
	
	public LocalDateTime getDate() {
		return date;
	}
	
	/**
     * Sets the employee attached to this order.
     *
     * @param employee The Employee object handling this order.
     */
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
}
