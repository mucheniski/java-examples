package longexamples;

import java.util.Scanner;

/*
 * This example source code demonstrates the use of  
 * compare(long x, long y) method of Long class
 */

public class ComparacaoLong {

	public static void main(String[] args) {
		
		// Ask for user input
		System.out.print("Enter the first value:");
		
		// declare a scanner object to read the user input
		Scanner s = new Scanner(System.in);
		
		// assign the input to a variable
		Long value1 = s.nextLong();
		
		
		// Ask for another value
		System.out.print("Enter the second value:");
		Long value2 = s.nextLong();
		
		// compare the two user input
		int result = Long.compare(value1, value2);
		
		// interpret the result
		if(result == 0){
			System.out.println("They are equal");
		}else if(result > 0){
			System.out.println("First Value is greater than the second");			
		}else{
			System.out.println("First Value is less than the second");			
		}		
		
		// close the scanner object
		s.close();
	}

}