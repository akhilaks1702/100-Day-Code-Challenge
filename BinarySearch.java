package binarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// Day 10
		// Write a program to implement binary search algorithm
		
		// logic - 
		// 1. Input an array
		// 2. Sort the array in ascending order
		// 3. Input the target element that needs to be found
		// 4. Check the conditions
		// 5. return the result
		
		System.out.println("Program to implement binary search algorithm\n");
		
		int result = BinarySearch();
		
		if(result==-1) {
			System.out.println("Element not found!!!");
		}
		else {
			System.out.println("The index of the target is "+result);
		}
		
	}
	
	public static int BinarySearch() {
		
		Scanner sc = new Scanner(System.in);
		
		// Input an array
		System.out.println("Enter the number of elements to be present in the array: ");
		int num = sc.nextInt();
		System.out.println();
		int[] arr = new int[num];
		System.out.println("Enter the array elements: ");
		for(int i=0; i<num; i++) {
			arr[i] = sc.nextInt();
		}
		
		// sorting the array in ascending order
		Arrays.sort(arr);
		System.out.println();
		
		// Displaying the sorted array
		System.out.println("The sorted array is: ");
		System.out.println(Arrays.toString(arr));
		System.out.println();
		
		// Input a target element
		System.out.println("Enter the element whose index needs to be found: ");
		int target = sc.nextInt();
		System.out.println();
		
		sc.close();
		
		int start = 0;
		int end = arr.length - 1;
		
		while(start<=end) {
			int mid = (start+end)/2;
			if(arr[mid]==target) {
				return mid;
			}
			else if(arr[mid]<target) {
				start = mid+1;	// goes to next half of the array
			}
			else if(arr[mid]>target) {
				end = mid-1;	// goes to the other half of the array
			}
		}
	
		return -1;
	}
}

 
