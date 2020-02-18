package calculator;
import java.util.Scanner;
public class Calculator {
	public static void main (String args[]) {
		Scanner s = new Scanner (System.in);
		System.out.print("Enter the first number: ");
		int value1 = s.nextInt();
		System.out.print("Enter the operator: ");
	    String operator = s.next();
	    System.out.print("Enter the second number: ");
	    int value2 = s.nextInt();
	      
	      System.out.println ("Input: "+value1+" "+operator+" "+value2);
	      s.close();
	      switch (operator) {
	        case "+":
	          System.out.println ((value1+value2));
	          break;
	        case "-":
	          System.out.println ((value1-value2));
	          break;
	        case "*":
		          System.out.println ((value1*value2));
		          break;
	        case "%":
		          System.out.println ((value1%value2));
		          break;
	        case "^":
	        	System.out.println (Math.pow((double) value1, (double)value2));
	        	break;
	        default:
	          System.out.println ("Error!");
	      }
	  }
	}
