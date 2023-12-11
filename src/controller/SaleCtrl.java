package controller;

import java.time.LocalDateTime;

import model.AbstractProduct;
import model.Customer;
import model.Employee;
import model.OrderContainer;
import model.Sale;
import model.SaleOrderLine;
import model.SellableIF;

/**
 * @author Jonas og Jakob
 */
public class SaleCtrl implements SaleCtrlIF {
	
	private Employee employee;
	private OrderContainer orderContainer;
	private ProductCtrl productCtrl;
	private CustomerCtrl customerCtrl;
	private SellableIF product;
	private Sale sale;
	
	public SaleCtrl(Employee employee) {
		this.employee = employee;
	}

	public Customer setCustomer(String phone) {
		Customer customer = customerCtrl.findCustomer(phone);
		sale.setCustomer(customer);
		return customer;
	}
	
	//Maybe this function should throw exceptions if the product isn't sellable,
	//or if no product is found.
	
	public SellableIF addProduct(String barcode) {
		AbstractProduct abstractProduct = productCtrl.findProduct(barcode);
		product = null;
		if(abstractProduct instanceof SellableIF) {
			product = (SellableIF) abstractProduct;
			sale.addSaleOrderLine(new SaleOrderLine(product, 1));
		}
		return product;
	}
	
	public boolean setQuantity(int quantity) {
		if(quantity < 1) {
			return false;
		}
		SaleOrderLine saleOrderLine = sale.getSaleOrderLine(sale.getSaleOrderLinesSize() - 1);
		if(saleOrderLine.getProduct().isUnique()) {
			return false;
		}
		saleOrderLine.setQuantity(quantity);
		return true;
	}
	
	public Sale makeSale() {
		//TODO Assign proper orderNo
		sale = new Sale(1, LocalDateTime.now());
		return sale;
	}

	public Sale completeSale(double payment) {
		// TODO make sure the sale has proper values
		if(payment >= sale.getPrice()) {
			orderContainer.addOrder(sale);
			return sale;
		}
		return null;
	}
}
