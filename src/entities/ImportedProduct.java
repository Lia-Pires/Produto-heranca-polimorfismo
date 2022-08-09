package entities;

public class ImportedProduct extends Product{
	
	Double customsFee;
		
	public ImportedProduct() {
		super();		
	}
		

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}


	public Double getCustomsFee() {
		return customsFee;
	}


	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}


	@Override
	public String toString() {
		return name + " $ " + totalPrice() + " (Costums fee: $ " + customsFee + ")";
	}
	
	@Override
	public String priceTag() {
		return toString();
	} 
	
	
	public double totalPrice() {
		return price + customsFee;
	}



		
	

}
