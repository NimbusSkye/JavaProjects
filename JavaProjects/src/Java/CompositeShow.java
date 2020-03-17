package Java;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class CompositeShow {
    private List<Show> shows = new ArrayList<>();
    public CompositeShow (List<Show> l) {
        for (Show s : l)
            shows.add(s);
    }
    public String getDesc () {
        StringJoiner s = new StringJoiner("; ", "[", "]");
        for (Show show: shows)
            s.add(show.getName());
        return s.toString();
    }
    public int getLength () {
        int l=0;
        for (Show show: shows)
            l+=show.getLength();
        return l;
    }
    public static void main (String args[]) {
        Show s1 = new Show ("s", 1);
        Show s2 = new Show ("a", 2);
        List<Show> l = new ArrayList<>();
        l.add(s1);
        l.add(s2);
        CompositeShow cs = new CompositeShow(l);
        System.out.println(cs.getDesc());
        System.out.println(cs.getLength());
    }
}
