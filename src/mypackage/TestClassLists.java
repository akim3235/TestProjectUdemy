package mypackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestClassLists {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(10);
        list.add(9);

        System.out.println(list.get(1));

        list.set(2, 100);
        System.out.println(list.get(2));


        System.out.println();
        list.remove(1);
        System.out.println(list.get(1));
        System.out.println(list);

//        list.clear();
        System.out.println(list);

        Iterator<Integer> iterator = list.iterator();
        System.out.println(iterator.next());
        System.out.println(iterator.next());


    }
}
