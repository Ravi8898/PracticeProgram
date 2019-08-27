/* *****************************************************************************
 *  Purpose: Print Damru pattern
 *  
 *  for e.g.
 * 	   *
  	  **
  	 ***
  	*******
  	   ***
  	   **
  	   *
 *           
 *  @author  Ravi maurya
 *  @version 1.0
 *  @since   28-08-2019
 *
 ******************************************************************************/

package com.basicProgram.practice;

import java.util.Scanner;

public class DamruPattern_m3 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the no of row");
		int row=scanner.nextInt();
		getDamru(row);
		scanner.close();

	}
	
	public static int getDamru(int n) {
		
		for(int i=0; i<n; i++) {
			int j=i;
			while(j<n-1) {
				System.out.print(" ");
				j++;
			}
			j=0;
			while(j<=i) {
				System.out.print("*");
				j++;
			}
			if(i==n-1) {
				int k=1;
				while(k<n) {
					System.out.print("*");
					k++;
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

