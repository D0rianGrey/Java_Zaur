package Level_1.Lesson_6;

public class Sum {

    public int sum() {
        return 0;
    }

    public int sum(int a) {
        return a;
    }

    public int sum(int a, int b) {
        return a + b;
    }

    public int sum(int a, int b, int c) {
        return a + b + c;
    }

    public int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public static void main(String[] args) {
        Sum sum = new Sum();
        System.out.println(sum.sum());
        System.out.println(sum.sum(1));
        System.out.println(sum.sum(1, 2));
        System.out.println(sum.sum(1, 2, 3));
        System.out.println(sum.sum(1, 2, 3, 4));
    }
}

class Employee {
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

    public Employee(int id, String surname, int age) {
        this.id = id;
        this.surname = surname;
        this.age = age;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}

class Employee_Test {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Employee employee2 = new Employee(1, "Vakerin", 28, 750, "IT");
        Employee employee3 = new Employee(2, "Drobysheva", 27);

        System.out.println(employee);
        System.out.println(employee2);
        System.out.println(employee3);
    }

}

class Constructor {
    String name;
    int age;

    public Constructor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Constructor(String name) {
        this.name = name;
    }

    public Constructor(int age) {
        this.age = age;
    }

    public Constructor() {
        this("Eugene");
        System.out.println("Empty constructor");
    }

    @Override
    public String toString() {
        return "Constructor{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Constructor constructor = new Constructor();
        System.out.println(constructor);
    }

}
