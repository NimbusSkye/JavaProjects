package tutorial;
import java.util.Scanner;
public class Introduction {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println ("Type something");
		String x = s.next();
		System.out.print(x);
		s.close();
	}

}
