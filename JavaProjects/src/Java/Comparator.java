import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class Main {
	public static void main(String[] args) {
		Card c1 = new Card (5, 'a');
		Card c2 = new Card (1, 'b');
		ArrayList<Card> list = new ArrayList<>();
		list.add(c1);
		list.add(c2);
		System.out.println(list);
		ColorComparator c = new ColorComparator();
		Collections.sort(list, c);
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
class ColorComparator implements Comparator<Card> {
        public int compare (Card a, Card b) {
            return Integer.compare(a.getColor(), b.getColor());
        }
    }