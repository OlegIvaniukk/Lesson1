package HW4.Employee;

public class Employee_HW4 {

    private int salary;
    public String surname;
    int id;

    public void showSalary() {
        System.out.println(salary);
    }

    public void showSurname() {
        System.out.println(surname);
    }

    public void showId() {
        System.out.println(id);
    }

    public Employee_HW4(int salary, String surname, int id) {
        this.salary = salary;
        this.surname = surname;
        this.id = id;
    }

    public Employee_HW4(int salary, String surname) {
        this.salary = salary;
        this.surname = surname;
    }

    public Employee_HW4(String surname, int id) {
        this.surname = surname;
        this.id = id;
    }

    public static void main(String[] args) {

    }
}
