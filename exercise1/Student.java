import java.util.ArrayList;

class Student {
    String name;
    ArrayList<Integer> quizScores;

    Student(String name) {
        this.name = name;
        this.quizScores = new ArrayList<>();
    }
}

class FullTime extends Student {
    int examScore1;
    int examScore2;

    FullTime(String name) {
        super(name);
    }
}

class PartTime extends Student {
    PartTime(String name) {
        super(name);
    }
}