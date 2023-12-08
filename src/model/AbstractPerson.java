package model;


/**
 * @author first author Jonas
 * @version 07/12/2023
 * @since 07/12/2023
 */
public abstract class AbstractPerson {
	private String name;
	private String address;
	private String phone;
	private String email;
/**
 * 	
 * @param name
 * @param address
 * @param phone
 * @param email
 */
	public AbstractPerson(String name, String address, String phone, String email) {
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.email = email;
	}
/**
 * Gets a phone's number
 * @return a string representing the phones number
 */
	public String getPhone() {
		return phone;
	}

}
