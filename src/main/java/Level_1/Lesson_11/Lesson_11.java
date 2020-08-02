package Level_1.Lesson_11;

import static Level_1.Lesson_11.Car.changeCars;

public class Lesson_11 {

}

class Car {
    String color;
    String engine;
    int amountOfDoors;

    public Car(String color, String engine, int amountOfDoors) {
        this.color = color;
        this.engine = engine;
        this.amountOfDoors = amountOfDoors;
    }

    public int changeAmountOfDoors(int i) {
        return this.amountOfDoors = i;
    }

    public static void changeCars(Car c1, Car c2) {
        String c3 = c1.color;
        //Car c3 = c1;
        c1.color = c2.color;
        c2.color = c3;
    }


}

class CarTest {

    public static void main(String[] args) {
        Car car1 = new Car("red", "V8", 4);
        Car car2 = new Car("blue", "V12", 2);


        //1
        System.out.println(car1.amountOfDoors);
        int x = car1.changeAmountOfDoors(40);
        System.out.println(x);

        //2
        System.out.println();
        System.out.println("Before changing");
        System.out.println();
        System.out.println(car1.color);
        System.out.println(car2.color);
        System.out.println();
        System.out.println("After changing");
        System.out.println();
        changeCars(car1, car2);
        System.out.println(car1.color);
        System.out.println(car2.color);
    }


}
