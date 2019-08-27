/* *****************************************************************************
 *  Purpose: Print Damru pattern
 *  
 *  for e.g.
 *    	   *
  	  **
  	 ***
  	*******
  	   ***
  	   **
  	   *
 *           
 *  @author  Ravi maurya
 *  @version 1.0
 *  @since   26-08-2019
 *
 ******************************************************************************/

package com.basicProgram.practice;

import java.util.Scanner;

public class DamruPattern {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the no of row");
		int row=scanner.nextInt();
		getDamru(row);
		scanner.close();

	}
	
	public static int getDamru(int n) {
		
		for(int i=0; i<n; i++) {
			for(int j=i; j<n-1; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			if(i==n-1) {
				for(int j=1; j<n; j++) {
					System.out.print("*");
				}
				
			}
			System.out.println();
		}
		for(int i=0; i<n; i++) {
			for(int j=0; j<n-1; j++) {
			System.out.print(" ");
			}
		for(int j=i; j<n-1; j++) {
			System.out.print("*");
		}
		System.out.println();
		}
		return 1;
	}

}
