package primeNumberChecker;

import java.util.Scanner;

public class PrimeNumberChecker {

	public static void main(String[] args) {
		// Day 2
		// Write a Java program to check if a given number is prime or not.
		
		// Test Data: Input a number: 17
		// Expected Output: 17 is a prime number
		
		// A prime number is defined as a natural number greater than 1 and is divisible by only 1 and itself
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Program to check whether a given number is prime or not");
		
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		int flag = 1;
		
		if(num<=1) {
			flag = 0;
		} else {
			for(int i=2; i<=Math.sqrt(num); i++) {
				if(num%i == 0) {
					flag = 0;
					break;
				}
			}
		}
		
		if(flag==0) {
			System.out.println(num+" is not a prime number.");
		} else {
			System.out.println(num+" is a prime number.");
		}
		
		sc.close();

	}

}
