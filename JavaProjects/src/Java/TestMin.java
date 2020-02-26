package Java;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMin {
    @Test
    void testLessMore () {
        for (int i=Integer.MIN_VALUE; i<Integer.MAX_VALUE; i++)
            assertEquals(Math.min(i, i + 1), i);
    }

    @Test
    void testMoreLess () {
        for (int i=Integer.MIN_VALUE+1; i<Integer.MAX_VALUE; i++)
            assertEquals(Math.min(i-1, i), i-1);
    }

    @Test
    void testEqual () {
        for (int i=Integer.MIN_VALUE; i<Integer.MAX_VALUE; i++)
            assertEquals(Math.min(i, i), i);
    }

}
