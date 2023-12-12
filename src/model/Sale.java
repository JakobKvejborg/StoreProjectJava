package model;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * The order that is used for selling different sellable products.
 * 
 * @author Penrose
 * @version 07/12/2023
 * @since 07/12/2023
 */
public class Sale extends AbstractOrder {

	private double craftmanDiscount;
	private double quantityDiscount;
	private double collectionDiscount;

	private ArrayList<SaleOrderLine> saleOrderLines;

	/**
	 * Represents a sale of a product
	 * 
	 * @param orderNo contains the number unique to a specific sale
	 * @param date    contains the date the sale was made
	 */
	public Sale(int orderNo, LocalDateTime date) {
		super(orderNo, date);
		saleOrderLines = new ArrayList<>();
		craftmanDiscount = 0.0d;
		quantityDiscount = 0.0d;
		collectionDiscount = 0.0d;
	}

	/**
	 * adds a saleOrderLine to the sale
	 * 
	 * @param saleOrderLine
	 */
	public void addSaleOrderLine(SaleOrderLine saleOrderLine) {
		saleOrderLines.add(saleOrderLine);
	}

/**
 * Gets total price of all products for a sale
 * @return a double representing the total cost of a sale
 */
	public double getPrice(){
		double total = 0.0d;
		for(int i = 0; i < saleOrderLines.size(); i++) {
			total += saleOrderLines.get(i).getPrice();
		}
		double totalDiscount = craftmanDiscount + quantityDiscount + collectionDiscount;
		double maxDiscount;
		if(super.getCustomer() == null) {
			maxDiscount = CustomerGroup.getDefaultCustomerGroup().getMaxDiscount();
		}
		else {
			maxDiscount = super.getCustomer().getMaxDiscount();
		}
		if(totalDiscount > maxDiscount) {
			totalDiscount = maxDiscount;
		}
		return total * (1-totalDiscount);
	}

	/**
	 * @param index of the <code>SaleOrderLine</code>
	 * @return The <code>SaleOrderLine</code>
	 */
	public SaleOrderLine getSaleOrderLine(int index) {
		return saleOrderLines.get(index);
	}

	/**
	 * @return The the number of <code>SaleOrderLine</code>s in the sale.
	 */
	public int getSaleOrderLinesSize() {
		return saleOrderLines.size();
	}
}
