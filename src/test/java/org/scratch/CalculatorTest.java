package org.scratch;

/**
 * Created by Charles.Wang on 23/06/2015.
 */
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.scratch.calc.Calculator;

public class CalculatorTest {
    @Test
    public void evaluatesExpression() {
        Calculator calculator = new Calculator();
        int sum = calculator.evaluate("1+2+3");
        assertEquals(6, sum);
    }
}