package Level_1.Lesson_5;

public class Employee {
    int id;
    String surname;
    int age;
    int salary;
    String department;

    public Employee(int id, String surname, int age, int salary, String department) {
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    int doubleSalary() {
        return salary *= 2;
    }
}

class EmployeeTest {

    public static void main(String[] args) {

        Employee e1 = new Employee(1, "Eugene", 28, 5000, "QA");
        Employee e2 = new Employee(2, "Anton", 27, 25000, "DEV");

        System.out.println(e1.salary);
        int x = e1.doubleSalary();
        System.out.println(x);

    }


}
