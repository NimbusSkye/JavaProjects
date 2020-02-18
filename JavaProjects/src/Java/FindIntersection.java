package Java;
import java.util.HashMap;
public class FindIntersection {
	private HashMap<Integer, String> hashmap = new HashMap<Integer, String> ();
	
	public void findCollisions (String[] s, String[] t) {
		String[] both = new String [s.length + t.length];
		for (int i = 0; i < s.length; i++)
			both[i] = s[i];
		for (int i = 0; i < t.length; i++) 
			both[i+s.length]= t[i];
		for (String x : both) {
			int y = x.hashCode();
			if (hashmap.get(y) != null)
				System.out.println (hashmap.get(y));
			hashmap.put(x.hashCode(), x);
		}
	}
	
	public static void main (String[] args) {
		String[] arr1 = {"Apple", "Orange", "Grape", "Banana", "Watermelon", "Peach"};
		String[] arr2 = {"Watermelon", "Pear", "Banana", "Peach", "Kiwi", "Melon"};
		FindIntersection yes = new FindIntersection ();
		yes.findCollisions (arr1, arr2);
	}
}
