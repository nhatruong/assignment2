package assignment2;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class assignment2 {

	assignment2() {
		
	}

	public static void main(String[] args) {
		//System.out.println(employeeSalary(46));
		//System.out.println(addDigits(1258));
		//printPerfectNumbers(8128);

	}
	
/*	1. Write a java function to calculate the salary of an employee based on the following rules.

	i. function takes input of number of hours an employee worked and returns the salary.

	ii.  The first 36 hours worked are paid at a rate of 15.0, then the next 5 hours are paid at a rate of 15 * 1.5. 
	Hours after that up to a max of 48 are paid at a rate of 15 * 2.
			
	
	Assume  the total hours is always greater than 0 and less than or equal to 48
*/
	public  double employeeSalary(double hours) {
		double payment;
		final double regularRate =15.0;
		final double halfRate =1.5;
		final double overtimeRate =2.0;
		
		final double overtimeHour =5.0;
		final double regularHour =36.0;
		//final double maxHour = 48.0;
		final double maxHalfHour = regularHour + overtimeHour;
		
		if(hours <= regularHour)
		{
			payment = hours * regularRate;
		}
		else if(hours <= maxHalfHour){
			payment = regularHour * regularRate + (hours - regularHour)* regularRate * halfRate;			
		}
		else {
			payment = regularHour * regularRate +(maxHalfHour - regularHour)* regularRate * halfRate  + (hours - maxHalfHour)* regularRate * overtimeRate;			
		}					
		return payment;
	}

/*	2. Write a java function that adds all the digits of an integer until it is single digit.

	i. function takes an integer as input and returns its sum of digits.

	ii. for example input = 37, sum = 3+7 = 10, sum = 1+0 = 1. result = 1.
*/
	public int addDigits(int input){
		int sum =0;
		String stringRep = Integer.toString(input);
		int length = stringRep.length();
		for(int i=0; i <=length-1;i++)
		{
			sum += Character.getNumericValue(stringRep.charAt(i));
		}
		return sum;
	}
	
/*	3. Write a java function to print all perfect number between 1 and n.

	i. Perfect number is a positive integer which is equal to the sum of its proper positive divisors.


	ii. For example: 6 is the first perfect number, Proper divisors of 6 are 1, 2, 3. Sum of its proper divisors = 1 + 2 + 3 = 6.
*/	
	public static void printPerfectNumbers( int n){		
		int divisorSum =0;
		for(int divisor =1; divisor <= n/2; divisor++)
		{
			if(n % divisor == 0) {
				divisorSum = divisorSum + divisor;
			}				
		}
		if(divisorSum == n)
		{
			System.out.println(n +" is a perfect number");
		}
		else {
			System.out.print(n +" is not a perfect number");
		}
	}
	
	
}		

		
			
	

	
		
	
	
	

