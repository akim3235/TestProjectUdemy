package mypackage;

public class TestClassString {

    public static void main(String[] args) {

        String s = "Hello World!";

        System.out.println(s.equals("Hello World!"));
        System.out.println(s.equals("Hello!"));

        String s2 = "Hello!";
        System.out.println(s.equals(s2));

        s = "text";
        s2 = "TEXT";
        System.out.println();
        System.out.println(s.equals(s2));
        System.out.println(s.equalsIgnoreCase(s2));

        System.out.println();
        System.out.println(s.charAt(1));
        System.out.println(s.indexOf("xt"));


        String age2 = "30";
        int a = Integer.parseInt(age2);
        System.out.println(a*3);
    }

}
