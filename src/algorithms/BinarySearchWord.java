package algorithms;

/**
 * Binary Search the Word from Word List a. Desc -> Read in a list of words from
 * File. Then prompt the user to enter a word to search the list. The program
 * reports if the search word is found in the list. b. I/P -> read in the list
 * words comma separated from a File and then enter the word to be searched c.
 * 
 * Logic -> Use Arrays to sort the word list and then do the binary search d.
 * 
 * O/P -> Print the result if the word is found or not
 *
 */

/**
 * The idea is to compare srch with the middle string in the given array. If it
 * matches, then return mid, else if it is smaller than mid, then search in the
 * left half, else search in the right half.
 *
 */
public class BinarySearchWord {

	/**
	 * Returns index of srch if it is present in arr[], else return -1
	 * 
	 * @param arr  -array of a string
	 * @param srch -searching element in the array
	 * @return
	 */
	static int binarySearch(String[] arr, String srch) {
		/**
		 * array value should start with zero and ends with arr.length-1 taking l for
		 * lower index of array at initial position and r is the higher index of the
		 * array it should be one value less than array's length
		 */
		int l = 0, r = arr.length - 1;

		/**
		 * taking while loop for checking condition like l value should less than or
		 * equal to r
		 * 
		 */
		while (l <= r) {

			/**
			 * this formula is taking for mid point in the array represents 'm'
			 */
			
			int m = (l + r)/2;
			int res = srch.compareTo(arr[m]);

			/*
			 * Check if srch value is present at mid
			 */
			if (res == 0)
				return m;

			/*
			 * If srch value greater than midpoint value then ignore the left half
			 */
			if (res > 0)
				l = m + 1;

			/*
			 * If srch value is smaller than midpoint ignore the right half
			 */
			else
				r = m - 1;
		}
		/**
		 * else return -1 to print element is not found
		 */
		return -1;
	}

	/**
	 * Main method for manipulation linkedList
	 * 
	 * @param args - Default Java param (Not used)
	 */
	public static void main(String[] args) {
		String[] arr = { "Delhi", "Karnataka", "Kerala", "Noida" };
		String srch = "ab";

		int result = binarySearch(arr, srch);

		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at " + "index " + result);
	}
}
