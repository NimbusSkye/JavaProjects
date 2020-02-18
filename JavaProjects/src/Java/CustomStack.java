package Java;
import java.util.Stack;
public class CustomStack {
	private Stack<String> stack = new Stack<String>();
	private int size;
	
	public void addToFront (String s) {
		stack.push(s);
		size++;
	}
	
	public void addToBack (String string) {
		String[] temp = new String [size];
		int index = 0;
		while (!stack.isEmpty()) {
			temp[index] = stack.pop();
			index++;
		}
		stack.push(string);
		for (int i = temp.length -1; i >= 0; i--) 
			stack.push(temp[i]);
		size++;
	}
	
	public String removeFromFront () {
		size--;
		return stack.pop();
	}
	
	public String removeFromBack () {
		String[] temp = new String [size];
		for (int i = 0; i < size - 1; i++)
			temp[i] = stack.pop();
		String key = stack.pop();
		for (int i = size - 2; i >= 0; i--)
			stack.push(temp[i]);
		size--;
		return key;
	}
	
}
