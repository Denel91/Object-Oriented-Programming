package Data_Structures;

import java.util.List;
import java.util.Map;

public class Lista {
    public static void main(String[] args) {

        Iterable<String> list = List.of("s1", "s2", "s3", "s4");
        Map<Integer, String> map = Map.of(1, "s1", 2, "s2", 3, "s3");

        //display(list);
        //System.out.println();
        //view(list);
        //printMap(map);
        print(map);
    }

    public static void display(Iterable<String> l) {
        for (String e : l) {
            System.out.print(e + " ");
        }
    }

    public static void view(Iterable<String> l) {
        l.forEach(e -> System.out.print(e + " "));
    }

    public static void printMap(Map<Integer, String> map) {
        for (Integer key : map.keySet()) {
            System.out.print(key + ", " + map.get(key) + ", ");
        }
    }

    public static void print(Map<Integer, String> map) {
        for (Map.Entry e: map.entrySet()) {
            System.out.print(e.getKey() + ", " + e.getValue() + ", ");
        }
    }
}
