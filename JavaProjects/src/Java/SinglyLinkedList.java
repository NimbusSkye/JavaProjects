package Java;

import java.util.Iterator;

public class SinglyLinkedList implements Iterable<Node> {
	private Node header;
	private Node tail;
	private int index = 0;
	
	public SLLIterator iterator() {
		return new SLLIterator(this);
	}
	private class SLLIterator implements Iterator<Node>{
		Node current;
		SLLIterator (SinglyLinkedList list) {
			current = header.getNext();
		}
		public boolean hasNext () {
			return (current != null);
		}
		public Node next () {
			Node temp = current;
			current = current.getNext();
			return temp;
		}
	}
	
	public SinglyLinkedList () {
		header = new Node (0);
		tail = header;
	}
	
	public int length () {
		return index;
	}
	
	public void add (int x) {
		Node tobeadded = new Node (x);
		if (index == 0) {
			header.setNext(tobeadded);
			tail = tobeadded;
			index++;
			return;
	}
		//Node end = header;
		//while (end.getNext() != null) 
			//end = end.getNext();
		//end.setNext(tobeadded);
		tail.setNext(tobeadded);
		tail = tail.getNext();
		index++;
	}
	
	public void add (int x, int position) {
		if (position > index + 1 || position < 0)
			throw new IllegalArgumentException("Your index is out of bounds.");
		if (position == index + 1) {
			add(x);
			return;
		}
		Node tobeadded = new Node (x);
		Node iterate = header;
		for (int i = 0; i < position; i++)
			iterate = iterate.getNext();
		tobeadded.setNext(iterate.getNext());
		iterate.setNext(tobeadded);
		index++;
		//System.out.println ("You added " + x + " to position " + position);
	}
	
	public Node get (int position) {
		if (position < 0)
			throw new IllegalArgumentException ("Your index is out of bounds.");
		int count = 0;
		Node key = header.getNext();
		while (count != position) {
			count++;
			key = key.getNext();
	}
		return key;
	}
	
	public void remove (int position) {
		if (position == 0) {
			header.setNext(header.getNext().getNext());
			index--;
			return;
		}
		if (position > index - 1)
			throw new IllegalArgumentException("Your index is out of bounds.");
		Node before = get(position - 1);
		Node after = before.getNext().getNext();
		before.setNext(after);
		index--;
	}
	
	public void remove (Node delete) {
		int position = getIndex (delete);
		remove(position);
	}
	
	public void removeFirst () {
		header.setNext(header.getNext().getNext());
		index--;
	}
	
	public void removeLast () {
		get(index - 2).setNext(null);
		index--;
	}
	
	public void addLast (int x) {
		tail.setNext(new Node (x));
		index++;
	}
	
	public void addFirst (int x) {
		Node first = new Node (x);
		first.setNext(header.getNext());
		header.setNext(first);
		index++;
	}
	
	public int getValue (int position) {
		return get(position).getContent();
	}
	
	public int getIndex (Node key) {
		int count = 0;
		Node iterate = header.getNext();
		try {
		while (!iterate.compare(key)) {
			count++;
			iterate = iterate.getNext();
		}
		}
		catch (NullPointerException e) {
			System.out.println ("The list does not contain " + key.getContent() + ".");
			return -1;
		}
		return count;
	}
	
	public int getIndex (int value) {
		Node key = new Node (value);
		return getIndex(key);
	}
	
	public void setValue (int value, int position) {
		Node key = get(position);
		key.setContent(value);
	}
	
	public void clear () {
		header.setNext(null);
		System.out.println ("The list is now cleared.");
		index = 0;
	}
	
	public double average () {
		int sum = 0;
		Node iterate = header.getNext();
		for (int i = 0; i < index; i++) {
			sum = sum + iterate.getContent();
			iterate = iterate.getNext();
	}
		return (double)sum / index;
	}
	
	public void print () {
		int position = 0;
		if (header.getNext() == null) {
			System.out.println ("The list is empty.");
			return;
		}
		Node iterate = header.getNext();
		System.out.println ("Here are the contents of this list:");
		while (position < index) {
			System.out.print (iterate.getContent() + " ");
			iterate = iterate.getNext();
			position++;
		}
		System.out.println ();
	}
	
	public static void main(String[] args) {
		
	}

}
