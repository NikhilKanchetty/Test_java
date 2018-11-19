package com.findTheNumber;
import java.util.Scanner;

public class RepeatetionCount {
	
	public void findCount() {
		
		//initializing the scanner for user input
		Scanner s = new Scanner(System.in);
		int num = 0,rows = 0, col = 0,R = 0;
		
		// taking the inputs from the user
		System.out.print("Enter the number of rows and columns for the array\nRows: ");
		rows = s.nextInt();
		System.out.print("Columns: ");
		col = s.nextInt();
		
		// Creating an array
		int [][] arr = new int[rows][col];
		
		// taking the values to be stored in the matrix from the user
		System.out.println("Enter the values into the array");
		for(int i=0; i<rows; i++) {
			for(int j=0; j<col; j++) {
				arr[i][j] = s.nextInt();
			}
			
		}
		
		//printing the matrix for reference
		System.out.println("The matrix given is:");
		for(int i=0; i<rows; i++) {
			for(int j=0; j<col; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.print("\n");
		}
		
		// finding the number user wants
		System.out.println("What is the number you are looking for in the array ?:");
		num = s.nextInt();
		
		// finding the repeated count of the number
		for(int i=0; i<rows; i++) {
			for(int j=0; j<col; j++) {
				if(arr[i][j] == num) {
				R++;
				}
			}
		}
				
		//printing the output
		System.out.println("The Number "+num+" is repeated "+R+" times in the given matrix");
		s.close();
	}
	

	public static void main(String[] args) {
		RepeatetionCount r = new RepeatetionCount();
		r.findCount();
		}

}
