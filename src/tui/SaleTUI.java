package tui;

import java.util.Scanner;

import controller.SaleCtrl;
import controller.SaleCtrlIF;
import model.Employee;
import model.SellableIF;

/**
 * The Text User Interface responsible for creating sales.
 * 
 * @author Penrose
 * @version 07/12/2023
 */

public class SaleTUI {
	
	private SaleCtrlIF saleCtrl;
	private Employee employee;
	private TextInput textInput;
	
	public SaleTUI(Employee employee) {
		this.employee = employee;
		saleCtrl = new SaleCtrl();
		textInput = TextInput.getInstance();
	}
	
	public void start() {
		
	}
	
	private void createSale() {
		saleCtrl.makeSale();
		System.out.println("Input product barcode.");
		String barcode = textInput.readString();
		SellableIF product = saleCtrl.addProduct(barcode);
		if(product == null) {
			System.out.println("could not read barcode, "
					+ "or product could not be sold, try again");
		}
		
	}
	
	
}
