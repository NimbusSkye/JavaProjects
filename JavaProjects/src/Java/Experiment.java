package Java;
import java.util.HashMap;
public class Experiment {

	public static void main(String[] args) {
		HashMap<String, String> hashmap = new HashMap <String, String> ();
		hashmap.put("123", "Code");
		hashmap.put("456", "Program");
		hashmap.remove("123");
		for (String key: hashmap.keySet())
			System.out.println (key + " " + hashmap.get(key));

	}

}
