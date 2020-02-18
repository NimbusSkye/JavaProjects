package Java;
import java.util.Arrays;
import java.util.Random;

public class Test {

	public static void main(String[] args) {
		Random rng = new Random ();
		Integer[] array = new Integer [7];
		for (int i = 1; i < array.length; i++) 
			array[i] = rng.nextInt(10);
		System.out.println (Arrays.toString(array));
		CustomHeap heap = new CustomHeap (array);
		System.out.println (heap);
		System.out.println ("The minimum value in this heap is " + heap.findMin());

	}
}
