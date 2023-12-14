package tui;

import model.Employee;
import model.Location;

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
		return textInput.readInt();
	}

}
