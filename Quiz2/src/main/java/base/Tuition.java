package base;

import java.util.Scanner;

import org.apache.poi.ss.formula.functions.FinanceLib;

public class Tuition 

{
	private static double tuitionInitial, percentIncrease, APR, term, tuition;
	private static double total = 0;
	
	public void userInput() 
	
	/**
	 * Assigns values to each variable used in the equation based on user input
	 * Does not return any values
	 */
	
	{
		Scanner input = new Scanner(System.in);
		
		//Initial tuition cost
		System.out.println("Enter your initial tuition cost: ");
		tuitionInitial = input.nextDouble();
		tuition = tuitionInitial;

		//Tuition inflation rate
		System.out.println("Enter the percentage increases for your tuition: ");
		percentIncrease = input.nextDouble();
		percentIncrease /= 100;
		
		//Interest rate (APR)
		System.out.println("Enter the repayment APR (percentage): ");
		APR = input.nextDouble();
		APR /= 100;
		
		//Payment term entered in years, converted to months by the program
		System.out.println("Enter the term of repayment (usually four years): ");
		term = input.nextDouble();
		term *= 12;
		
	}
	
	//Total tuition calculation
	public static double calculationOne(double tuition, double percentIncrease)
	
	/**
	 * Calculates the total tuition based on initial tuition and inflation rate
	 * Outputs the total tuition to the user
	 */
	
	{
		 for (int n = 1; n <= 4; n++)
			 
		 {
			 
			 total = total + tuition;
			 tuition += (tuition * percentIncrease);
			 
		 }
		 
		 total *= 2;
		 total = Math.round(total * 100.0) / 100.0;
		 System.out.println("The total tuition payment is $" + total);
		 
		 return total;
	}
	
	//Monthly tuition payment calculation
	public static double calculationTwo(double APR, double term, double total) 
	
	/**
	 * Calculates the monthly payment using total tuition and input variables
	 * Outputs the monthly payment to the user
	 */
	
	{
		
		double pmt = (((FinanceLib.pmt(APR, term, total * -1, tuition, false)))) / 3;
		
		pmt = Math.round(pmt * 100.0) / 100.0;
		System.out.println("The monthly tuition payment is $" + pmt);
		
		return pmt;
	}

	//Main function
	public static void main(String[] args) 
	
	/**
	 * Executes the program and calls the input and payment calculation methods
	 */
	
	{

		Tuition main = new Tuition();
		main.userInput();
		Tuition.calculationOne(tuition, percentIncrease);
		Tuition.calculationTwo(APR, term, total);
		
	}

}