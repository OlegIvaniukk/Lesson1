package HW4_1;

public class Student_HW4 {
    int id;
    String name;
    String surname;
    int course;
    int averageMathScore;
    int averageEcoScore;
    int averageLanguageScore;

    Student_HW4(int id, String name, String surname, int course) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    void averageScore(int averageMathScore, int averageEcoScore, int averageLanguageScore) {
        int result = (averageMathScore + averageEcoScore + averageLanguageScore) / 3;
        System.out.println("Student " + name + " " + surname + " with id " + id + " from the course " + course + " has an average score of " + result + ".");

    }
}





