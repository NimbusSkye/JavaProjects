package Java;

public class FloorCeil {
	public static double function (double x) {
		System.out.println ("The floor of "+x/2+" is "+Math.floor(x/2)+" and the ceiling is "+Math.ceil(x/2));
		return Math.floor(x/2) + Math.ceil(x/2);
	}
	
	public static void main (String[] args) {
		for (double i = 2; i < 10; i++)
			System.out.println (function(i));
	}

}
