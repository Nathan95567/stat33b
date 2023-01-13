package prereq_exam33b;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class preExam33bTest {

    @Test

    public void testExercise1() {
        assertEquals(273.15, preExam33b.exercise1(32),0.01);
        assertEquals(283.15, preExam33b.exercise1(50),0.01);
        assertEquals(293.15, preExam33b.exercise1(68),0.01);
    }

    @Test

    public void testExercise2_01() {
        List<Integer> actual = preExam33b.exercise2(10);
        List<Integer> expected = new ArrayList<>
                (Arrays.asList(1, 3, 6, 10, 15, 21, 28, 36, 45, 55));
        assertEquals(expected, actual);
    }

    @Test

    public void testExercise2_02() {
        List<Integer> actual = preExam33b.exercise2(20);
        List<Integer> expected = new ArrayList<>
                (Arrays.asList(1, 3, 6, 10, 15, 21, 28, 36, 45, 55, 66, 78, 91, 105, 120,136, 153, 171, 190, 210));
        assertEquals(expected, actual);
    }

    @Test

    public void testExercise2_03() {
        List<Integer> actual = preExam33b.exercise2(50);
        List<Integer> expected = new ArrayList<>
                (Arrays.asList( 1, 3, 6, 10, 15, 21, 28, 36, 45, 55, 66, 78, 91, 105, 120,136, 153, 171, 190, 210,
                        231, 253, 276, 300, 325, 351, 378, 406, 435, 465, 496, 528, 561, 595, 630, 666, 703, 741,
                        780, 820, 861, 903, 946, 990, 1035, 1081, 1128, 1176, 1225, 1275));
        assertEquals(expected, actual);
    }

    @Test

    public void testExercise3() {
        List<String> actual = preExam33b.exercise3(16);
        List<String> expected = new ArrayList<>
                (Arrays.asList("1", "2", "fizz", "4", "buzz", "fizz", "7", "8", "fizz", "buzz", "11", "fizz", "13", "14", "fizzbuz", "16"));
        assertEquals(expected, actual);
    }
}
