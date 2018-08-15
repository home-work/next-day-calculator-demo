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
    @Test
    @DisplayName("Testing with value: 31-1-2018")
    public  void nextDayWithDay31Month1() {
        int[] arr = {31, 1, 2018};
        int[] expect = {1, 2, 2018};
        int[] actual = NextDayCalculator.nextDay(arr);
        assertArrayEquals(expect, actual);
    }
    @Test
    @DisplayName("Testing with value: 30-4-2018")
    public  void nextDayWithDay30Month4() {
        int[] arr = {30, 4, 2018};
        int[] expect = {1, 5, 2018};
        int[] actual = NextDayCalculator.nextDay(arr);
        assertArrayEquals(expect, actual);
    }
    @Test
    @DisplayName("Testing with value: 28-2-2018")
    public  void nextDayWithDay28Month2() {
        int[] arr = {28, 2, 2018};
        int[] expect = {1, 3, 2018};
        int[] actual = NextDayCalculator.nextDay(arr);
        assertArrayEquals(expect, actual);
    }
    @Test
    @DisplayName("Testing with value: 29-2-2020")
    public  void nextDayWithDay29Month2() {
        int[] arr = {29, 2, 2020};
        int[] expect = {1, 3, 2020};
        int[] actual = NextDayCalculator.nextDay(arr);
        assertArrayEquals(expect, actual);
    }


}
