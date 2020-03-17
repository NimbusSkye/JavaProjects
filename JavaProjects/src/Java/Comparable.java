import java.util.ArrayList;
import java.util.Collections;
public class Main {
	public static void main(String[] args) {
		Card c1 = new Card (5, 'r');
		Card c2 = new Card (1, 'f');
		ArrayList<Card> list = new ArrayList<>();
		list.add(c1);
		list.add(c2);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}
}

class Card implements Comparable<Card> {
    @Override
    public String toString () {
        return color + " " + value;
    }
    private int value;
    private char color;
    public Card (int value, char color) {
        this.value=value;
        this.color=color;
    }
    public int compareTo (Card c) {
        return Integer.compare(value, c.value);
    }
}