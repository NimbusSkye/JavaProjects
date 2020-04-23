import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Stack;

import static org.junit.Assert.assertSame;

public class TestStack {
    private final Stack<String> stack = new Stack<>();
    private String a = "s";
    private String s = "foo";
    @BeforeEach
    void init () {
        stack.clear();
    }
    @Test
    void testAddEmpty () {
        stack.push(s);
        assertSame(stack.peek(), s);
    }
    @Test
    void testAddNothing () {
        assertSame(stack.push(null), null);
        assertSame(stack.peek(), null);
    }
    @Test
    void testAddNotEmpty () {
        stack.push(a);
        stack.push(s);
        assertSame(stack.peek(), s);
    }

}
