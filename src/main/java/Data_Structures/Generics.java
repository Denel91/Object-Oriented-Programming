package Data_Structures;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * The Java collections framework consists of the classes and interfaces that implement a collection data structure.
 */
public class Generics {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        Set<String> set2 = new HashSet<>();
        Set<String> set1 = new HashSet<>();
        Set<String> set3 = new HashSet<>();

        set1.add("s1");
        set1.add("s2");

        set3.add("s1");
        set3.add("s2");
        System.out.println(set1.addAll(set3));
        print(set1);

        list.add("s1");
        list.add("s2");
        list.add("s3");
        list.add("s4");
        display(list);

        System.out.println();

        set.add(8);
        set.add(4);
        set.add(6);
        set.add(3);
        view(set);

        System.out.println();

        list2.addAll(list);
        display(list2);

        System.out.println();

        set2.addAll(list);
        print(set2);
    }

    private static void display(List<String> v) {
        assert v.size() >= 2 : "Contract violated: less than two element";
        String s = "[ ";
        String t = "]";

        Iterator<String> stringIterator = v.iterator();

        System.out.print(s);
        while (stringIterator.hasNext()) {
            System.out.print(stringIterator.next() + " ");
        }

        System.out.print(t);
    }

    private static void view(Set<Integer> s) {
        assert s.size() >= 2 : "Contract violated: less than two element";
        String p = "[ ";
        String t = "]";

        Iterator<Integer> integerIterator = s.iterator();

        System.out.print(p);
        while (integerIterator.hasNext()) {
            System.out.print(integerIterator.next() + " ");
        }

        System.out.print(t);
    }

    private static void print(Set<String> s) {
        assert s.size() >= 2 : "Contract violated: less than two element";
        String p = "[ ";
        String t = "]";

        Iterator<String> stringIterator = s.iterator();

        System.out.print(p);
        while (stringIterator.hasNext()) {
            System.out.print(stringIterator.next() + " ");
        }

        System.out.print(t);
    }
}
