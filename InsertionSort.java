package insertionSort;
import java.util.Scanner;
import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		// Day 13
		// Write a Java program to implement the insertion sort algorithm.
		
		// Input array : [ 9 14 3 2 43 11 58 22 ]
		// Output array : [ 2 3 9 11 14 22 43 58 ]
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of elements to be present in the array: ");
		int num = sc.nextInt();
		System.out.println();
		
		int[] arr = new int[num];
		
		System.out.println("Enter the array elements: ");
		for(int i=0; i<num; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println();
		
		System.out.println("Displaying the array: ");
		System.out.println(Arrays.toString(arr));
		System.out.println();
		
		sc.close();
		
		System.out.println("Displaying the array after insertion sort: ");
		InsertionSort is = new InsertionSort();
		is.Insertion_Sort(arr, num);
		System.out.println(Arrays.toString(arr));
	
	}
	
	public static void Insertion_Sort(int[] arr, int num) {
		
		for(int i=1; i<num; i++) {
			if(arr[i] < arr[i-1]) {
				int key = arr[i];
				int j = i-1;
				
				while( j>=0 && arr[j]>key ) {
					arr[j+1] = arr[j];
					j = j-1;
				}
				arr[j+1] = key;
			}
		}
		
	}

}
