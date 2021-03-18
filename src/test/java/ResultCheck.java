import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * GitHub URL: https://github.com/Martin2696/prog2-ss21-exercise1.git
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
    @DisplayName("test 1 - is the list empty?")
    public void testGradingStudents_EmptyList() {
        List<Integer> grades = new ArrayList<>();
        List<Integer> expected = new ArrayList<>();

        assertEquals(expected, grades);
    }

    @Test
    @DisplayName("test 2 - are there more than 60 students in the list")
    public void testGradingStudents_ListOfMoreThan_60_Students() {
        List<Integer> grades = Result.gradingStudents(Arrays.asList(65, 2, 4, 6, 8, 10, 40, 42, 44, 46, 48, 50, 71, 73, 75, 77, 79, 81, 82, 83,
                84, 85, 86, 87, 88, 89, 90, 45, 54, 66, 55, 44, 33, 22, 11, 1, 37, 38, 39, 40, 67, 97, 98, 91, 91, 75, 85,
                84, 83, 82, 67, 34, 81, 41, 68, 69, 94, 91, 87, 46, 87, 20, 98, 99 , 42, 100));
        List<Integer> expected = new ArrayList<>();

        assertEquals(expected, grades);
    }

    @Test
    @DisplayName("test 3 - is the number of students negative?")
    public void testGradingStudents_NegativeNumberOfStudents() {
        List<Integer> grades = Result.gradingStudents(Arrays.asList(-1, 37, 38));
        List<Integer> expected = new ArrayList<>();

        assertEquals(expected, grades);
    }

    @Test
    @DisplayName("test 4 - are the grades being round up?")
    public void testGradingStudents_RoundingUp() {
        List<Integer> grades = Result.gradingStudents(Arrays.asList(5, 74, 68, 98, 38, 59));
        List<Integer> expected = Arrays.asList(5, 75, 70, 100, 40, 60);

        assertTrue(expected.size() == grades.size()
                && expected.containsAll(grades)
                && grades.containsAll(expected));
    }

    @Test
    @DisplayName("test 5 - are the points passed trouble-free?")
    public void testGradingStudents_NothingUnusual() {
        List<Integer> grades = Result.gradingStudents(Arrays.asList(5, 62, 72, 81, 97, 42));
        List<Integer> expected = Arrays.asList(5, 62, 72, 81, 97, 42);

        assertTrue(expected.size() == grades.size()
                && expected.containsAll(grades)
                && grades.containsAll(expected));
    }

    @Test
    @DisplayName("test 6 - is the line for negative grade rounding up properly?")
    public void testGradingStudents_NegativeGradeTest() {
        List<Integer> grades = Result.gradingStudents(Arrays.asList(4, 36, 37, 38, 39));
        List<Integer> expected = Arrays.asList(4, 36, 37, 40, 40);

        assertTrue(expected.size() == grades.size()
                && expected.containsAll(grades)
                && grades.containsAll(expected));
    }

    @Test
    @DisplayName("test 7 - does only one student in the list work?")
    public void testGradingStudents_OnlyOneStudent() {
        List<Integer> grades = Result.gradingStudents(Arrays.asList(1, 99));
        List<Integer> expected = Arrays.asList(1, 100);

        assertTrue(expected.size() == grades.size()
                && expected.containsAll(grades)
                && grades.containsAll(expected));
    }

    @Test
    @DisplayName("test 8 - did somebody score more than 100?")
    public void testGradingStudents_MoreThan_100_Points() {
        List<Integer> grades = Result.gradingStudents(Arrays.asList(1, 1800));
        List<Integer> expected = Arrays.asList(1, 0);

        assertTrue(expected.size() == grades.size()
                && expected.containsAll(grades)
                && grades.containsAll(expected));
    }

    @Test
    @DisplayName("test 9 - did more students score more than 100?")
    public void testGradingStudents_MoreStudentsMoreThan_100_Points() {
        List<Integer> grades = Result.gradingStudents(Arrays.asList(4, 111, 112, 101, 102));
        List<Integer> expected = Arrays.asList(4, 0, 0, 0 ,0);

        assertTrue(expected.size() == grades.size()
                && expected.containsAll(grades)
                && grades.containsAll(expected));
    }

    @Test
    @DisplayName("test 10 - somebody got less than 0 points?")
    public void testGradingStudents_NegativePoints() {
        List<Integer> grades = Result.gradingStudents(Arrays.asList(2, -5, -97));
        List<Integer> expected = Arrays.asList(2, 0, 0);

        assertTrue(expected.size() == grades.size()
                && expected.containsAll(grades)
                && grades.containsAll(expected));
    }
}
