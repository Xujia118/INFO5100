import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PopulateStudents {3

    public static List<Students> create_session(List<String> studentList) {

        // Create a list of student objects. Type [name, [...quiz_scores...], [...exam_scores...]]
        List<Students> students = new ArrayList<>();

        // Instantiate 10 full-time students
        for (int i = 0; i < 10; i++) {
            String name = studentList.get(i);
            int[] quiz_score = generate_list_of_random_cores(15);
            int[] exam_score = generate_list_of_random_cores(2);
            FullTimeStudents student = new FullTimeStudents(name, quiz_score, exam_score);
            students.add(student);
        }

        // Instantiate 10 part-time students
        for (int i = 10; i < 20; i++) {
            String name = studentList.get(i);
            int[] quiz_score = generate_list_of_random_cores(15);
            PartTimeStudents student = new PartTimeStudents(name, quiz_score);
            students.add(student);
        }

        return students;
    }

    private static int[] generate_list_of_random_cores(int num) {
        int[] scores = new int[num];
        for (int i = 0; i < num; i++) {
            scores[i] = new Random().nextInt(60, 100);
        }
        return scores;
    }
}
