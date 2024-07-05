package mergeSort;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {

	public static void main(String[] args) {
		// Day 14
		// Write a Java program to implement the merge sort algorithm.
		
		// Input array - [ 12 11 13 5 6 7 ]
		// Output array - [ 5 6 7 11 12 13 ]
		
		// Algorithm 
		// Divide the given array into n sub-arrays , each containing a single element
		// Repeatedly merge the sub-arrays into new sorted array to produce a final sorted array
		
		int[] array = arrayCreation();
		int left = 0;
		int right = array.length - 1;
		MergeSort ms = new MergeSort();
		ms.mergeSort(array, left, right);
		System.out.println(Arrays.toString(array));
	}
	
	// creating an array
	public static int[] arrayCreation() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of elements to be present in the array: ");
		int size = sc.nextInt();
		System.out.println();
		int[] array = new int[size];
		System.out.println("Enter the array elements: ");
		for(int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println();
		System.out.println("Display the array: ");
		System.out.println(Arrays.toString(array));
		System.out.println();
		
		sc.close();
		
		return array;
	}
	
	// creating a merge function
	// takes two sub arrays and merge into a single sorted array
	public static void merge(int[] array, int left, int mid, int right) {
		// Calculating sizes of sub-arrays
		int size1 = mid - left + 1; // size of first sub-array
		int size2 = right - mid;	// size of second sub-array
		
		// Creating temporary sub-arrays
		int[] leftArray = new int[size1];
		int[] rightArray = new int[size2];
		
		// Copying elements of original array to the temporary sub-arrays
		for(int i = 0; i < size1; i++) {
			leftArray[i] = array[left + i];
		}
		for(int j = 0; j < size2; j++) {
			rightArray[j] = array[mid + 1 + j];
		}
		
		// merging temporary arrays back to original array
		int i = 0, j = 0, k = left;
		while(i < size1 && j < size2) {
			if(leftArray[i] <= rightArray[j])
			{
				array[k] = leftArray[i];
				i++;
			} else {
				array[k] = rightArray[j];
				j++;
			}
			k++;
		}
		
		// copying remaining elements to the original array
		while(i < size1) {
			array[k] = leftArray[i];
			i++; k++;
		}
		while(j < size2) {
			array[k] = rightArray[j];
			j++; k++;
		}
	}
	
	public static void mergeSort(int[] array, int left, int right) {
		if(left < right) {
			int mid = (left + right) / 2;
			
			// recursively calling the mergeSort function to sort the arrays
			// sorting the left half of the array
			mergeSort(array, left, mid);
			// sorting the right half of the array
			mergeSort(array, mid+1, right);
			
			// calling the merge function to merge the sorted arrays
			merge(array, left, mid, right);
		}
	}

}
