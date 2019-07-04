package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD

	@Test
	public void testLinearSearch() {
		// 1. use the assertEquals method to test your linear search method.

		String[] testArr1 = { "lettuce", "tomato", "carrot", "pineapple", "apple", "orange" };
		String[] testArr2 = { "bob", "jim", "sally", "david", "patrick", "sarah" };
		String[] testArr3 = { "football", "soccer", "baseball", "tennis", "volleyball", "track" };

		assertEquals(_00_LinearSearch.linearSearch(testArr1, "lettuce"), 0);
		assertEquals(_00_LinearSearch.linearSearch(testArr2, "david"), 3);
		assertEquals(_00_LinearSearch.linearSearch(testArr3, "track"), 5);

	}

	@Test
	public void testBinarySearch() {
		// 2. use the assertEquals method to test your binary search method.
		// remember that the array must be sorted

		int[] testArr1 = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] testArr2 = { 43, 65, 78, 93, 435, 658, 9899, 10000 };
		int[] testArr3 = { 5, 6, 7, 8, 9, 10, 55, 66, 444, 777, 888, 889, 999, 1000, 10001, 20002 };

		assertEquals(_01_BinarySearch.binarySearch(testArr1, 0, 10, 1), 1);
		assertEquals(_01_BinarySearch.binarySearch(testArr2, 0, 8, 93), 3);
		assertEquals(_01_BinarySearch.binarySearch(testArr3, 0, 16, 1000), 13);

	}

	@Test
	public void testInterpolationSearch() {
		// 3. use the assertEquals method to test your interpolation search method.
		// remember that the array must be sorted and evenly distributed

		int[] testArr1 = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] testArr2 = { 0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30 };
		int[] testArr3 = { 0, 100, 200, 300, 400, 500, 600, 700, 800, 900, 1000 };
		
		assertEquals(_02_InterpolationSearch.interpolationSearch(testArr1, 6), 6);
		assertEquals(_02_InterpolationSearch.interpolationSearch(testArr2, 22), 11);
		assertEquals(_02_InterpolationSearch.interpolationSearch(testArr3, 800), 8);
	}

	@Test
	public void testExponentialSearch() {
		// 4. use the assertEquals method to test your exponential search method.
		// remember that the array must be sorted
		
		int[] testArr1 = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] testArr2 = { 0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30 };
		int[] testArr3 = { 0, 100, 200, 300, 400, 500, 600, 700, 800, 900, 1000 };
		
		assertEquals(_02_InterpolationSearch.interpolationSearch(testArr1, 7), 7);
		assertEquals(_02_InterpolationSearch.interpolationSearch(testArr2, 22), 11);
		assertEquals(_02_InterpolationSearch.interpolationSearch(testArr3, 800), 8);
		
	}
}
