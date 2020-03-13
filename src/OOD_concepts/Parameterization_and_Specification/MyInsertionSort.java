package OOD_concepts.Parameterization_and_Specification;

public class MyInsertionSort {
    static int[] array = {10, 34, 2, 56, 7, 67, 88, 42};
    static int temp;

    public static void main(String[] args) {
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }

        System.out.print("Insertion Sort: ");
        System.out.print("[ ");

        for (int elem : array) {
            System.out.print(elem + " ");
        }

        System.out.print("]");
    }
}
