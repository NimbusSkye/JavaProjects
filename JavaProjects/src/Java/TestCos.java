package Java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCos {
    @Test
    void testCos () {
        assertEquals(Math.cos(0), 1);
        assertEquals(Math.cos(Math.PI/4), Math.sqrt(2)/2);
        for (int i=0; i<Integer.MAX_VALUE; i+=2)
            assertEquals(Math.cos(Math.PI*i), 1);
        for (int i=1; i<50; i+=2)
            assertEquals(Math.cos(Math.PI/2*i), 0);
    }
}
