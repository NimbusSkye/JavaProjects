package Java;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCeil {
    ArrayList<Double> list;
    @BeforeEach
    void initialize () {
        list = new ArrayList<>();
    }
    @Test
    void positive () {
        double d = 0;
        while (d <=500) {
            d += 0.6;
            list.add(d);
            d += 0.4;
        }
        for (double f : list)
            assertEquals(Math.ceil(f), (f+0.4));
    }
    @Test
    void negative () {
        double d = -1;
        while (d>=-50) {
            d -= 0.6;
            list.add(d);
            d -= 0.4;
        }
        for (double f : list)
            assertEquals(Math.ceil(f), (f+0.6));
    }
}
