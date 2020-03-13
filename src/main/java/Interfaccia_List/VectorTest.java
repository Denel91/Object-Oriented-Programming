package Interfaccia_List;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorTest {
    public static void main(String[] args) {
        // Constructs an empty vector so that its internal data array has size 10
        // and its standard capacity increment is zero.
        Vector<Integer> vector_1 = new Vector<>();

        // Test Java assert
        Vector<Integer> vector_3 = new Vector<>();
        System.out.print("Vector_3: ");
        vector_3.add(0, 5);
        vector_3.addElement(3);
        vector_3.addElement(5);
        display(vector_3); // Exception in thread "main" java.lang.AssertionError: Contract violated: less than two
        // element

        System.out.print("Vector_1: ");

        // Inserts the specified element at the specified position in this Vector.
        vector_1.add(0, 0);
        vector_1.add(1, 2);
        vector_1.add(2, 4);
        vector_1.add(3, 6);
        vector_1.add(4, 8);
        vector_1.add(5, 10);
        vector_1.add(6, 12);
        vector_1.add(7, 14);
        vector_1.add(8, 16);
        vector_1.add(9, 18);
        display(vector_1);

        // Returns the component at the specified index.
        System.out.println("\nElement at 3st position -> " + vector_1.elementAt(3));

        // Returns the current capacity of this vector.
        System.out.println("The capacity of the Vector is -> " + vector_1.capacity());

        // Returns a clone of this vector.
        Object vector_2 = vector_1.clone();

        display((Vector<Integer>) vector_2); // We need to cast Object to Vector<>

        // Returns true if this vector contains the specified element.
        System.out.println("\nChecking the existence of number 8 -> " + vector_1.contains(8));

        // Returns an enumeration of the components of this vector.
        Enumeration enumeration = vector_1.elements();
        printEnumeration(enumeration);

        // Returns the hash code value for this Vector.
        System.out.println("Hash Code: " + vector_1.hashCode());

        // Returns an iterator over the elements in this list in proper sequence.
        Iterator<Integer> integerIterator = vector_1.iterator();

        viewVectorIterator(integerIterator);
    }

    /**
     * Display a Vector<> of integers.
     *
     * @param v : a Vector of integers, REQUIRE to have two or more elements;
     */
    private static void display(Vector<Integer> v) {
        assert v.size () >= 2 : "Contract violated: less than two element";
        String s = "{";
        String t = "}";

        System.out.print(s);

        for (int i = 0; i < v.size(); i++) {
            int value = v.get(i);

            if (i != v.size() - 1) {
                System.out.print(value + ",");

            } else {
                System.out.print(value);
            }
        }

        System.out.print(t + "\n");
    }

    /**
     * Display an Enumeration of integers.
     *
     * @param e : an Enumeration Object with all items in this vector.
     */
    private static void printEnumeration(Enumeration e) {
        while (e.hasMoreElements()) {
            System.out.println("Number -> " + e.nextElement());
        }
    }

    /**
     * Display a Vector of Integers with an Iterator<>
     *
     * @param iterator : an iterator over the elements in this vector
     */
    private static void viewVectorIterator(Iterator<Integer> iterator) {
        String s = "{ ";
        String t = "}";

        System.out.print(s);

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        System.out.print(t);
    }
}
