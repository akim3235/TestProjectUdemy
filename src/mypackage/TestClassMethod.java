package mypackage;

import java.sql.SQLOutput;

public class TestClassMethod {

    public static void main(String[] args) {

        int result;
        result = getSum(3, 7);
        System.out.println(result);

        result = getSum(5, 6, 32);
        System.out.println(result);


        int a = 15;
        int b = 4334;

        int sum;
        sum = getSum(a, b);
        System.out.println(sum);
        sum = getSum(433, 965);
        System.out.println(sum);
        System.out.println(getSum(9, 8));

        showSum(9, 93, 888);

        sayHello("Alex");

        String name = "lkajsdfldjks";
        sayHello(name);

        int[] array = {2, 3, 45, 65, 777};
        int sum1 = getSum(array, "Oleg");

    }

    static int getSum(int x, int y) {
        int sum;
        sum = x+y;
        return sum;
    }

    static void showSum(int x, int y, int z) {
        int sum = x+y+z;
        System.out.println("Sum is: " + sum);
    }

    static void sayHello(String name) {
        System.out.println();
        System.out.println("Hello, " + name + "!");
        System.out.println("I'm your application");
        System.out.println("Have a nice day");
    }

    static int getSum(int x, int y, int z) {
        int sum;
        sum = x+y+z;
        return sum;
    }

    static int getSum(int[] array, String name) {
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }
        System.out.println("Hi " + name + "!");
        System.out.println("Your sum is: " + sum);
        return sum;
    }

}
