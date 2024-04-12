package palindromeChecker;

import java.util.Scanner;

public class PalindromeChecker {
	
	public static void main(String[] args) {
		// Day 3
		// Write a Java program to check if a given string is a palindrome or not.
		
		// Test data : 1234321
		// Output : The number is a palindrome number
		
		// A palindrome number is a number which appears to be same in the reverse order as well.
		
		// calling the method palindrome
		palindrome();
	}
	
	static void palindrome() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Program to check whether a number is a palindrome or not.");
		
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		int originalNum = num;
		
		// reversing the above number
		int reverse = 0;
		
		for(int temp=num; temp!=0; temp/=10) {
			reverse = reverse * 10 + temp%10;
		}
		
		// checking if the reversed number is same as the input number
		if(reverse == originalNum) {
			System.out.println(originalNum+" is a palindrome number.");
		} else {
			System.out.println(originalNum+" is not a palindrome number.");
		}
		
		sc.close();
	}

}
