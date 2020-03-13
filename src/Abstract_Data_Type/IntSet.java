package Abstract_Data_Type;

import java.util.Collections;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Random;
import java.util.Vector;

public class IntSet {
    /** This class provides an ADT for sets of int.
     * IntSet is mutable, unbounded.
     * Class overview:
     * public IntSet()
     * public IntSet(int[] elts)
     * public IntSet(IntSet s)
     * public void insert(int x)
     * public boolean remove(int x)
     * public boolean isIn(int x)
     * private int indexOf(Integer x)
     * public int choose() throws EmptyIntSetException
     * public boolean sameValues(IntSet s2)
     */

    /**
     * ABSTRACTION FUNCTION:
     * the set is constituted by all the integers that are
     * represented in this.elements. Elements is not sorted.
     * INVARIANT elements != null & elements contains no duplicates &
     * elements contains boxed int (Integer).
     */

    private Vector<Integer> elements;

    /**
     * EFFECT: initialize this to a new set, empty.
     */
    public IntSet() {

        this.elements = new Vector<Integer>();
    }

    public IntSet(int[] elts) {
        if (elts == null) {
            throw new NullPointerException("elts should not be null");
        }

        this.elements = new Vector<Integer>();

        for (int x : elts) {
            Integer y = new Integer(x);
            if (!this.elements.contains(y)) {
                this.elements.add(y);
            }
        }
    }

    /**
     * Copy constructor.
     *
     * @param s: a set to be duplicated
     *           EFFECT initialize this to a new set that contains all and only
     *           the elements of s.
     * @throws NullPointerException if s is null
     */
    public IntSet(IntSet s) {
        if (s == null) {
            throw new NullPointerException("s should not be null");
        }
        this.elements = (Vector<Integer>) s.elements.clone();
    }

    /**
     * MODIFY this: x is added to this set if x is not present
     */
    public void insert(int x) {
        Objects.requireNonNull(this.elements);
        Integer y = new Integer(x);
        if (!this.elements.contains(y)) {
            this.elements.addElement(y);
        }

        assert (this.elements.contains(y));
    }

    /**
     * MODIFY this: x is removed from this set if x is present
     *
     * @param x: the element removed from this set
     * @return: true if x was removed
     */
    public boolean remove(int x) {
        Objects.requireNonNull(this.elements);
        Integer y = new Integer(x);
        boolean res = this.elements.remove(y);
        assert (!this.elements.contains(y));
        return (res);
    }

    /**
     * @return: true if x is present in this
     */
    public boolean isIn(int x) {
        Objects.requireNonNull(this.elements);
        Integer y = new Integer(x);
        int i = this.indexOf(y);
        boolean res = (i >= 0);
        assert (!res || this.elements.contains(y)) : "res implies (y in elements)";
        return (res);
    }

    /**
     * @return: the index of x if it is present in this; return -1 if not present
     */
    private int indexOf(int z) {
        Objects.requireNonNull(this.elements);
        Integer x = new Integer(z);
        for (int i = 0; i < this.elements.size(); i++) {
            if (this.elements.get(i).equals(x)) {
                return (i);
            }
        }
        return (-1);
    }

    /**
     * choose an element of this
     *
     * @return a random element in this
     * @throws EmptyIntSetException if this is empty
     */
    public int choose() throws EmptyIntSetException {
        if (this.elements.isEmpty()) {
            throw new EmptyIntSetException("IntSet is Empty");
        }

        Random randomGenerator = new Random();
        int x = randomGenerator.nextInt(this.elements.size());
        return (this.elements.elementAt(x));
    }

    /**
     * @return: the number of elements in this
     */
    public long size() {
        Objects.requireNonNull(this.elements);
        return (this.elements.size());
    }

    /**
     * @param s2: the set to be compared to this
     * @return true if this and s2 contains the same set of int
     * MODIFY this and s2 by sorting their elements.
     * @throws NullPointerException if s2 is null.
     */
    public boolean sameValues(IntSet s2) {
        Objects.requireNonNull(this.elements);

        if (s2 == null) {
            throw new NullPointerException("s2 should not be null");
        }

        Collections.sort(this.elements); // BEWARE integers are moved
        Collections.sort(s2.elements);
        boolean res = this.elements.equals(s2.elements);
        return (res);
    }

    /**
     * @return the smaller value in elements
     */
    public int min() {
        Objects.requireNonNull(this.elements);
        int minimo = elements.get(0);
        for (int i = 0; i < elements.size(); i++) {
            if (elements.get(i) < minimo) {
                minimo = elements.get(i);
            }
        }

        return minimo;
    }

    /**
     * @return the bigger value in elements
     */
    public int max() {
        Objects.requireNonNull(this.elements);
        int massimo = elements.get(0);
        for (int i = 0; i < elements.size(); i++) {
            if (elements.get(i) > massimo) {
                massimo = elements.get(i);
            }
        }

        return massimo;
    }

    /*
     * Display the IntSet of Integers
     * */
    public String toString() {
        StringBuilder s = new StringBuilder("IntSet: { ");
        Iterator g = elements.iterator();

        while (g.hasNext()) {
            int y = ((Integer) g.next()).intValue();
            s.append(y).append(" ");
        }

        return (s + "}");
    }

    /**
     * Ritorna un oggetto che consente di iterare su IntSet
     */
    public Iterator<Integer> elements() {
        return elements.iterator();
    }

    /**
     * @return Returns a generator that will produce the Integers of this set. The iterator is not sensible to
     * mutations of this set.
     */
    public IntSetIterator iterator() {
        assert (this.elements != null);
        return new IntSetIterator(this);
    }

    public static void printIntSet(IntSet s) {
        IntSetIterator g = s.iterator();
        while (g.hasNext()) {
            System.out.print(g.next() + " ");
        }
    }

    /*
     * Display the IntSet of Integers
     * */
    public static void display(IntSet v) {
        String s = "\nIntSet: { ";
        String t = "}";
        IntSetIterator integerIterator = v.iterator();

        System.out.print(s);

        while (integerIterator.hasNext()) {
            System.out.print(integerIterator.next() + " ");
        }

        System.out.print(t);
    }

    public int sumIntSet(IntSet s) {
        int res = 0;
        Iterator<Integer> g = s.iterator();

        while (g.hasNext()) {
            res += g.next();
        }

        return res;
    }

    public int mulIntSet(IntSet s) {
        int mul = 1;
        Iterator<Integer> g = s.iterator();

        while (g.hasNext()) {
            mul *= g.next();
        }

        return mul;
    }

    /**
     * ========================================================
     *          INNER CLASS for generic iterator
     * ========================================================
     */

    /**
     * MISSION is to provide an iterator over the elements of an IntSet
     * Once the iterator is created, if the original set changes the iterator continue to work on the original copy.
     */
    private static class IntSetIterator implements Iterator<Integer> {
        /**
         * INVARIANT
         * elements contains a copy of the elements of the IntSet when this iterator is created.
         */
        private int current;
        final private Vector<Integer> elements;

        /**
         * @param s an IntSet REQUIRE not null
         *          Initialize the iterator with the size of the vector and with current index = 0, and store a copy
         *          of the elements.
         */
        private IntSetIterator(IntSet s) {
            Objects.requireNonNull(s);
            this.elements = (Vector<Integer>) s.elements.clone();
            this.current = 0;
        }

        @Override
        public boolean hasNext() {
            return (this.current < this.elements.size());
        }

        @Override
        public Integer next() {
            if (this.current < this.elements.size()) {
                Integer res = this.elements.get(this.current);
                this.current++;
                return res;
            } else {

                throw new NoSuchElementException("Went beyond the available values");
            }
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }

        /**
         * MODIFY change the current index and set it to 0.
         */
        public void reset() {
            this.current = 0;
        }
    }

    public static void main(String[] args) {
        int[] source = {10, 34, 2, 56, 7, 67, 88, 42};
        int[] vettore = {6, 5, 2, 8, 9, 4, 7, 10};
        IntSet intSet = new IntSet(source);
        IntSet intSet1 = new IntSet(vettore);
        //System.out.println(intSet.indexOf(56));
        //System.out.println(intSet.toString());
        //System.out.println(intSet.choose());
        //display(intSet);
        //System.out.println(intSet.sumIntSet(intSet1));
        //System.out.println(intSet1.sumIntSet(intSet));
        //System.out.println(intSet.mulIntSet(intSet1));
        //System.out.println(intSet1.min());
        //System.out.println(intSet1.max());
        //System.out.println(intSet1.toString());
        printIntSet(intSet1);
        //display(intSet);
    }
}
