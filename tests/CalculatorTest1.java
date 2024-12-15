import ase.hw.sqma.Calculator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest1 {

    @Test
    public void testAddition() {
        Calculator calc = new Calculator();
        int result = calc.add(2, 3);
        assertEquals(5, result);
    }

}
