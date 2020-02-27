import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class Main {
	public static void main(String[] args) {
		Card c1 = new Card (5, 'a');
		Card c2 = new Card (2, 'b');
		Card c3 = new Card (2, 'c');
		ArrayList<Card> list = new ArrayList<>();
		list.add(c1);
		list.add(c2);
		list.add(c3);
		System.out.println(list);
		Collections.sort(list, new Custom());
		System.out.println(list);
	}
}

class Card {
    @Override
    public String toString () {
        return color + " " + value;
    }
    private int value;
    private char color;
    public int getValue () {
        return value;
    }
    public char getColor () {
        return color;
    }
    public Card (int value, char color) {
        this.value=value;
        this.color=color;
    }
}
class Custom implements Comparator<Card> {
        public int compare (Card a, Card b) {
            if (Integer.compare(a.getValue(), b.getValue()) == 0) {
                return Integer.compare(a.getColor(), b.getColor());
            }
            return Integer.compare(a.getValue(), b.getValue());
        }
    }