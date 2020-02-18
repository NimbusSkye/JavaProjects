package Java;
import java.util.Queue;
import java.util.LinkedList;
public class TwoQueueStack {
	private Queue<String> firststack = new LinkedList<String>();
	private Queue<String> secondstack = new LinkedList<String>();
	private int size;
	
	public int length () {
		return size;
	}
	
	public void push (String s) {
		firststack.add(s);
		size++;
		secondstack.add(firststack.remove());
	}
	
	public String peek () {
		return secondstack.peek();
	}
	
	public String pop () {
		size--;
		return secondstack.remove();
	}
	
	public boolean empty () {
		return secondstack.isEmpty();
	}
	
	public int search (String s) {
		int position = 1;
		int index = 0;
		String[] temp = new String [size];
		boolean found = false;
		while (!secondstack.isEmpty()) {
			String b = secondstack.remove();
			temp[index] = b;
			index++;
			if (s.equals(b)) {
				found = true;
				break;
			}
			else
				position++;
		}
		while (!secondstack.isEmpty()) {
			String a = secondstack.remove();
			temp[index] = a;
			index++;
		}
		for (int i = temp.length - 1; i >= 0; i--) {
			secondstack.add(temp[i]);
		}
		if (found)
			return position;
		else
			return -1;
	}
}
