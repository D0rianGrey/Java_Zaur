package Level_1.Lesson_6;

public class Lesson_6_Practice {

    public static void main(String[] args) {
        Dog dog = new Dog("Шарик", "овчарка", 2);
    }

}

class Dog {

    private String name;
    private String poroda;
    private int age;

    {
        System.out.println("Это нестатический блок инициализации!");
    }

    public Dog(String x, String y, int z) {
        name = x;
        poroda = y;
        age = z;
    }

}

