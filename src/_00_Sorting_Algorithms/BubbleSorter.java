package _00_Sorting_Algorithms;

public class BubbleSorter extends Sorter {
	public BubbleSorter() {
		type = "Bubble";
	}

	// 1. Use the bubble sorting algorithm to sort the array.
	// You can use display.updateDisplay() to show the current
	// progress on the graph.

	@Override
	void sort(int[] array, SortingVisualizer display) {

		int intHolder;

		for (int a = 0; a < (array.length); a++) {

			for (int i = 0; i < (array.length - 1); i++) {

				if (array[i + 1] < array[i]) {
					intHolder = array[i];
					array[i] = array[i + 1];
					array[i + 1] = intHolder;

					display.updateDisplay();

				}

			}
		}
	}

}
