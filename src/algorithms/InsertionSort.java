package algorithms;

/**
 * Insertion Sort a. Desc -> Reads in strings and prints them in sorted order
 * using insertion sort. b. I/P -> read in the list words c. Logic -> Use
 * Insertion Sort to sort the words in the String array d. O/P -> Print the
 * Sorted List
 * 
 */

/**
 * Procedure: ---------- Step 1 - If the element is the first element, assume
 * that it is already sorted. Return 1.
 * 
 * Step2 - Pick the next element, and store it separately in a key.
 * 
 * Step3 - Now, compare the key with all elements in the sorted array.
 * 
 * Step 4 - If the element in the sorted array is smaller than the current
 * element, then move to the next element. Else, shift greater elements in the
 * array towards the right.
 * 
 * Step 5 - Insert the value.
 * 
 * Step 6 - Repeat until the array is sorted
 * 
 *
 */
public class InsertionSort {

	public static void main(String[] args) {

		/**
		 * creating instance of class InserionSort
		 */
		InsertionSort sort = new InsertionSort();

		/**
		 * taking array of Strings
		 */
		String names[] = { "Bangalore", "Hubli", "Kerala", "Delhi", "Maharashtra", "Hyderabad" };

		System.out.println("\nBefore Sorting");
		/**
		 * calling printArray method from main and print the elements before swapping
		 */
		sort.printArray(names);

		System.out.println("\nAfter Sorting");
		/**
		 * calling sortByInsertion method and print the elements After swapping
		 */
		sort.sortByInsertion(names);
		sort.printArray(names);

		Integer values[] = { 45, 19, 25, 64, 76, 11 };

		System.out.println("\nBefore Sorting");
		sort.printArray(values);

		System.out.println("\nAfter Sorting");
		sort.sortByInsertion(values);
		sort.printArray(values);
	}

	/**
	 * creating method sortByInsertion for sorting the elements in ascending order
	 * 
	 * @param <t>   -for generics
	 * @param array -passing array of elements
	 * @return -return to array
	 */
	public <t extends Comparable<t>> t[] sortByInsertion(t array[]) {

		/**
		 * taking for loop to do sorting here initial i value is one and execute till i
		 * value becomes less than array length then array[1] is 19 here stored in temp
		 * variable then j becomes one now
		 */
		for (int i = 1; i < array.length; i++) {
			t temp = array[i];
			int j = i;

			/**
			 * if above conditions will satisfied entering to while loop checking j is
			 * greater than one here j=1; and array[j-1] becomes zero then array[0] =45 now
			 * compare to temp variable value that is 19 45 comparing with 19 both should
			 * greater than zero before in temp variable 19 is there and after sorting it
			 * becomes 45 and j becomes 45 both 19 and 45 swapped their positions hence
			 * sorting done likewise every operations done after incrementing i value
			 */
			while (j > 0 && (array[j - 1].compareTo(temp) > 0)) {
				array[j] = array[j - 1];
				j = j - 1;
			}
			array[j] = temp;
		}
		return array;
	}

	/**
	 * creating method printArray to print the values
	 * 
	 * @param <t>   -generics
	 * @param array -creating array of string and integer
	 */
	public <t> void printArray(t array[]) {
		System.out.println("Printing the Array : ");
		for (t element : array) {
			System.out.println(element);
		}
	}
}
