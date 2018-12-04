package mypackage;

public class TestClass {

    public static void main(String[] args) {
        System.out.print("Hello World! ");
        System.out.println("How are you doing?");
        System.out.println("Ok. Good Bye!");

        byte a = 5; // -128 127
        short b = -100; // -32768 32767
        int c;
        c = 1000000;
        long d = -234523523;

        // text
        /*asdfasfaf
        adfasfasf
        asfasdfad
         */

        System.out.println(a);
        System.out.println("short b: " + b);
        System.out.println("int c: " + c);
        System.out.println("long d: " + d);

        double double1 = 132.324;
        System.out.println();
        System.out.println("double double1: " + double1);
        float float1 = 35345.34f;
        System.out.println(float1);

        boolean boolean1 = true;
        boolean boolean2 = false;

        System.out.println(boolean1);
        System.out.println(boolean2);

        boolean boolean3 = 1 + 2 > 0;
        boolean boolean4 = 1 + 2 > 5;
        System.out.println(boolean3);
        System.out.println(boolean4);

        String str = "Hello";
        String str2 = "World!";
        String str3 = str + " " + str2;
        System.out.println();
        System.out.println(str3);

        char char1 = 'k';
        System.out.println(char1);

    }
}
