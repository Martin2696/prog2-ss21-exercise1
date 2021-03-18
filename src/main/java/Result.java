import java.util.ArrayList;
import java.util.List;

public class Result {


    public static List<Integer> gradingStudents(List<Integer> grades) {

        List<Integer> studentGrades = new ArrayList<>(grades);

        if (grades.get(0) < 1 || grades.get(0) > 60) {
            return new ArrayList<>();
        }

        for (int i = 1; i <= grades.get(0); i++) {
            if (grades.get(i) > 100 || grades.get(i) < 1) {
                studentGrades.set(i, 0);

            } else if(grades.get(i) >= 38 && grades.get(i) % 5 >= 3 && grades.get(i) % 10 >= 3) {

                studentGrades.set(i, grades.get(i) + 5 - grades.get(i) % 5);
            }
        }
        return studentGrades;
    }
}
