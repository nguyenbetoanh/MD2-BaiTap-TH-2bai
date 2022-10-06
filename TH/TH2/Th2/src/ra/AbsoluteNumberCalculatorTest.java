package ra;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AbsoluteNumberCalculatorTest {
    @Test
    @DisplayName("number")
    void testFindAbsolute1() {
        int number = 1;
        int expect =1;

        int result =AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expect,result);
    }
    @Test
    @DisplayName("number")
    void testFindAbsolute2() {
        int number = 1;
        int expect =15;

        int result =AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expect,result);
    }

}
