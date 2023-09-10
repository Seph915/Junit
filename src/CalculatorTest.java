import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void tenMinusFiveShouldEqualFive(){
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.subtraction(10,5));
    }

    @Test
    void twelveMinusThreeShouldEqualNine(){
        Calculator calculator = new Calculator();
        assertEquals(9, calculator.subtraction(12,3));
    }

    @Test
    void fourTimesEightShouldEqualThirtyTwo() {
        Calculator calculator = new Calculator();
        assertEquals(32, calculator.multiplication(4,8));
    }

    @Test
    void twoTimesZeroShouldEqualZero() {
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.multiplication(2,0));
    }
}
