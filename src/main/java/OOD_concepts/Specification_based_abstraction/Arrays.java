package OOD_concepts.Specification_based_abstraction;

public class Arrays {
    public static void main(String[] args) {
        int[] source = {10, 34, 2, 56, 7, 67, 88, 42};
        sort(source);
        display(source);
    }

    /**
     * MODIFY a, by sorting it increasingly
     *
     * @param a: the array to be sorted
     */
    public static void sort(int[] a) {

        if (a == null) {
            return;
        }

        quickSort(a, 0, a.length - 1);
    }

    /**
     * Sort a in ascending order using the quicksort algorithm.
     * MODIFY a.
     *
     * @param a    the array to be sorted; REQUIRE a is not null
     * @param low  REQUIRE low >= 0
     * @param high REQUIRE high < a.length
     */
    private static void quickSort(int[] a, int low, int high) {
        if (low >= high) {
            return;
        }

        int middle = partition(a, low, high);
        quickSort(a, low, middle);
        quickSort(a, middle + 1, high);
    }

    /**
     * @param a: the array to reorder; REQUIRE a non null; MODIFY a.
     * @param i: starting index in a; REQUIRE 0 <= i < j < a.length.
     * @param j: ending index in a.
     * @return res, an index in array a such that each element in a_post[i,...,res] is smaller or equal to each
     * element in a_port[res+1,...,j]; MODIFY a.
     */
    private static int partition(int[] a, int i, int j) {
        int current = a[i];

        while (true) {
            while (a[j] > current) { // do not touch greater elements
                j--;
            }

            while (a[i] < current) { // do not touch smaller elements
                i++;
            }

            if (i > j) {
                return j;
            } else {
                swap(a, i, j);
                j--;
                i++;
            }
        }
    }

    /**
     * MODIFY a by exchanging elements a[i] and a[j].
     *
     * @param a: REQUIRE a not null;
     * @param i: an index in a; REQUIRE 0 <= i < a.length
     * @param j: an index in a; REQUIRE 0 <= j < a.length
     */
    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    /**
     * Display an array of integers.
     *
     * @param y : an array of integers
     */
    private static void display(int[] y) {
        String s = "[";
        String t = "]";
        System.out.print(s);
        for (int i = 0; i < y.length; i++) {

            if (i != y.length - 1) {
                System.out.print(y[i] + ",");

            } else {
                System.out.print(y[i]);
            }

        }

        System.out.print(t);
    }
}
