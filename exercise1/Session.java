import java.util.ArrayList;
import java.util.Collections;

class Session {
    ArrayList<Student> students;

    Session() {
        this.students = new ArrayList<>();
    }

    public void calculateAverageQuizScore() {
        for (Student student : students) {
            int sum = 0;
            for (int score : student.quizScores) {
                sum += score;
            }
            double average = (double) sum / student.quizScores.size();
            System.out.println("Average quiz score for " + student.name + ": " + average);
        }
    }

    public void printQuizScoresInAscendingOrder() {
        for (Student student : students) {
            Collections.sort(student.quizScores);
            System.out.println("Quiz scores for " + student.name + ": " + student.quizScores);
        }
    }

    public void printPartTimeNames() {
        for (Student student : students) {
            if (student instanceof PartTime) {
                System.out.println("Part-time student: " + student.name);
            }
        }
    }

    public void printFullTimeExamScores() {
        for (Student student : students) {
            if (student instanceof FullTime) {
                FullTime fullTimeStudent = (FullTime) student;
                System.out.println("Exam scores for " + student.name + ": " + fullTimeStudent.examScore1 + ", " + fullTimeStudent.examScore2);
            }
        }
    }
}