package model;

import java.time.LocalDateTime;


/**
 * the abstract order than all the different lending or sale types inherit from.
 * 
 * @author Rumu11
 * @version 07/12/2023
 */
public abstract class AbstractOrder {
	private int orderNo;
	private LocalDateTime date; 
	private Customer customer;
	private Employee employee;
	
	public AbstractOrder(int orderNo, LocalDateTime date) {
		this.orderNo = orderNo;
		this.date = date;
	}
	
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
}
