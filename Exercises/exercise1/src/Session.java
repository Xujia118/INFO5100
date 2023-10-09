import java.util.*;

public class Session {
    Students[] session = new Students[20];

    public static List<List<Object>> get_average_score_per_student(List<Students> students) {
        List<List<Object>> result = new ArrayList<>();

        for (Students student : students) {
            List<Object> student_quiz = new ArrayList<>();

            Double average_quiz_score = Arrays.stream(student.quiz_score).average().getAsDouble();
            student_quiz.add(student.name);
            student_quiz.add(average_quiz_score);
            result.add(student_quiz);
        }

        return result;
    }

    public static List<List<Object>> sort_quiz_scores(List<Students> students) {
        List<List<Object>> quiz_scores = get_average_score_per_student(students);
        Collections.sort(quiz_scores, Comparator.comparingDouble(student -> (double) student.get(1)));
        return quiz_scores;
    }

    public static void print_part_time_students(List<Students> students) {
        for (Students student: students) {
            if (student instanceof PartTimeStudents) {
                System.out.println(student.name);
            }
        }
    }

    public static void get_exam_scores(List<Students> students) {
        for (Students student: students) {
            if (student instanceof FullTimeStudents) {
                System.out.println(student.name);
                System.out.println(Arrays.toString(student.exam_score));
            }
        }
    }

}
