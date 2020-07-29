package Level_2.ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableTest {

}

class Student implements Comparable<Student> {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Student student = new Student("Eugene", 28);
        Student student2 = new Student("Oleh", 23);
        Student student3 = new Student("Lilya", 30);

        List<Student> list = new ArrayList<>();
        list.add(student);
        list.add(student2);
        list.add(student3);

        System.out.println("Before" + list);
        Collections.sort(list);
        System.out.println("After" + list);


    }

    @Override
    public int compareTo(Student another) {
        if (this.age == another.age) {
            return 0;
        } else if (this.age < another.age) {
            return -1;
        } else {
            return 1;
        }
    }
}
