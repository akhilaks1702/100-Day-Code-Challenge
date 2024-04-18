package stringReversal;

import java.util.Scanner;

public class StringReversal {
    public static void main(String[] args) {
        // Day 8
        // write a program to reverse all the strings in a given sentence
        
        // Input : Hello I am Akhila
        // Output : olleH I ma alihkA
        
        System.out.println("Program to reverse all the strings in a given sentence\n");
            
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the sentence: ");
        String str = sc.nextLine();
        
        Reversal reversal = new Reversal();
        String reversedString = reversal.reverse(str);
        System.out.println("Reversed sentence: " + reversedString);
        
        sc.close();
    }
}

class Reversal {
    
	// Creates reverse method
    String reverse(String str) {
    	
    	// Creates object reversed
        StringBuilder reversed = new StringBuilder();
        
        // Creates array of Strings and stores in words
        // splits the array of char into words when whitespace char is detected
        String[] words = str.split(" ");
        
        // Reversing a word
        for (String word : words) {
            StringBuilder reverseWord = new StringBuilder(word);
            reversed.append(reverseWord.reverse()).append(" ");
        }
        
        return reversed.toString().trim();
    }
}
