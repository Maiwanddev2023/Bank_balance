// Chapter 6 example 5/17/2023

import java.util.Scanner;

public class BankBalance
{
	public static void main(String[] args)
	{
		// Variables and constants
		double balance;
		int response;
		int year = 1;
		final double INT_RATE = 0.03;
		Scanner keyboard = new Scanner(System.in);

		// Input phase
		System.out.print("Please enter initial bank balance >");
		balance = keyboard.nextDouble();
		System.out.println("Do you want to see next year's balance?");
		System.out.print("Enter 1 for YES or any other for NO >");
		response = keyboard.nextInt();

		// Processing and output phase
		while(response == 1)
		{
			balance = balance + (balance * INT_RATE);
			System.out.println("\nAfter year " + year + " at " + INT_RATE + " intrest rate, balance is $ " + balance);
			year = year + 1;
			System.out.println("\nDo you want to see next year's balance?");
			System.out.print("Enter 1 for YES or any other for NO >");
		response = keyboard.nextInt();
		} // end of while loop

		// Final sign-off statement after the looping is done
		System.out.println("Have a great day!");
	} // end of main
} // end of class