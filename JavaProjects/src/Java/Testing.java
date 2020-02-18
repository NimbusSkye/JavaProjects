package Java;
//import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.LinkedList;
public class Testing {

	public static void main (String[] args) {
		System.out.println ("Which program would you like to test today?");
		Scanner s = new Scanner (System.in);
		if (s.next().equals("mergesort"))
			testMergeSort();
		if (s.next().equals("customstack"))
			testCustomStack();
		s.close();
	}
	public static void testMergeSort () {
		Random rng = new Random ();
		LinkedList<Integer> list = new LinkedList<Integer>();
		for (int i = 0; i < 15; i++)
			list.add(rng.nextInt(20));
		System.out.println (list);
		System.out.println (MergeSort.mergeSort(list));
	}
	
	public static void testCustomStack () {
		CustomStack stack = new CustomStack();
		System.out.println ("Adding numbers to the back: 1, 2, 3, 4, 5");
		for (Integer i = 1; i <= 5; i++)
			stack.addToBack(i.toString());
		System.out.println ("Here is the result");
		
	}

}
