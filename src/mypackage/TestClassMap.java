package mypackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestClassMap {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Black");
        map.put(2, "White");
        map.put(3, "Yellow");
        map.put(10, "Green");

        System.out.println(map.get(1));
        System.out.println(map.get(10));

        System.out.println(map.size());
//        map.clear();
        System.out.println(map.size());

        System.out.println();
        System.out.println(map.containsKey(90));
        System.out.println(map.containsKey(10));
        System.out.println();
        System.out.println(map.containsValue("White"));
        System.out.println(map.containsValue("Grey"));

        System.out.println();
        Set<Integer> keys = map.keySet();
        Iterator<Integer> iterator = keys.iterator();
        while (iterator.hasNext()){
            System.out.println(map.get(iterator.next()));
        }

    }

}
