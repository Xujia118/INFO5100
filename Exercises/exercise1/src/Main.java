import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Students> students = PopulateStudents.create_session(studentList);
        Session session = new Session();

        // Calculate average quiz score per student
        List<List<Object>> quiz_result = session.get_average_score_per_student(students);

        System.out.println("Average quiz score per student");
        for (List<Object> each_student: quiz_result) {
            String name = (String) each_student.get(0);
            Double score = (Double) each_student.get(1);

            System.out.println(name);
            System.out.printf("%.1f%n", score);
        }

        // Sort quiz score in ascending
        List<List<Object>> sorted_quiz_result = session.sort_quiz_scores(students);
        System.out.println("Average quiz score per student by ascending order");
        for (List<Object> each_student: sorted_quiz_result) {
            String name = (String) each_student.get(0);
            Double score = (Double) each_student.get(1);

            System.out.println(name);
            System.out.printf("%.1f%n", score);
        }

        // Print part-time students
        System.out.println("Printing part-time students");
        session.print_part_time_students(students);

        // Print exam scores of full time students
        System.out.println("Printing exam scores of full-time students");
        session.get_exam_scores(students);

    }

    private static List<String> studentList = new ArrayList<>();

    static {
        studentList.add("Alice");
        studentList.add("Bob");
        studentList.add("Charlie");
        studentList.add("David");
        studentList.add("Eva");
        studentList.add("Frank");
        studentList.add("Grace");
        studentList.add("Hannah");
        studentList.add("Isaac");
        studentList.add("Jane");
        studentList.add("Katherine");
        studentList.add("Liam");
        studentList.add("Mia");
        studentList.add("Noah");
        studentList.add("Olivia");
        studentList.add("Peter");
        studentList.add("Quinn");
        studentList.add("Rachel");
        studentList.add("Samuel");
        studentList.add("Taylor");
    }


}