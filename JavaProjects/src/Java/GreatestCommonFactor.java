package Java;

public class GreatestCommonFactor {

	public static void main(String[] args) {
		System.out.print(GCF(8, 26));

	}
	
	public static int GCF (int x, int y) {
		while (x != y) {
			if (x > y)
				x -= y;
			else
				y -= x;
		}
		return x;
		}
		
}
