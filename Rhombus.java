/* *****************************************************************************
 *  Purpose: Print Rhombus
 *           
 *  @author  Ravi maurya
 *  @version 1.0
 *  @since   26-08-2019
 *
 ******************************************************************************/

package com.basicProgram.practice;

public class Rhombus {

	public static void main(String[] args) {
		
		for(int i=0; i<5;i++) {
			
			for(int j=i; j<5;j++) {
				System.out.print(" ");
			}
			if(i==0 || i==4) {
				for(int k=0; k<5; k++) {
					System.out.print("*");
					
				}
		}
			else
				for(int k=0; k<5; k++) {
					if(k==0 || k==4) {
						System.out.print("*");
					}
					else
						System.out.print(" ");
				}
			System.out.println();

	}
		

	}
}
