package Java;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMin {
    @Test
    void testMin () {
        for (int i=-1000; i<=1000; i++)
            assertEquals(Math.min(i, i + 1), i);
    }

}
