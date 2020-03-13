package Comparatori_Generici;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class ComparatorTypes {
    public static void main(String[] args) {

        // TreeSet<> : struttura di dati di tipo albero binario,
        // che garantisce un ordinamento ascendente degli elementi.
        Set<Integer> numbers = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });

        numbers.add(44);
        numbers.add(-10);
        numbers.add(-11);
        numbers.add(2);
        numbers.add(-18);
        numbers.add(20);

        System.out.printf("Numeri ordinati in ordine ascendente: %s%n", numbers);
    }
}

/**
 * OUTPUT:
 * <p>
 * Numeri ordinati in ordine ascendente: [-18, -11, -10, 2, 20, 44]
 */

