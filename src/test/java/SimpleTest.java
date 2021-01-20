import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import javax.script.ScriptException;

public class SimpleTest {

    @Test
    public void simpleTestAddSuccess() throws ScriptException {
        assertEquals("5", Calculatrice.calculate("2+3"));
    }

    @Test
    public void simpleTestMulSuccess() throws ScriptException {
        int a = 1;
        int b = 2;
        assertEquals("40", Calculatrice.calculate("5*8"));
    }

    @Test
    public void simpleTestDivSuccess() throws ScriptException {
        int a = 1;
        int b = 2;
        assertEquals("50", Calculatrice.calculate("10/2"));
    }
}
