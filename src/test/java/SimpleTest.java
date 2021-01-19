import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SimpleTest {

    @Test
    public void simpleTestSuccess() {
        int a = 1;
        int b = 2;
        assertEquals(a + b, 3);
    }

    @Test
    public void simpleTestFail() {
        int a = 1;
        int b = 2;
        assertEquals(a + b, 3);
    }
}
