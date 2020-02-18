package Java;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class Recursion {

	public static void main(String[] args) {
		Random rng = new Random ();
		Scanner s = new Scanner (System.in);
		int[] arr = new int [10];
		for (int i = 0; i < 10; i++)
			arr[i] = rng.nextInt(10);
		Arrays.sort(arr);
		System.out.println (Arrays.toString(arr));
		System.out.println ("Enter the number that you wish to search for.");
		int x = s.nextInt();
		System.out.println ("The index of " + x + " is " + bsearch_recursive(arr, x) + ".");
		s.close();
		
	}
	
	public static int bsearch_recursive(int arr[], int low, int high, int key){
        int mid = (low + high) / 2;
        if (low > high)
        	return -1;
        if (arr[mid] == key)
        	return mid;
        else if (arr[mid] > key) 
        	high = mid - 1;
        else
        	low = mid + 1;
        return bsearch_recursive(arr, low, high, key);
        
	}
	
	public static int bsearch_recursive (int[] arr, int key) {
		return bsearch_recursive (arr, 0, arr.length - 1, key);
	}

}
