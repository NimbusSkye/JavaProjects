package Java;
import java.util.Arrays;
public class LinearProbing {
	private Integer[] array;
	
	public LinearProbing () {
		array = new Integer [10];
	}

	public void insert (int x) {
		int hashcode = x % 10;
		while (array[hashcode % 10] != null)
			hashcode++;
		array[hashcode % 10] = x;
	}
	
	public void print () {
		System.out.println (Arrays.toString(array));
	}
}
