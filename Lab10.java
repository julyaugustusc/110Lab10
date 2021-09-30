/*-------------------------------------------------------------------------
// AUTHOR: Augustus Crosby
// FILENAME: Lab10.java
// SPECIFICATION: Lab that shows the function of arrays
// FOR: CSE 110- Lab #10
// TIME SPENT: 1 hour
//----------------------------------------------------------------------*/

import java.util.Scanner;
import java.util.Arrays;


public class Lab10 {
	public static void main(String[] args) {
		
		// An integer for the array size.
		int size = 0;
		// A double for the exchange element.
		double exchange = 0.0;
		// A scanner object for requesting input from System.in.
		Scanner in = new Scanner(System.in);
		
		
		// Request Array Size from the User
		
		
		// Print this message "How many elements in the array?"
		System.out.println("How many elements in the array?");
		// Request an integer from the user using the Scanner object
		// and store the inputted value in the integer declared above.
		size = in.nextInt();
		
		// Declare the Array
		
		// Declare a new array of size equal to the size requested in
		// Step 3.
		double[] array1 = new double[size];
		// integer array of a fixed size.
		// int [] integerArray = new int [array size];
		
		//Fill in the Array
		
		for(int i = 0; i < array1.length; i++) {
			
		
			// Display the message: "Please enter the next value."
			System.out.println("Please enter the next value: ");
			// Request the next element (double) from the user using
			// the Scanner object declared in Step 2.
			// Store this element at the ith position of the array
			// created in Step 4.
			array1 [i] = in.nextDouble();
			}
		
		
		// Sort the Array's Elements
		
		
		
		//The first loop for choosing each element of the array
		for (int j = 0; j < array1.length; j++){
			
			// The second loop to compare elements
			// this loop start from j+1
			
			for (int k = j + 1; k < array1.length; k++){
				
				//comparing
				
				if ( array1[j] > array1[k]){
				
					//exchange
					exchange = array1[j];
					array1[j] = array1[k];
					array1[k] = exchange;
					
				}//end of if
			}//end of the second loop
			//we find the correct place of one element in the array
		}//end of the first loop
		//we find the correct place of all elements after finishing the first loop
		
		
		// Display the Array
		
		
		
		// Print the following message to the user, preceded by a
		// newline character.
		
		// "The array's elements after sorting :"
		System.out.print("The array's elements after sorting:\n");
		// use a for loop
		for (int l = 0; l < array1.length; l++)
			//print the elements
			System.out.print(array1[l]+ ", ");
		//end of for
		System.out.print("\n");
		
		
		
		// Remove the minimum
		
		
		for (int m = 0; m < array1.length-1; m++){
			array1[m] = array1[m+1];
			}
			
		//put zero in the last element
		array1[array1.length-1] = 0;;
		
		
		// Display the Array after removing the first element
		
		// Print the following message to the user, preceded by a
		// newline character.
		
		// "The array's elements after left shift :"
		
		System.out.print("The array's elements after left shift: \n");
		
		// use a for loop
		for (int n = 0; n < array1.length; n++)
			//print the elements
			System.out.print(array1[n]+ ", ");;
		//end of for
		System.out.print("\n");
		
		
		// Search for an element and remove it
		
		
		System.out.println("Enter the element to search in the array");
		double search_element = in.nextDouble();
		int element_found_flag = 0;
		
		for (int o = 0; o < array1.length-1; o++){
		
			if (array1[o] == search_element){
			element_found_flag = 1;
			}
			if (element_found_flag == 1){
			array1[o]=array1[o+1];
			}	
		}
		array1[array1.length-1] = 0;;
		
		
		//Display the Final Array
		
		
		// use a for loop
		System.out.print("Search element found\nFinal array:\n");
		for (int p = 0; p < array1.length; p++)
			//print the elements
			System.out.print(array1[p]+ ", ");;
		//end of for
		
		// newline character.
		
	}
}