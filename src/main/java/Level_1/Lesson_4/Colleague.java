package Level_1.Lesson_4;

public class Colleague {
    String name;
    int age;

    public Colleague(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Colleague colleague1 = new Colleague("Anton", 28);
        System.out.println(colleague1.toString());
        System.out.println(colleague1.getName());
        colleague1.setName("Anton1");
        System.out.println(colleague1.getName());
    }

    @Override
    public String toString() {
        return "Colleague{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
