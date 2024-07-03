package bubbleSort;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// Day 12
		// Write a Java program to implement the bubble sort algorithm.
		
		// Input Array = [ 13, 32, 26, 35, 10 ]
		// Output Array = [ 10, 13, 26, 32, 35 ]
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of elements to be present in the array: ");
		int num = sc.nextInt();
		System.out.println();
		
		int[] arr = new int[num];
		System.out.println();
		
		System.out.println("Enter the elements of the array: ");
		for(int i=0; i<num; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println();
		
		System.out.println("Displaying the array: ");
		System.out.println(Arrays.toString(arr));
		System.out.println();
		
		System.out.println("Displaying the array after sorting: ");
		BubbleSort bs = new BubbleSort();
		bs.Bubble_Sort(arr, num);
		System.out.println(Arrays.toString(arr));	// prints sorted array
		System.out.println();
		
		sc.close();

	}
	
	static void Bubble_Sort(int[] arr, int num) {
		
		for(int i=0; i<num-1; i++) {
			for(int j=0; j<num-1-i; j++)
			if(arr[j]>arr[j+1]) {
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			} 
		}
		
	}

}
