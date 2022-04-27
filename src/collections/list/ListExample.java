package collections.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ListExample {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Armen");
        stringList.add("Artur");
        stringList.add("Vahan");
        stringList.add("Narek");
        stringList.add("Vazgen");

//        System.out.println(stringList.size());
//
//        System.out.println(stringList.isEmpty());
//        stringList.stream().forEach(s -> System.out.println(s));
//        stringList.stream().filter(s -> s.startsWith("V")).map(String::toLowerCase).forEach(System.out::println);

        Set<Integer> setInt = new TreeSet<>();
        setInt.add(10);
        setInt.add(20);
        setInt.add(30);
        setInt.add(40);
        setInt.add(10);

        System.out.println(setInt);
        setInt.remove(20);
        System.out.println(setInt);
    }
}
