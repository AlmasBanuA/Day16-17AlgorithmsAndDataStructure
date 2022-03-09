package algorithms;

/**
 * a. Desc -> Reads in integers prints them in sorted order using Bubble Sort
 * b. I/P -> read in the list 
 * c. O/P -> Print the Sorted List
 *
 */

/**
 * Bubble sort, sometimes referred to as sinking sort, is a simple sorting
 * algorithm that repeatedly steps through the list, compares adjacent elements
 * and swaps them if they are in the wrong order. The pass through the list is
 * repeated until the list is sorted.
 *
 */
public class BubbleSort {

	public static int[] intBubbleSort(int[] arr) {

		/**
		 * taking for loop for number of rounds
		 */
		for (int i = 0; i < arr.length - 1; i++) {

			/**
			 * taking for loop for comparison of adjacent elements
			 */
			for (int j = 0; j < arr.length - i - 1; j++) {
				/**
				 * taking condition if arr[j] elements should be greater then coming next
				 * elements here comparison of two elements occurs
				 */
				if (arr[j] > arr[j + 1]) {
					/**
					 * swapping of elements
					 */
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		return arr;

	}

	/**
	 * Main method for manipulation of Bubble Sort
	 * 
	 * @param args - Default Java param (Not used)
	 */
	public static void main(String[] args) {
		int arr[] = { 8, 7, 36, 23, 15, 43, 5 };

		System.out.println("Array Before Bubble Sort");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		/**
		 * sorting array elements using bubble sort
		 */
		intBubbleSort(arr);

		System.out.println("Array After Bubble Sort");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}
}
