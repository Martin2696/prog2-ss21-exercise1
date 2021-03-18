import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Result {

    public static List<Integer> gradingStudents(List<Integer> grades) {

        List<Integer> studentGrades = new ArrayList<>();

        for(int i = 0; i < grades.size(); i++) {

            if(grades.get(i) > 1 && grades.get(i) < 38 ) {
                studentGrades.add(grades.get(i));
            } else if (grades.get(i) < 100 && grades.get(i) >= 38) {
                int nextMultiple = 5 - (grades.get(i) % 5) + grades.get(i);
                if(nextMultiple - grades.get(i) < 3) {
                    studentGrades.add(nextMultiple);
                } else {
                    studentGrades.add(grades.get(i));
                }
            }
        }
        return studentGrades;
    }

    public static void main(String[] args) {

        int n;
        Scanner sc = new Scanner(System.in) ;

        System.out.println("Number of grades: ");
        n = sc.nextInt() ;
        List<Integer> grades = new ArrayList<>() ;

        for(int i=0; i < n; i++ )
        {
            int temp;
            System.out.println("Next Number: ");
            temp = sc.nextInt();
            grades.add(temp) ;
            if (grades.get(i) > 100  || grades.get(i) < 1) {
                grades.remove(i);
                i--;
            }
            System.out.println(gradingStudents(grades));
        }
        gradingStudents(grades);
    }
}
