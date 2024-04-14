package arraySum;

import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		// Day 5
		// Write a Java program to find the sum of all elements in an array.
		
		// Test data : {1,2,3,4,5}
		// Output : 15
		
		System.out.println("Program to find the sum of all the elements in an array.");
		System.out.println();
		
		ArraySum();
		
	}
	
	static void ArraySum() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of elements to be present in the array: ");
		int num = sc.nextInt();
		// Initializing the array
		int[] arr = new int[num];
		System.out.println();
		
		// Entering the elements of the array
		System.out.println("Enter the array elements: ");
		for(int i=0; i<=arr.length-1; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println();
		
		// Displaying the array elements
		System.out.println("Displaying the array");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		// Performing sum on the elements of the array
		int sum = 0;
		for(int i=0; i<=arr.length-1; i++) {
			sum += arr[i];	// sum = sum + arr[i]
		}
		System.out.println();
		System.out.println("The sum of the elements of the array is "+sum);
		
		
		sc.close();
		
	}

}
