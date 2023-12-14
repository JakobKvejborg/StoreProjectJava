package tui;

import model.Employee;
import model.Location;

/**
 * Main menu for accessing the different sub-menus
 * 
 * @author Penrose
 * @version 14/12/2023
 * @since 14/12/2023
 */
public class MainMenuTUI {

	private Employee employee;
	private Location location;
	private TextInput textInput;

	public MainMenuTUI(Employee employee, Location location) {
		this.employee = employee;
		this.location = location;
		textInput = TextInput.getInstance();
	}

	public void start() {
		boolean quit = false;

		while (!quit) {
			switch (createMainMenu()) {
			case 0:
				quit = true;
				break;
			case 1:
				new SaleTUI(employee, location).start();
				break;
			case 2:
				new CustomerTUI().start();
				break;
			case 3:
				// should not make it to the final build.
				TryMe.createCustomers();
				TryMe.createProducts();
				break;
			default:
				System.out.println("Please enter a valid number!");

			}
		}
	}

	public int createMainMenu() {
		System.out.println("Please enter a number to choose a menu:");
		System.out.println("0: quit.");
		System.out.println("1: Sale Menu.");
		System.out.println("2: Customer Menu.");
		// should not make it to the final build.
		System.out.println("3: Generate Test Data.");

		return textInput.readInt();
	}

}
