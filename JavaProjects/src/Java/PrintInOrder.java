package Java;
import java.util.HashMap;
import java.util.Arrays;
import java.util.Collections;
public class PrintInOrder {

	public static void main(String[] args) {
		HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
		hashmap.put(123, "sus bro");
		hashmap.put(1223, "stuff man");
		printElements(hashmap);

	}
	
	public static void printElements (HashMap<Integer, String> hashmap) {
		Integer[] array = new Integer [hashmap.keySet().size()];
		int j = 0;
		for (Integer i : hashmap.keySet()) {
			array[j] = i;
			j++;
		}
		Arrays.sort(array, Collections.reverseOrder());
		for (Integer i : array) 
			System.out.println (hashmap.get(i) + " " + i);
	}

}
