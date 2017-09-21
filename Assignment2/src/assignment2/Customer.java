package assignment2;
import java.util.ArrayList;

public class Customer {
	private String customerName;
	private ArrayList<Pizza> orderedPizza= new ArrayList<Pizza>();
	Customer() {
		
	}
	Customer(String name, ArrayList<Pizza> p)
	{
		this.customerName = name;
		this.orderedPizza = p; 
	}
	public String getCustomerName() {
		return customerName;
	}
	public ArrayList<Pizza> getOrderedPizza(){
		return orderedPizza;
	}
	
	private double getTotalSpend() {
		double totalSpend=0.0;
		for(Pizza p : getOrderedPizza()) {
			totalSpend += p.getUnitPrice();
		}
		return totalSpend;		
	}
	private String getPizzaType() {
		String pizzaType="";
		for(Pizza p : getOrderedPizza()) {
			pizzaType += p.getPizzaType() +",";
		}
		return pizzaType;
	}
	private int getLoyaltyPoint() {
		int totalPoint=0;
		for(Pizza p : getOrderedPizza()) {
			totalPoint += p.getLoyaltyPoint();
		}
		return totalPoint;
	}
	public String toString()
	{
		return "Customer name " + getCustomerName() +" has spend a total of $" + getTotalSpend() +
				" on "+ getPizzaType() +" and has earned "+ getLoyaltyPoint() +" points.";
	}
	

	public static void main(String[] args) {
		
		ArrayList<Pizza> customerOrder = new ArrayList<Pizza>();
		customerOrder.add(new Pizza("Type 1", 6.99, 10));
		customerOrder.add(new Pizza("Type 2", 5, 10));
		
		Customer c = new Customer("Nhat", customerOrder);
		
		System.out.println(c);
	}

	

}
