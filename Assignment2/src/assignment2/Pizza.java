package assignment2;

public class Pizza {

	private String pizzaType;
	private double unitPrice;
	private int loyaltyPoint;
	
	Pizza()
	{
		this.pizzaType=""; this.unitPrice =0.0; this.loyaltyPoint =0;
	}
	Pizza(String type, double price, int point)
	{
		this.pizzaType =type; this.unitPrice = price; this.loyaltyPoint = point;
	}
	Pizza(Pizza p){
		this.pizzaType = p.pizzaType; 
		this.unitPrice = p.unitPrice;
		this.loyaltyPoint = p.loyaltyPoint; 
	}
	public double getUnitPrice() {
		return this.unitPrice;
	}
	public String getPizzaType() {
		return this.pizzaType;
	}
	public int getLoyaltyPoint() {
		return this.loyaltyPoint;
	}
	
	public static void main(String[] args) {
		
	}

}
