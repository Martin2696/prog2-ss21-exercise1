import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * GitHub URL: https://github.com/Martin2696/prog2-ss21-exercise1
 * Test class for testing the gradingStudents method in Result.java
 */

public class ResultCheck {

    @BeforeAll
    public static void before() {
        System.out.println("Testing");
    }

    @AfterAll
    public static void after() {
        System.out.println("Done with testing");
    }

    @Test
    @DisplayName("Test 1")
    void testResult1() {
        List<Integer> actual = new ArrayList<>(Arrays.asList(3, 38, 57, 69));
        List<Integer> expected = new ArrayList<>(Arrays.asList(3, 40, 57, 70));
        assertTrue(Arrays.equals(expected.toArray(), Result.gradingStudents(actual).toArray()), "Code doesn't work properly");
    }

    @Test
    @DisplayName("Test 2")
    void testResult2() {
        List<Integer> actual = new ArrayList<>(Arrays.asList(1, 48));
        List<Integer> expected = new ArrayList<>(Collections.singletonList(50));
        assertTrue(Arrays.equals(expected.toArray(), Result.gradingStudents(actual).toArray()), "Code doesn't work properly");
    }

    @Test
    @DisplayName("Test 3")
    void testResult3() {
        List<Integer> actual = new ArrayList<>(Arrays.asList(8, 99, 89, 78, 68, 67, 46, 39, 24));
        List<Integer> expected = new ArrayList<>(Arrays.asList(8, 100, 90, 80, 70, 67, 46, 40, 24));
        assertTrue(Arrays.equals(expected.toArray(), Result.gradingStudents(actual).toArray()), "Code doesn't work properly");
    }
}
