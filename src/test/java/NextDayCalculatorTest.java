import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;

public class NextDayCalculatorTest {
    @Test
    @DisplayName("Testing with value: 1-1-2018")
    public  void nextDayWithDay1() {
        int[] arr = {1, 1, 2018};
        int[] expect = {2, 1, 2018};
        int[] actual = NextDayCalculator.nextDay(arr);
        assertArrayEquals(expect, actual);
    }


}
