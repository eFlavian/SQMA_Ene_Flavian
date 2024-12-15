import ase.hw.sqma.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest2 {

    @Test
    public void testSubtraction() {
        Calculator calc = new Calculator();
        int result = calc.subtract(10, 5);
        assertEquals(5, result);
    }
}
