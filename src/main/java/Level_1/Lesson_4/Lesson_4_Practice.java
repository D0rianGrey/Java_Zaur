package Level_1.Lesson_4;

public class Lesson_4_Practice {


}

class Student {
    int student_ticket;
    String first_name;
    String last_name;
    int year_learning;
    double average_mark_math;
    double average_mark_history;
    double average_mark_foreign_language;

    void averageMark(double math, double history, double foreign) {
        double mark = (math + history + foreign) / 3;
        System.out.println(mark);
    }

}

class StudentTest {

    public static void main(String[] args) {
        Student Eugene = new Student();
        Student Anton = new Student();
        Student Vera = new Student();


        Eugene.average_mark_foreign_language = 10.5;
        Eugene.average_mark_history = 2.3;
        Eugene.average_mark_math = 9.7;

        Anton.average_mark_foreign_language = 6.5;
        Anton.average_mark_history = 0.3;
        Anton.average_mark_math = 1.7;

        Vera.average_mark_foreign_language = 9.5;
        Vera.average_mark_history = 4.6;
        Vera.average_mark_math = 2.2;

        System.out.println(("Eugene - " + (Eugene.average_mark_foreign_language + Eugene.average_mark_history + Eugene.average_mark_math) / 3));
        System.out.println(("Anton - " + (Anton.average_mark_foreign_language + Anton.average_mark_history + Anton.average_mark_math) / 3));
        System.out.println(("Vera - " + (Vera.average_mark_foreign_language + Vera.average_mark_history + Vera.average_mark_math) / 3));

        Eugene.averageMark(Eugene.average_mark_foreign_language, Eugene.average_mark_history, Eugene.average_mark_math);

    }

}
