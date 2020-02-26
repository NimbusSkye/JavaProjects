package Java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

public class TestStrCat {
    public static final String empty = "";
    public static final String notempty = "abc";
    @Test
    void empty () {
        assertSame(empty.concat(""), empty);
    }
    @Test
    void Notempty () {
        assertEquals(empty.concat(notempty), "abc");
    }
    @Test
    void lol () {
        assertEquals(notempty.concat(notempty), "abcabc");
    }
}
