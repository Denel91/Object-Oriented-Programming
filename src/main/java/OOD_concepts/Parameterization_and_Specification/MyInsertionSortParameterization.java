package OOD_concepts.Parameterization_and_Specification;

public class MyInsertionSortParameterization {

    public static void main(String[] args) {
        int[] array = {10, 34, 2, 56, 7, 67, 88, 42};
        insertionSort(array);

        System.out.print("Insertion Sort: ");
        System.out.print("[ ");

        for (int elem : array) {
            System.out.print(elem + " ");
        }

        System.out.print("]");

    }

    private static void insertionSort(int[] a) {
        int temp;
        for (int i = 1; i < a.length; i++) {
            for (int j = i; j > 0; j--) {
                if (a[j] < a[j - 1]) {
                    temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                }
            }
        }
    }
}
