package tui;

import model.Employee;

public class Main {

	public static void main(String[] args) {
		Employee user = new Employee("ProjectGroup", "UCN", "11234567", "noreply@UCN.dk", "PG");
		SaleTUI saleTui = new SaleTUI(user);
		saleTui.start();
	}
}
