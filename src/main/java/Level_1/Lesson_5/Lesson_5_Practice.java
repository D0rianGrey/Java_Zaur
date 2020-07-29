package Level_1.Lesson_5;

public class Lesson_5_Practice {

    public static void main(String[] args) {
        Human h1 = new Human("Eugene", "Vakerin", new Car(1990, "Black"), new BankAccount(25, 600.5));
        h1.info();
    }

}

class Human {
    String firstName;
    String lastName;
    Car car;
    BankAccount bankAccount;

    public Human(String firstName, String lastName, Car car, BankAccount bankAccount) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.car = car;
        this.bankAccount = bankAccount;
    }

    void info() {
        System.out.println(car.color + " " + car.age + " " + bankAccount.id + " " + bankAccount.salary);
    }
}


class Car {
    int age;
    String color;

    public Car(int age, String color) {
        this.age = age;
        this.color = color;
    }
}

class BankAccount {
    int id;
    double salary;

    public BankAccount(int id, double salary) {
        this.id = id;
        this.salary = salary;
    }
}
