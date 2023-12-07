package model;

/**
 * @author Jonas
 */
public class Employee extends AbstractPerson{
	private String username;

	public Employee(String name, String address, String phone, String email, String username) {
		super(name, address, phone, email);
		this.username = username;
	}
	
	
}
