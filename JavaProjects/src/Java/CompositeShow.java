package Java;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class CompositeShow implements Show {
    private ArrayList<Show> shows = new ArrayList<>();
    public CompositeShow (List<Show> shows) {
        this.shows.addAll(shows);
    }

    @Override
    public int runningTime () {
        int r=0;
        for (Show s: shows)
            r+=s.runningTime();
        return r;
    }

    @Override
    public String description() {
        StringJoiner description = new StringJoiner("; ", "[", "]");
        for( Show show : shows )
        {
            description.add(show.description());
        }
        return description.toString();
    }

    @Override
    public Show copy() {
        ArrayList<Show> list = new ArrayList<>();
        for (Show s: shows)
            list.add(s);
        return new CompositeShow(list);
    }

    public static void main (String args[]) {
        Movie m1 = new Movie("Fantasy Kaleidoscope", 2019, 60);
        Movie m2 = new Movie("Garbage", 2000, 0xabc);
        Concert c = new Concert("Boring", "Ingrid", 0x123);
        ArrayList<Show> l = new ArrayList<>();
        l.add(m1);
        l.add(m2);
        l.add(c);
        CompositeShow cs = new CompositeShow(l);
        System.out.println(cs.description());
    }
}
