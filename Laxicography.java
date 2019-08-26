/* *****************************************************************************
 *  Purpose: Laxicography program (To check the which string is greater)
 *           How we can compare two strings lexicographically in Java
 *  @author  Sunny Maurya and Ravi maurya
 *  @version 1.0
 *  @since   27-08-2019
 *
 ******************************************************************************/

package com.basicProgram.practice;

import java.util.Scanner;

public class Lexicography1 {

	public static void main(String args[]) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the first string: ");
		String string1 = scanner.nextLine();
		System.out.println("Enter the second string: ");
		String string2 = scanner.nextLine();
		System.out.println(stringCompare(string1, string2));
		scanner.close();
		
	}

	public static int stringCompare(String str1, String str2) {
		int result;
		if (str1.equals(str2)) {
			
			System.out.println("Both strings are equal");
			return 0;
		}
		else {
			for (int i = 0; i < str1.length() && i < str2.length(); i++) {
				if (str1.charAt(i) == str2.charAt(i)) {
					continue;
				} else {
					
					result = str1.charAt(i) - str2.charAt(i);
					if(result>0) {
						System.out.println("String1 is greater than string2");
						return 1;
					}
					else {
						System.out.println("String2 is greater than string1");
						return -1;
					}
				}
			}

			if (str1.length() < str2.length()) {
				System.out.println("String2 is greater than string1");
				return -1;
			} else {
				System.out.println("String1 is greater than string2");
				return 1;
			}
		}
	}

	
}
