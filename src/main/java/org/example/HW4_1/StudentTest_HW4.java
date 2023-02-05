package HW4_1;

import HW4_1.Student_HW4;

public class StudentTest_HW4 {
    public static void main(String[] args) {
        Student_HW4 student1 = new Student_HW4(1, "Alex", "Alexx", 1);
        Student_HW4 student2 = new Student_HW4(2, "Bob", "Marley", 3);
        Student_HW4 student3 = new Student_HW4(3, "Celvin", "Clein", 5);
        student1.averageScore(5, 4, 3);
        student2.averageScore(3, 1, 5);
        student3.averageScore(1, 2, 5);
    }
}