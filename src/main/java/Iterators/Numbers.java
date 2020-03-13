package Iterators;

import java.util.Iterator;
import java.util.Random;

public class Numbers implements Iterable<Integer> {
    private int[] nrs;

    public Numbers(int how_many) {
        nrs = new int[how_many];
        doRandom(); // genera numeri casuali da mettere nell'array nrs.
    }

    private void doRandom() {
        Random rnd = new Random();
        for (int n = 0; n < nrs.length; n++) {
            nrs[n] = rnd.nextInt(100);
        }
    }

    public Iterator<Integer> iterator() {

        return new Iterator<Integer>() {

            private int pos = 0;

            @Override
            public boolean hasNext() {
                return pos < nrs.length;
            }

            @Override
            public Integer next() {
                return nrs[pos++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("Operazione non supportata");

            }
        };
    }

    public static void display(Numbers n) {
        Iterator<Integer> iterator = n.iterator();
        System.out.print("[ ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        System.out.println("]");
    }

    public static void main(String[] args) {
        Numbers nrs_obj = new Numbers(7); // creo un oggetto numbers con 7 elementi
        Numbers.display(nrs_obj);
    }
}
