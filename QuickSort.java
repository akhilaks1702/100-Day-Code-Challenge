package quickSort;

import java.util.Arrays;
import java.util.Scanner;

//Day 15
// Write a program for the implementation of Quick Sort
		
// Input array - [ 3, 6, 8, 10, 1, 2, 1]
// Output array - [1, 1, 2, 3, 6, 8, 10]

public class QuickSort {

	public static void main(String[] args) {
		
		int[] arr = arrayCreation();
		System.out.println();
		quicksort(arr, 0, arr.length-1);
		System.out.println("Display sorted array: ");
		System.out.println(Arrays.toString(arr));
	
	}
	
	public static int[] arrayCreation() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of elements to be present in the array: ");
		int num = sc.nextInt();
		System.out.println();
		int[] array = new int[num];
		System.out.println("Enter the elements of the array: ");
		for(int i=0; i<array.length-1; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println();
		System.out.println("Display the array: ");
		System.out.println(Arrays.toString(array));
		
		sc.close();
		
		return array;
	}
	
	public static void quicksort(int[] array, int low, int high) {
		if(low < high) {
			int pivotIndex = partition(array, low, high);
			quicksort(array, low, pivotIndex-1);
			quicksort(array, pivotIndex+1, high);
		}
	}
	
	public static int partition(int[] array, int low, int high) {
		int pivot = array[high];
		int i = low - 1;
		for(int j = low; j < high; j++) {
			if(array[j] <= pivot) {
				i++;
				swap(array, i, j);
			}
		}
		swap(array, i + 1, high);
		return i + 1;
	}
	
	public static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

}
