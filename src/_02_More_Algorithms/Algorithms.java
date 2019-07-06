package _02_More_Algorithms;

import java.util.Arrays;
import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {

		for (int i = 0; i < eggs.size(); i++) {
			if (eggs.get(i).equals("cracked")) {
				return i;
			}
		}

		return -1;
	}

	public static int countPearls(List<Boolean> oysters) {

		int pearlCount = 0;

		for (int i = 0; i < oysters.size(); i++) {

			if (oysters.get(i)) {
				pearlCount++;
			}
		}

		return pearlCount;
	}

	public static double findTallest(List<Double> people) {

		double largest = 0;

		for (int i = 0; i < people.size(); i++) {

			if (people.get(i) > largest) {
				largest = people.get(i);
			}

		}

		return largest;
	}

	public static String findLongestWord(List<String> words) {

		String longestWord = "a";

		for (int i = 0; i < words.size(); i++) {

			if (words.get(i).length() > longestWord.length()) {
				longestWord = words.get(i);
			}

		}

		return longestWord;

	}

	public static boolean containsSOS(List<String> msg) {

		for (int i = 0; i < msg.size(); i++) {

			if (msg.get(i).equals(" ... --- ... ")) {
				return true;
			}

		}

		return false;
	}

	public static List<Double> sortScores(List<Double> scores) {

		Double[] scoresArray = new Double[scores.size()];

		for (int i = 0; i < scores.size(); i++) {
			scoresArray[i] = scores.get(i);
		}

		for (int i = 0; i < scoresArray.length; i++) {

			for (int j = 0; j < scoresArray.length - 1; j++) {

				if (scoresArray[j] > scoresArray[j + 1]) {

					double intHolder;
					intHolder = scoresArray[j];
					scoresArray[j] = scoresArray[j + 1];
					scoresArray[j + 1] = intHolder;

				}

			}

		}

		List<Double> newScores = Arrays.asList(scoresArray);

		return newScores;
	}

	public static List<String> sortDNA(List<String> sequence) {

		String[] sequenceArray = new String[sequence.size()];

		for (int i = 0; i < sequenceArray.length; i++) {

			sequenceArray[i] = sequence.get(i);

		}

		for (int i = 0; i < sequenceArray.length; i++) {

			for (int j = 0; j < sequenceArray.length - 1; j++) {

				if (sequenceArray[j].length() > sequenceArray[j + 1].length()) {

					String stringHolder;
					stringHolder = sequenceArray[j];
					sequenceArray[j] = sequenceArray[j + 1];
					sequenceArray[j + 1] = stringHolder;

				}
			}
		}

		List<String> sequenceNew = Arrays.asList(sequenceArray);

		return sequenceNew;

	}

	public static List<String> sortWords(List<String> words) {

		String[] wordsArray = new String[words.size()];

		for (int i = 0; i < wordsArray.length; i++) {

			wordsArray[i] = words.get(i);

		}

		for (int i = 0; i < wordsArray.length; i++) {

			for (int j = 0; j < wordsArray.length - 1; j++) {

				if (wordsArray[j].compareTo(wordsArray[j + 1]) > 0) {

					String stringHolder;
					stringHolder = wordsArray[j];
					wordsArray[j] = wordsArray[j + 1];
					wordsArray[j + 1] = stringHolder;

				}

			}

		}
		
		List<String> wordsNew = Arrays.asList(wordsArray);

		return wordsNew;

	}

}
