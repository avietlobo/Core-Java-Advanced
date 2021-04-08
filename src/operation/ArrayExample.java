package operation;

import java.util.Arrays;

public class ArrayExample {

	public static void main(String[] arg) {

		final int VALUE = 7;
		int[] a = new int[5];

		/*
		 * Here we create an array which can contain five elements. The statement
		 * allocates memory for five integers.
		 * 
		 * Also we can declare and initialize an array in one statement.
		 */

		int[] array = new int[] { 2, 4, 5, 6, 7, 3, 2 };

		// Searching an element in array:-

		search(array, VALUE);

		// Sorting an array:-

		Arrays.sort(array);
	}

	static boolean search(int[] array, int value) {
		for (int element : array) {
			if (element == value) {
				return true;
			}
		}
		return false;

	}

}
