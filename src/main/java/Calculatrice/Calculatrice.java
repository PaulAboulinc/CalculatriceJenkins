package Calculatrice;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Calculatrice {
    private Calculatrice() {
    }

    public static String calculate(String calculationString) throws ScriptException {
        ScriptEngineManager script = new ScriptEngineManager();
        ScriptEngine eng = script.getEngineByName("JavaScript");

        return eng.eval(calculationString).toString();
    }
}
