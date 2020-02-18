package Java;

import java.util.Arrays;

public class Problem {

	public static void main(String[] args) {
		int[] arr = {5, 4, 7, 5, 9, 10, 5, 6, 8, 7, 7, 5, 5, 5, 1, 4, 5, 9, 4, 3, 4, 1, 9, 9, 7, 6, 4, 1, 1, 4, 1, 2, 1, 7, 2, 1, 10, 1, 1, 4, 6, 4, 3, 4, 10, 10, 7, 7, 4, 9, 4, 7, 6, 1, 7, 7, 8, 5, 1, 9, 10, 7, 6, 3, 3, 8, 5, 4, 6, 9, 5, 10, 4, 8, 8, 6, 1, 7, 2, 7, 1, 9, 1, 10, 5, 8, 2, 5, 9, 5, 3, 8, 6, 4, 3, 4, 9, 5, 3, 2};
		int[] counter = new int [11];
		for (int i = 0; i < arr.length; i++) 
			counter[arr[i]]++;
		System.out.println (Arrays.toString(counter));

	}

}
