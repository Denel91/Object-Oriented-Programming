package Comparatori_Generici;

/**
 * Example with parametric choice of sort direction
 */
public class MySortAnonymousClasses {

    /**
     * Labels to specify order direction
     */
    public enum SortDirection {
        INCREASING,
        DECREASING
    }

    interface IntComparator {
        boolean compare(int x, int y);
    }

    /**
     * Sort the array a
     * MODIFY the array a, so that values are ordered
     *
     * @param a   : an array of integers to be sorted
     * @param dir : the direction of the sort: INCREASING/DECREASING
     */
    private static void doParametricSort(int[] a, SortDirection dir) {
        IntComparator ic = null; // the actual comparator that we will be using

        switch (dir) {
            case INCREASING:
                ic = new IntComparator() {
                    @Override
                    public boolean compare(int x, int y) {
                        return (x < y);
                    }
                };
                break;

            case DECREASING:
                ic = new IntComparator() {
                    @Override
                    public boolean compare(int x, int y) {
                        return (x > y);
                    }
                };
                break;
        }

        doInsertionSort(a, ic);

    }

    /**
     * swap a[j] with a[j-1]; MODIFY the array a
     *
     * @param a an array of integers, REQUIRE to have two or more elements;
     * @param j an index of the array, REQUIRE to be a valid index and > 0.
     */
    private static void swap(int[] a, int j) {
        int temp;
        temp = a[j];
        a[j] = a[j - 1];
        a[j - 1] = temp;
    }

    /**
     * MODIFY the array a so that values are ordered, increasing
     *
     * @param a  : an array of integers to be sorted;
     * @param ic : a generic comparator for integers.
     * @return the modified array.
     */
    private static void doInsertionSort(int[] a, IntComparator ic) {
        for (int i = 1; i < a.length; i++) {
            for (int j = i; j > 0; j--) {
                if (ic.compare(a[j], a[j - 1])) {
                    swap(a, j);
                }
            }
        }
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

    public static void main(String[] args) {
        int[] source = {10, 34, 2, 56, 7, 67, 88, 42};

        doParametricSort(source, SortDirection.INCREASING);
        System.out.println("Increasing: ");
        display(source);

        System.out.println("\n");

        doParametricSort(source, SortDirection.DECREASING);
        System.out.println("Decreasing: ");
        display(source);
    }
}
