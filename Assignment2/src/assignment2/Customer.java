/* 5. Write a java class called customer (Add detail as needed) : 

      i. Create Attributes: customer name and which pizzas customer has ordered. 

      ii. Think about what kind of data structure can be used to record the pizza name and number of each kind of pizza.( Give me your thought, Extra credit of 1 point)

      iii. In main method , sum up how much money the customer spent. 
*/
package assignment2;

import java.util.ArrayList;
//this is add from local
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
		return "Customer name " + getCustomerName() +" has spend a total of $" + getTotalSpend();
	}
	

	public static void main(String[] args) {
		
		ArrayList<Pizza> customerOrder = new ArrayList<Pizza>();
		customerOrder.add(new Pizza("Type 1", 6.99, 10));
		customerOrder.add(new Pizza("Type 2", 5, 10));
		
		Customer c = new Customer("Nhat", customerOrder);
		
		System.out.println(c);
	}

}
