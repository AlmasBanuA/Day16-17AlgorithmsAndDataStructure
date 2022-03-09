package algorithms;

/**
 * An Anagram Detection Example
 * a. Desc -> One string is an anagram of another if the second is simply a
 *    rearrangement of the first. For example, 'heart' and 'earth' are anagrams...
 * b. I/P -> Take 2 Strings as Input such abcd and dcba and Check for Anagrams
 * c. O/P -> The Two Strings are Anagram or not....
 */

/**
 * Procedure:
 * ----------
 * Step 1: Give input two strings.
 * 
 * Step 2: Remove the spaces between words (if the string contains two or more words).
 * 
 * Step 3: Create an array of chars for each string.
 * 
 * Step 4: Sort the arrays.
 * 
 * Step 5: If the sorted arrays are equal, the strings are anagrams, else they aren't anagrams.
 */
import java.util.Arrays;
import java.util.Scanner;

public class AnagramDetection {
	/**
	 * Main method for manipulation of Anagrams
	 * 
	 * @param args - Default Java param (Not used)
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string");
		String str1 = sc.next();
		System.out.println("Enter the second string");
		String str2 = sc.next();

		/**
		 * converting strings to lower case
		 */
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		/**
		 * check if both the string length is same
		 */
		if (str1.length() == str2.length()) {

			/**
			 * convert strings to char array
			 */
			char[] charArray1 = str1.toCharArray();
			char[] charArray2 = str2.toCharArray();

			/**
			 * sort the char array
			 */
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);

			/**
			 * if sorted char arrays are same then the string is anagram
			 */
			boolean result = Arrays.equals(charArray1, charArray2);

			if (result) {
				System.out.println(str1 + " and " + str2 + " are Anagram.");
			} else {
				System.out.println(str1 + " and " + str2 + " are not Anagram.");
				sc.close();
			}
		}
	}
}
