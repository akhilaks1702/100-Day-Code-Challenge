package factorialOfANumber;

import java.util.Scanner;

public class FactorialUsingRecursion {

	public static void main(String[] args) {
		// Day 4
		// Write a program to find factorial of a number using recursion
		
		// Test data - 5
		// Output - 120 ( 5*4*3*2*1 )
		
		// Recursion is a process in which function calls itself
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
		
		if(num<=1) {
			return 1;
		} else {
			fact = num * Factorial(num-1);  
			// Here recursion is used where Factorial method calls itself
			// if num = 5
			// fact = 5*(fact(4)) --> 5*4*(fact(3)) --> 5*4*3*(fact(2)) --> 5*4*3*2*(fact(1)) --> 5*4*3*2*1 --> 120
			return fact;					
		}
		
	}

}
