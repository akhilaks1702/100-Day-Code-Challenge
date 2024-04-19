package matrixMultiplication;

import java.util.Scanner;

public class MatrixMultiplication {

	private static final int Scanner = 0;

	public static void main(String[] args) {
		// Day 9
		// Write a program to perform matrix multiplication
		
		System.out.println("Program to perform matrix multiplication.\n");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of rows of first matrix: ");
		int r1 = sc.nextInt();
		System.out.println("Enter the number of columns of first matrix: ");
		int c1 = sc.nextInt();
		System.out.println();
		
		System.out.println("Enter the number of rows of second matrix: ");
		int r2 = sc.nextInt();
		System.out.println("Enter the number of columns of second matrix: ");
		int c2 = sc.nextInt();
		System.out.println();
		
		// Check if matrices can be multiplied
		if(r1 != c2) {
			System.out.println("Matrices cannot be multiplied.");
		}
		
		// Input the elements of the matrices
		System.out.println("Enter the elements of first matrix: ");
		int[][] m1 = inputMatrix(sc, r1, c1);
		System.out.println();
		
		System.out.println("Enter the elements of second matrix: ");
		int[][] m2 = inputMatrix(sc, r2, c2);
		System.out.println();
		
		// multiply the matrices
		int[][] matrix = multiplyMatrices(m1, m2);
		
		// displaying the matrix
		displayMatrix(matrix);
		
		sc.close();

	}
	
	// method to input matrix elements
	public static int[][] inputMatrix(Scanner sc, int rows, int cols){
		
		int[][] Matrix = new int[rows][cols];
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				Matrix[i][j] = sc.nextInt();
			}
		}
		
		return Matrix;
	}
	
	// method to multiply matrices
	public static int[][] multiplyMatrices(int[][] m1, int[][] m2){
		
		int m1_rows = m1.length;
		int m1_cols = m1[0].length;
		int m2_cols = m2[0].length;
		
		int[][] result = new int[m1_rows][m2_cols];
		
		for(int i=0; i<m1_rows; i++) {
			for(int j=0; j<m2_cols; j++) {
				for(int k=0; k<m1_cols; k++) {
					result[i][j] += m1[i][k] * m2[k][j];
				}
			}
		}
		
		return result;
	}
	
	// display the matrix
	public static void displayMatrix(int[][] matrix) {
		for(int[] rows : matrix) {
			for(int cell : rows) {
				System.out.println(cell+ " ");
			}
			System.out.println();
		}
	}

}

