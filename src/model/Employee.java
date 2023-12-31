package model;

/**
 * @author Jonas
 * @version 07/12/2023
 * @since 07/12/2023
 */
public class Employee extends AbstractPerson{
	private String username;
/**
 * calls the AbstractPerson class
 * @param name
 * @param address
 * @param phone
 * @param email
 * @param username
 */
	public Employee(String name, String address, String phone, String email, String username) {
		super(name, address, phone, email);
		this.username = username;
	}
	
	
}
