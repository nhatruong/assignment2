/*	 4. Write a java class called pizza with (Add detail as needed) : 

         i. Create at least 3 attributes :pizza type , unit price and loyalty points. More attributes are welcome to have. 

         ii. Create constructors . Extra-credit of 0.5 point if you write more than 1 right constructor to this class
*/
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
		//this is added from the remote repository
	}
}
