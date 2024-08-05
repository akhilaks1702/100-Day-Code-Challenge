package stackImplementation;

import java.util.Arrays;
import java.util.Scanner;

// Day 16: Stack Implementation
// Write a Java program to implement a stack data structure.

public class StackImplementation {
	private int maxSize;
	private int[] stackArray;
	private int top;
	
	// Creating a constructor to initialize the stack as the variables are accessed by using private access modifier
	public StackImplementation(int size) {
		this.maxSize = size;
		this.stackArray = new int[maxSize];
		this.top = -1; // -1 tells that its an empty stack
	}
	
	// Creating a method to push the elements to the stack
	public void push(int value) throws Exception {
		if(isFull()) {
			throw new Exception("Stack is full. Unable to push " + value);
		}
		stackArray[++top] = value;
		System.out.println(value + " pushed to the stack.");
	}

	// creating a method to remove the elements from the stack
	public int pop() throws Exception {
		if(isEmpty()) {
			throw new Exception("Stack is empty. Unable to pop the element.");
		}
		return stackArray[top--];
	}
	
	// creating a method to return the top value of a stack without removing it
	public int peek() throws Exception {
		if(isEmpty()) {
			throw new Exception("Stack is empty. Unable to peek element");
		}
		return stackArray[top];
	}
	
	public void display() {
		if(isEmpty()) {
			System.out.println("Stack is empty.");
			return;
		}
		System.out.println("Displaying stack elements:");
		System.out.println(Arrays.toString(stackArray));
		System.out.println();
	}
	
	// creating a method to check whether the stack is empty
	private boolean isEmpty() {
		return (top == -1);
	}
	
	// creating a method to check whether the stack is full
	private boolean isFull() {
		return (top == maxSize - 1);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the stack: ");
		int size = sc.nextInt();
		System.out.println();
		
		StackImplementation si = new StackImplementation(size);
		
		while(true) {
			
			System.out.println("Choose an operation: ");
			System.out.println("1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Peek");
			System.out.println("4. Exit");
			System.out.println();
			
			int choice = sc.nextInt();
			System.out.println();
			
			switch(choice) {
			
			case 1: 
				System.out.println("Enter a value to push: ");
				int value = sc.nextInt();
				try {
					si.push(value);
				} catch(Exception e) {
					System.out.println(e.getMessage());
				}
				break;
				
			case 2:
				try {
					int poppedValue = si.pop();
					System.out.println("Popped value: " + poppedValue);
				} catch(Exception e ) {
					System.out.println(e.getMessage());
				}
				break;
				
			case 3:
				try {
					int topValue = si.peek();
					System.out.println("Top value: " + topValue); 
				} catch(Exception e) {
					System.out.println("e.getMessage");
				}
				break;
				
			case 4:
				si.display();
				break;
				
			case 5:
				System.out.println("Exiting!!!!");
				sc.close();
				return;
				
			default:
				System.out.println("Invalid choice. Pleace choose again");
			
			}
			System.out.println();
		}
	}
}



