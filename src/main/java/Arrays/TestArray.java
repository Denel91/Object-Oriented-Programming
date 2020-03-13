package Arrays;

import static OOD_concepts.Parameterization_and_Specification.MyInsertionSortSpecification.display;
import static OOD_concepts.Parameterization_and_Specification.MyInsertionSortSpecification.insertionSort;

/**
 * The mission of this class is to provide a number of standalone procedures that can be useful for manipulating
 * arrays of ints.
 */
public class TestArray {
    public static void main(String[] args) {

        final int[] values = {3, 6, 9, 5, 2, 4, 1, 8, 7};

        int searchKey = 1;
        System.out.println("Search Key found at index: " + sequentialSearch(values, searchKey));

        int[] sortedValues = insertionSort(values);
        display(sortedValues);
        int searchValue = 5;
        System.out.print("\nSearch Key found at index: " + binaySearchRecursively(sortedValues, searchValue, 0,
                values.length - 1));
    }

    /**
     * Sequential research of an element within an array
     *
     * @param source the array where to look for the key;
     * @param key    the value of the element in source;
     * @return index of key if it is present in source, else return -1.
     */
    public static int sequentialSearch(int[] source, int key) {
        for (int i = 0; i < source.length; i++) {
            if (source[i] == key) {
                return i;
            }
        }

        return -1;
    }

    /**
     * Binary research of an element within an array
     *
     * @param sortedArray an array of integers sorted
     * @param key         the value of the element in sortedArray;
     * @param low         the first index of the sortedArray, is 0;
     * @param high        the last index of the sortedArray, is equal to its length – 1.
     * @return index of key if it is present in source, else return -1.
     */
    public static int binaySearchRecursively(int[] sortedArray, int key, int low, int high) {
        // If the element is present at the middle itself
        int middle = (low + high) / 2;

        if (high < low) {
            return -1;
        }
        if (key == sortedArray[middle]) {
            return middle;
        } else if (key < sortedArray[middle]) {
            // If key is smaller than middle, then it can only be present in left sub-array
            return binaySearchRecursively(sortedArray, key, low, middle - 1);
        } else {
            // Else the key can only be present in right sub-array
            return binaySearchRecursively(sortedArray, key, middle + 1, high);
        }
    }
}


