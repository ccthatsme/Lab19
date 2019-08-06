package co.grandcircus;

import java.util.Arrays;
import java.util.HashMap;

public class Lab19 {

	public static void main(String[] args) {

		int[] sample = { 1, 2, 3, 2, 2, 4, 5, 5, 7, 8, 4, 4, 1, 0, 10 };
		Arrays.sort(sample);
		HashMap<Integer, Integer> freq = new HashMap<Integer, Integer>();


		int[] table = new int[11];


		int max = findMax(sample);


		for (int y = 0; y <= max; y++) {
			int count = 0;
			for (int i = 0; i < sample.length; i++) {
				if (sample[i] == y) {
					count++;
					freq.put(y, count);

				}
			}

		}


//		for (int i = 0; i < sample.length; i++) {
//			for (int y = 0; y <= max; y++) {
//				if (sample[i] == y) {
//					count++;
//
//				}
//				freq.put(y, count++);
//			}
//
//
//		}

		System.out.println(freq);


	}

	public static int findMax(int[] x) {
		int y = 0;
		for (int i = 0; i < x.length; i++) {
			if (x[i] > y) {
				y = x[i];
			}

		}

		return y;
	}

}
