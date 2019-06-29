package _00_Sorting_Algorithms;

public class _00_SortedArrayChecker {
	// 1. Write a static method called intArraySorted.
	// This method takes in an array of integers
	// and it returns a boolean.
	// The method returns true if the integer
	// array is in ascending order and false otherwise

	static boolean intArraySorted(int[] array) {
		
		int smallest = 0;

		smallest = array[0];

		for (int integer : array) {
			if (integer < smallest) {
				return false;
			}
		}
		return true;
	}
	
	// 2. Write a static method called doubleArraySorted.
	// This method takes in an array of doubles
	// and it returns a boolean.
	// The method returns true if the double
	// array is in ascending order and false otherwise

	static boolean doubleArraySorted(double[] array) {
		
		double smallest = 0;

		smallest = array[0];

		for (double dbl : array) {
			if (dbl < smallest) {
				return false;
			}
		}
		
		return true;
	}
	
	// 3. Write a static method called charArraySorted.
	// This method takes in an array of characters
	// and it returns a boolean.
	// The method returns true if the character
	// array is in alphabetical order and false otherwise
	// (You can compare characters just like integers)

	static boolean charArraySorted(char[] array) {
		
		char first;

		first = array[0];

		for (char letter : array) {
			if (letter < first) {
				return false;
			}
		}
		return true;		
	}
	
	// 4. Write a static method called stringArraySorted.
	// This method takes in an array of Strings
	// and it returns a boolean.
	// The method returns true if the String
	// array is in alphabetical order and false otherwise
	// (Use the compareTo(String) method)
	
static boolean stringArraySorted(String[] array) {
		
		char first;

		first = array[0].charAt(0);

		for (String word : array) {
			if (word.charAt(0) < first) {
				return false;
			}
		}
		return true;		
	}
}
