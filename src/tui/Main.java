package tui;

import model.Employee;


/**
 * Where the program is run from.
 * creates a dummy employee and starts the saleTUI with that employee.
 * 
 * @author Penrose
 * @version 08/12/2023
 * @since 08/12/2023
 */
public class Main {

	public static void main(String[] args) {
		Employee user = new Employee("ProjectGroup", "UCN", "11234567", "noreply@UCN.dk", "PG");
		SaleTUI saleTui = new SaleTUI(user);
		
		saleTui.start();
	}
}
