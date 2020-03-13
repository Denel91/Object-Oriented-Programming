package OOD_concepts.Parameterization_and_Specification;

public class MyInsertionSortSpecification {
    public static void main(String[] args) {
        int[] source = {10, 34, 2, 56, 7, 67, 88, 42};
        int[] results = insertionSort(source);
        display(results);
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
     * @param a an array of integers to be sorted;
     * @return the modified array.
     */
    public static int[] insertionSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            for (int j = i; j > 0; j--) {
                if (a[j] < a[j - 1]) {
                    swap(a, j);
                }

            }
        }

        return a;
    }

    /**
     * Display an array of integers.
     *
     * @param y : an array of integers
     */
    public static void display(int[] y) {
        System.out.print("Insertion Sort: ");
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
