/* Shontinique Uqdah
 * 07/19/2018
 */

package co.grandcircus.Lab5;

import java.util.Scanner;

public class Lab5 {

	public static void main(String[] args) {
		
		Scanner scnr =  new Scanner(System.in);
		int userInt;
		String userResponse;
		
		do {
			
			do {
			System.out.println("Please enter an integer greater than 0 but less than 10: ");
			userInt = scnr.nextInt();
			}
			while (userInt <= 0 || userInt >= 10);
			
			System.out.println("Your integer is: " + userInt);
			
			long userFactorial = factorialFinder(userInt);
			
			System.out.println("The factorial of your integer is: " + userFactorial);
			
			System.out.println("Would you like to continue learning? (y/n)");
			userResponse = scnr.next();
			
			if (userResponse.trim().toUpperCase().startsWith("N")) {
				System.out.println("Goodbye!");
			}
		}
		while (userResponse.trim().toUpperCase().startsWith("Y"));
		
		scnr.close();

	}
	
	//My method (i.e. function) for calculating factorial
	
	//Accepts an integer as the argument and returns an integer to the caller
	public static int factorialFinder(int x) {
		
		//Stops the recursive loop when 1 is reached
		if (x == 1) {
			return 1;
		}
		
		//Calls itself to break the problem into smaller chunks, i.e. recursively solves for factorial
		else {
			return x * factorialFinder((x-1));
		}
	}

}
