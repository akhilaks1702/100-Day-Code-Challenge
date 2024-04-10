package fibonacciSeries;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// Day 1
		// Write a Java program to generate the Fibonacci series up to a given number of terms.
		
		// In fibonacci series, next number is the sum of previous two numbers 
		// For example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc.
		// The first two numbers of fibonacci series are 0 and 1.
		
        // Test Data: Number of terms: 8
	    // Expected Output: Fibonacci series: 0 1 1 2 3 5 8 13.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Generating Fibonacci Series upto a given number of terms.");
		
		System.out.println("Enter the number of terms: ");
		int num = sc.nextInt();
		
		int first_num = 0; 
		int second_num = 1;
		
		for(int i=0; i<num; i++) {
			System.out.println(first_num+ " ");
			int next_num = first_num + second_num;
			first_num =  second_num;
			second_num = next_num;
		}
		
		sc.close();

	}

}
