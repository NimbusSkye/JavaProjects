package rpg;
import java.util.Scanner;
public class calculator {
public static void main (String args[]) {
	Scanner s = new Scanner (System.in);
	System.out.println("Enter the first number");
	int x = s.nextInt();
	System.out.println("Enter the operator");
	String z = s.next();
	System.out.println("Enter the second number");
	int y = s.nextInt();
	switch (z) {
	case "+":
		System.out.println (x+y);
		break;
	case "-":
		System.out.println (x-y);
		break;
	case "*":
		System.out.println (x*y);
		break;
	case "/":
		System.out.println (x/y);
		break;
	case "%":
		System.out.println(x%y);
		break;
	}
	s.close();
	}
	}
