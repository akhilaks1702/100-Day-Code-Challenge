package arrayRotation;

import java.util.Arrays;	// Helps in array manipulation
import java.util.Scanner;

public class ArrayRotation {
	
	public static void main(String[] args) {
		// Day 6
		// Write a Java program to rotate elements of an array to the right and left by a given number of steps.
		
		// Input array = [1,2,3,4,5,6,7]
		// Steps = 3
		// Output: [5,6,7,1,2,3,4] - right rotation, [4,5,6,7,1,2,3] - left rotation
		
		System.out.println("Program to rotate elements of an array to the right by a given number of steps.");
		System.out.println();
		
		ArrayRotation();

	}
	
	static void ArrayRotation() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of elements to be present in the array: ");
		int num = sc.nextInt();
		
		// Initializing the array
		int[] arr = new int[num];
		System.out.println();
		
		// Entering the elements of the array
		System.out.println("Enter the elements of the array: ");
		for(int i=0; i<=arr.length-1; i++) {
			arr[i] = sc.nextInt();	// Enters the elements from console
		}
		System.out.println();
		
		// Displaying the array
		System.out.println("Displaying the array");
		System.out.println(Arrays.toString(arr));	// toString method returns array with brackets[] and commas(,)
		System.out.println();
		
		// Right Rotation
		
		// Enter the number of steps to rotate the array to right
		System.out.println("Enter the number of steps to rotate the array to right: ");
		int steps = sc.nextInt();
		System.out.println();
				
		// Rotation of the array to right
		for(int k=0; k<steps; k++) {
			int temp = arr[arr.length-1];	// stores last element of array in temp
			for(int i=arr.length-1; i>0; i--) {
				arr[i] = arr[i-1];
			}
			arr[0] = temp;
		}
		
		// Displaying the rotated array to the right
		System.out.println("Displaying the array rotated to the right:");
		System.out.println(Arrays.toString(arr));
		System.out.println();
		
		// Left Rotation
		
		// Enter the number of steps to rotate the array to the left
		System.out.println("Enter the number of steps to rotate the array to the left: ");
		steps = sc.nextInt();
		System.out.println();
		
		// Rotation of the array to left
		int temp1 = 0;
		for (int k = 0; k < steps; k++) {
		    for (int i = 0; i < arr.length - 1; i++) {
		    	if(i==0) {
		    	temp1 = arr[i];
		    	}
		    	arr[i] = arr[i + 1];
		    }
		    arr[arr.length - 1] = temp1;
		}
		
		// Displaying the rotated array to the left
		System.out.println("Displaying the array rotated to the left:");
		System.out.println(Arrays.toString(arr));

		sc.close();
	}
	
}