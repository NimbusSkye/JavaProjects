package Java;

public class Node {
	private int content;
	private Node next;
	private Node previous;
	public Node (int content) {
		this.content = content;
	}
	
	public void setNext (Node next) {
		this.next = next;
	}
	
	public String toString () {
		return Integer.toString(content);
	}
	
	public Node getNext () {
		return next;
	}
	
	public void setPrevious (Node previous) {
		this.previous = previous;
	}
	
	public Node getPrevious () {
		return this.previous;
	}
	
	public int getContent () {
		return content;
	}
	
	public void setContent (int x) {
		content = x;
	}
	
	public boolean compare (Node key) {
		return content == key.content;
	}
	
}
