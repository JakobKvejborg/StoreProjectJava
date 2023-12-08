package tui;

import java.util.Scanner;

import controller.SaleCtrl;
import controller.SaleCtrlIF;
import model.Customer;
import model.Employee;
import model.SellableIF;
import model.Sale;


/**
 * The Text User Interface responsible for creating sales.
 * 
 * @author Penrose
 * @version 08/12/2023
 * @since 07/12/2023
 */
public class SaleTUI {

	private SaleCtrlIF saleCtrl;
	private Employee employee;
	private TextInput textInput;

	public SaleTUI(Employee employee) {
		this.employee = employee;
		saleCtrl = new SaleCtrl(employee);
		textInput = TextInput.getInstance();
	}

	public void start() {
		createSale();
	}
	
	private boolean isQuitText(String text) {
		return text.equalsIgnoreCase("quit") || text.equalsIgnoreCase("q") || text.equalsIgnoreCase("next")
				|| text.equalsIgnoreCase("done");
	}

	private void createSale() {
		Sale sale = saleCtrl.makeSale();
		
		boolean allProductsAdded = false;
		while (allProductsAdded) {
			System.out.println("Input product barcode. If all products have been added, input next.");
			String barcode = textInput.readString();
			if (isQuitText(barcode)) {
				allProductsAdded = true;
			} else {
				addProduct(barcode);
			}
		}
		Customer customer = setCustomer();
		System.out.println("total price of sale:" + sale.getPrice());
		
		
	}
	
	private void addProduct(String barcode) {
		SellableIF product = saleCtrl.addProduct(barcode);
		if (product == null) {
			System.out.println("could not read barcode, or product could not be sold, try again");
		} else {
			if (!product.isUnique()) {
				setQuantity();
			}
		}
	}
	
	private void setQuantity() {
		boolean quantitySuccess = false;
		while (!quantitySuccess) {
			System.out.println("Input quantity.");
			int quantity = textInput.readInt();
			quantitySuccess = saleCtrl.setQuantity(quantity);
			if (!quantitySuccess) {
				System.out.println("could not set the quantity to: " + quantity);
			}
		}
	}
	
	private Customer setCustomer() {
		Customer customer = null;
		boolean success = false;
		while (!success) {
			System.out.println("input customr name. If no customer, input \"next\".");
			String phone = textInput.readString();
			if (isQuitText(phone)) {
				customer = null;
			} else {
				customer = saleCtrl.setCustomer(phone);
				if(customer != null) {
					success = true;
				} else {
					System.out.println("Could not find the customer!");
				}
			}
		}
		return customer;
		

	}
	
	private double setPayment() {
		//TODO: make this accept payment by card and such, never happening in the time we have been alloted.
		double payment = textInput.readDouble();
		
		return payment;
	}

}
