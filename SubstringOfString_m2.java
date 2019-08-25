/* *****************************************************************************
 *  Purpose: Check whether string is sub string of another string or not 
 *           
 *  @author  Ravi maurya
 *  @version 1.0
 *  @since   26-08-2019
 *
 ******************************************************************************/

package com.basicProgram.practice;

import java.util.Scanner;

public class SubstringOfString_m2 {
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the first string");
		String string1=scanner.nextLine();
		System.out.println("Enter the second string");
		String string2=scanner.nextLine();
		
		int res=checkSubstring(string1,string2);
		System.out.println(res);
		if(res==1) 
			System.out.println("string 2 is sub string of string 1");
		else
			System.out.println("string 2 is not a sub string of string 1");

		scanner.close();
		
	}

	public static int checkSubstring(String s1, String s2) {
		
		int i=0,j=0;
		while(i<s1.length()) {
			
			if(s1.charAt(i)==s2.charAt(j)) {
				i++;
				j++;
			}
			else {
				i++;
				j=0;
			}
			if(j==s2.length()) {
				return 1;
			}			
		}	
		return 0;
	}
}
