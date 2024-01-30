import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Session session = new Session();
        Random random = new Random();
        for (int i = 1; i <= 10; i++) {
            FullTime fullTime = new FullTime("FullTime_" + i);
            for (int j = 0; j < 15; j++) {
                fullTime.quizScores.add(random.nextInt(10) + 1);
            }
            fullTime.examScore1 = 80 + i;
            fullTime.examScore2 = 85 - i;
            session.students.add(fullTime);
        }
        for (int i = 1; i <= 10; i++) {
            PartTime partTime = new PartTime("PartTime_" + i);
            for (int j = 0; j < 15; j++) {
                partTime.quizScores.add(random.nextInt(10) + 1);
            }
            session.students.add(partTime);
        }

        System.out.println("Average quiz scores:");
        session.calculateAverageQuizScore();
        System.out.println("\nQuiz scores in ascending order:");
        session.printQuizScoresInAscendingOrder();
        System.out.println("\nPart-time students:");
        session.printPartTimeNames();
        System.out.println("\nFull-time exam scores:");
        session.printFullTimeExamScores();
    }
}