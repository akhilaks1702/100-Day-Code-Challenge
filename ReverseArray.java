package reverseArray;

import java.util.Scanner;
import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		// Day 7
		// Write a java program to reverse an array
		
		// Input: {4, 5, 1, 2}
		// Output: {2, 1, 5, 4}
		
		System.out.println("Program to reverse an array. \n");
		
		ArrayReverse();

	}
	
	static void ArrayReverse() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of elements to be in the array: ");
		int num = sc.nextInt();
		System.out.println();
		
		// Initializing the array and entering the array elements
		int[] arr = new int[num];
		int lastDigit = arr.length-1;
		System.out.println("Enter the array elements: ");
		for(int i=0; i<=lastDigit; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println();
		
		// Displaying the array
		System.out.println("Displaying the array: ");
		System.out.println(Arrays.toString(arr));
		System.out.println();
		
		// Reversing the array
		int temp = 0;
		for(int i=0; i<num/2; i++) {	// Iterates only through half since it does not cause repeated iteration
			temp = arr[i];	
			arr[i] = arr[lastDigit - i];	// arr[lastDigit-i] gives last digit according to the iteration value
			arr[lastDigit - i] = temp;
		}
		System.out.println();
		
		int reverse[] = arr;
		// Displaying the reversed array
		System.out.println("Displaying the reversed array: ");
		System.out.println(Arrays.toString(reverse));
		
		sc.close();
		
	}

}
