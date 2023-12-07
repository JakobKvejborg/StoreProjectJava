package model;

import java.time.LocalDateTime;
import java.util.ArrayList;


/**
 * The order that is used for selling different sellable products.
 * 
 * @author Penrose
 * @version 07/12/2023
 */
public class Sale extends AbstractOrder{
	
	private ArrayList<SaleOrderLine> saleOrderLines; 
	
	public Sale(int orderNo, LocalDateTime date) {
		super(orderNo, date);
		saleOrderLines = new ArrayList<>();
	}
	
	public void addSaleOrderLine(SaleOrderLine saleOrderLine) {
		saleOrderLines.add(saleOrderLine);
	}
	
	public double getPrice(){
		double total = 0.0d;
		for(int i = 0; i < saleOrderLines.size(); i++) {
			total += saleOrderLines.get(i).getPrice();
		}
		return total;
	}
}
