package Level_1.Lesson_2_Statements;

public class Lesson2_Practice {
    public static void main(String[] args) {
        //1
        byte b1 = 12;       // 10 (nothing)
        byte b2 = 0b1100;  //   2 (+0b)
        byte b3 = 014;     //    8 (+0)
        byte b4 = 0xC;     //    16 (+ 0x)

        short s1 = 1300;
        short s2 = 0b010100010100;
        short s3 = 02424;
        short s4 = 0x514;

        int i1 = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;

        long l1 = 123456789;
        //long l2 = 0b000100100011010001010110011110001001;
        //long l3 = 044321263611;
        long l4 = 0x123456789L;

        //2

        float test1 = 5F;
        float test2 = 6f;
        double doub1 = 6570954867D;
        double doub2 = 6570954567658D;
        Boolean true1 = true;
        Boolean false1 = false;
        System.out.println(test1);
        System.out.println(test2);
        System.out.println(doub1);
        System.out.println(doub2);
        System.out.println(true1);
        System.out.println(false1);


        //3

        char c1 = 'a';
        char c2 = '\u0061';
        System.out.println(c2);

    }

}
