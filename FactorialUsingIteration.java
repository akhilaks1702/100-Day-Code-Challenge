package factorialOfANumber;

import java.util.Scanner;

public class FactorialUsingIteration {

	public static void main(String[] args) {
		// Day 4
		// Write a program to find factorial of a number using iteration
		
		// Test data - 5
		// Output - 120 ( 5*4*3*2*1 )
		
		System.out.println("Program to find factorial of a number.");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		long result = Factorial(num);
		System.out.println("The factorial of "+num+" is "+result);
		
		sc.close();
		
	}
	
	static long Factorial(int num) {	
		
		long fact = 1;	
		// long is used instead of int since size of long is more when compared to int
		// Thus can hold a factorial of larger numbers as well
		
		if(num<=1) {
			return 1;
		} else {
			for(int i=1; i<=num; i++) {
				fact = fact*i;
			}
			// here we are finding factorial using for loop which is a iteration method
			return fact;
		}

	}

}
