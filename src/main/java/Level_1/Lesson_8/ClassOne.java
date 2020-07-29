package Level_1.Lesson_8;

public class ClassOne {

    public static double multiply(double a, double b, double c) {
        return a * b * c;
    }

    public static void firstDividedBySecond(double a, double b) {
        double result = a / b;
        System.out.println(result);

    }
}

class ClassOneTest {
    public static void main(String[] args) {
        double result1 = ClassOne.multiply(4.5, 5, 6.1);
        double ostatok1 = result1 % 1;
        System.out.println(result1);
        System.out.println(ostatok1);

        ClassOne.firstDividedBySecond(9, 3);
        ClassOne.firstDividedBySecond(25, 5);

    }
}

class Dwa {
    final static double pi = 3.14;


    public double square(double radius) {
        return pi * radius * radius;
    }

    public static double length(double radius) {
        return 2 + pi * radius;
    }

    public void info(double radius) {
        System.out.println(radius);
        System.out.println(square(radius));
        System.out.println(length(radius));
    }
}

class Extra {
    public static void main(String[] args) {
        Dwa dwa = new Dwa();
        dwa.square(10);

        Dwa.length(20);
        dwa.info(30);

    }
}
