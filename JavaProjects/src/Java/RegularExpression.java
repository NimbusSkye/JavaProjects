package Java;
import java.util.Arrays;
public class RegularExpression {
	public static void main(String[] args) {
		String first = "(514)-555-2324";
		String second = "345 435 6666";
		String third = " (111)-222-3333";
		String fourth = " 243  123 3413";
		String[] numbers = {first, second, third, fourth};
		System.out.println(Arrays.toString(numbers));
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = numbers[i].replaceAll("\\D", " ");
			numbers[i] = numbers[i].trim();
			numbers[i] = numbers[i].replaceAll("  ", "-");
			numbers[i] = numbers[i].replaceAll(" ", "-");
		}
		System.out.println(Arrays.toString(numbers));
		}
	}