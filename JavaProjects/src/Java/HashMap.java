package Java;
import java.util.Arrays;
public class HashMap {
	private Integer[][] array;
	private int divisor;
		
	public HashMap (int divisor) {
		array = new Integer[divisor][];
		this.divisor = divisor;
	}
	
	public void add (int x) {
		int hashcode = x % divisor;
		int iterator = 0;
		if (array[hashcode] == null)
			array[hashcode] = new Integer [10];
		try {
			while (array[hashcode][iterator] != null) 
				iterator++;
			array[hashcode][iterator] = x;
		}
		catch (ArrayIndexOutOfBoundsException e) {
			Integer[] newarray = new Integer [(int) (array[hashcode].length * 1.5)];
			int i;
			for (i = 0; i < array[hashcode].length; i++)
				newarray[i] = array[hashcode][i];
			newarray[i] = x;
			array[hashcode] = newarray;
		}
	}
	
	public String toString () {
		return Arrays.deepToString(array);
	}
	
	public void print () {
		int iterator = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == null)
				continue;
			System.out.print("[");
			while (iterator < array[i].length && array[i][iterator] != null) {
				if (iterator + 1 >= array[i].length || array[i][iterator + 1] == null)
					System.out.print(array[i][iterator]);
				else
					System.out.print(array[i][iterator] + ", ");
				iterator++;
			}
			System.out.println ("]");
			iterator = 0;
		}
	}
}

