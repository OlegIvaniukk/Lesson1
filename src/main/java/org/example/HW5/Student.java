//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package HW5;

public class Student {
    private String name;
    private int course;
    private int grade;

    public Student() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name.length() >= 3) {
            this.name = name;
        }

    }

    public int getCourse() {
        return this.course;
    }

    public void setCourse(int course) {
        if (course > 0 && course <= 4) {
            this.course = course;
        }

    }

    public int getGrade() {
        return this.grade;
    }

    public void setGrade(int grade) {
        if (grade > 0 && grade < 10) {
            this.grade = grade;
        }

    }

    public void showInfo() {
        System.out.println(this.getCourse());
        System.out.println(this.getName());
        System.out.println(this.getGrade());
    }
}
