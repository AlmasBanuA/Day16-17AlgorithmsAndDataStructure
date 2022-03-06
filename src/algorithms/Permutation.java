package algorithms;

/**
 * importing the scanner class because to take input string from user
 */

import java.util.Scanner;

/**
 * Permutation of the string means all the possible new strings that can be
 * formed by interchanging the position of the characters of the string. For
 * example, string ABC has permutations [ABC, ACB, BAC, BCA, CAB, CBA].
 * 
 * @author user-Permutation of String
 *
 */
public class Permutation {

	/**
	 * Creating method permute to perform permutation of string
	 * 
	 * @param a -represents the current index
	 * @param b -represents the rest of strings
	 */
	static void permute(String a, String b) {
		/*
		 * initial length of a string is equal to zero
		 */
		if (a.length() == 0) {
			System.out.print(b + "  ");
			return;
		}

		/**
		 * taking for loop for iteration. initial i value is zero and after every step i
		 * value is increment by one
		 */
		for (int i = 0; i < a.length(); i++) {
			char ch = a.charAt(i);
			String left_substr = a.substring(0, i);
			String right_substr = a.substring(i + 1);
			String rest = left_substr + right_substr;
			permute(rest, b + ch);
		}
	}

	/**
	 * create main method for manipulation of permutation of string
	 * 
	 * @param args -Default Java param (Not used)
	 */
	public static void main(String args[]) {
		/**
		 * creating instance of a scanner class
		 */
		Scanner scan = new Scanner(System.in);

		/**
		 * declaring variables a and b string type
		 */
		String a;
		String b = " ";

		System.out.print("Enter the string : ");
		a = scan.next(); // taking from input

		System.out.print("\nAll possible strings are : ");
		/**
		 * calling method permute to perform permutation
		 */
		permute(a, b);
		scan.close();
	}
}
