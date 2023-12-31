package tui;

import model.Employee;
import model.Location;


/**
 * Where the program is run from.
 * creates a dummy employee and starts the saleTUI with that employee.
 * 
 * @author Penrose
 * @version 12/12/2023
 * @since 08/12/2023
 */
public class Main {

	public static void main(String[] args) {
		Employee user = new Employee("ProjectGroup", "UCN", "11234567", "noreply@UCN.dk", "PG");
		Location location = new Location("Hjem & Fix", "Pioner Alle 2");
		MainMenuTUI mainMenuTUI = new MainMenuTUI(user, location);
		
		mainMenuTUI.start();
	}
}
