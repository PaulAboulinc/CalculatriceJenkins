import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import calculatrice.Calculatrice;
import org.junit.Test;

import javax.script.ScriptException;

public class CalculatriceTest {

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
        assertEquals("5", Calculatrice.calculate("10/2"));
    }
}
