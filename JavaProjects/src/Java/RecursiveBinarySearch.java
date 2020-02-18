package Java;
import java.util.Arrays;
import java.util.Random;
public class RecursiveBinarySearch {

	public static void main(String[] args) {
		Random rng = new Random ();
		int[] x = new int [5];
		for (int i = 0; i < x.length; i++)
			x[i] = rng.nextInt(10) + 0;
		System.out.println(Arrays.toString(x));
		Arrays.sort(x);
		int y = 0;
		System.out.println(Arrays.toString(x));
		while (y <= 10) {
			System.out.println (y + " is in the array: " + contains(x, y));
			y++;
		}
	}

	public static boolean contains (int[] x, int y) {
		if (x.length == 1)
			return x[0] == y;
		int mid = x.length / 2;
		if (x[mid] == y)
			return true;
		else if (y > x[mid])
			return contains (Arrays.copyOfRange(x, mid, x.length), y);
		else
			return contains (Arrays.copyOfRange(x, 0, mid), y);
	}
	
	public static void swap (int[] array, int x, int y) {
		int temp = x;
		x = y;
		y = temp;
	}
}
