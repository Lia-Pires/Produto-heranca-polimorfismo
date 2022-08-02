package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	Date manufactureDate;

	
	public UsedProduct() {
		super();		
	}
	
	
	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}


	public Date getManufactureDate() {
		return manufactureDate;
	}


	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	
	@Override
	public String toString() {
		return name + "(used) $ " + price + " Manufacture date: " + sdf.format(manufactureDate) + ")";
	}
	
	@Override
	public String priceTag() {
		return toString();
	}
	
	
	
	
}
