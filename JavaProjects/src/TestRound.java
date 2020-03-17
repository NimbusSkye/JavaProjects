import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRound {
    LinkedList<Double> list;
    @BeforeEach
    void initialize () {
        list = new LinkedList<>();
    }
    @Test
    void roundUpPositive () {
        double d = 1;
        while (d<50) {
            d+=0.6;
            list.add(d);
            d+=0.4;
        }
        System.out.println(list);
        for (double n: list)
            assertEquals(Math.round(n), n+0.4);
    }
}
