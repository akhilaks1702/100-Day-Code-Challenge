package sortingTechniques;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		// Day 11
		// Write a program to implement selection sort
		
		// Logic
		// Set the first element value as the minimum.
		// Compare minimum with the second element, and if the second element is smaller, set that element as the minimum.
		// Repeat the process until you find the minimum element from the list.
		// The next iteration is to repeat the process for the second element.
		// Repeat the process till all the elements are swapped to their corresponding positions.
		
		System.out.println("Program to implement selection sort.\n");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of elements to be present in the array: ");
		int num = sc.nextInt();
		System.out.println();
		
		System.out.println("Enter the elements of the array: ");
		int[] arr = inputArray(sc, num);
		System.out.println();
		
		System.out.println("Display the array: ");
		int[] displayArray = displayArray(arr);
		System.out.println();
		
		System.out.println("Displaying the sorted array using selection sort: ");
		int[] displaySortedArray = selectionSort(arr);
		
		sc.close();
		
	}
	
	public static int[] inputArray(Scanner sc, int num) {
		int[] Array = new int[num];
		for(int i=0; i<num; i++) {
			Array[i] = sc.nextInt();
		}
		return Array;
	}
	
	public static int[] displayArray(int[] Array) {
		for(int i : Array) {
			System.out.println(i+ " ");
		}
		return Array;
	}
	
	public static int[] selectionSort(int[] Array) {
	    for (int i = 0; i < Array.length - 1; i++) {
	    	// Finding the minimum element
	        int minimumIndex = i;
	        for (int j = i + 1; j < Array.length; j++) {
	            if (Array[j] < Array[minimumIndex]) {
	                minimumIndex = j;
	            }
	        }
	        // Swapping the minimum element with the current element
	        if (minimumIndex != i) {
	            int temp = Array[i];
	            Array[i] = Array[minimumIndex];
	            Array[minimumIndex] = temp;
	        }
	    }
	    // Displaying the sorted array
	    for (int i : Array) {
	        System.out.print(i + " ");
	    }
	    return Array;
	}

}
