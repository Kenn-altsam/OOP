package Lab3.Problem5;

public class Sort {

    /**
     * Generic swap method
     */
    public static <E> void swap(E[] array, int i, int j) {
        E temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    /**
     * Bubble Sort - simple and intuitive
     */
    public static <E extends Comparable<E>> void bubbleSort(E[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    swap(array, j, j + 1);
                }
            }
        }
    }

    /**
     * Merge Sort - more efficient for large datasets
     */
    public static <E extends Comparable<E>> void mergeSort(E[] array) {
        if (array.length > 1) {
            mergeSortHelper(array, 0, array.length - 1);
        }
    }

    private static <E extends Comparable<E>> void mergeSortHelper(E[] array, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSortHelper(array, left, mid);
            mergeSortHelper(array, mid + 1, right);
            merge(array, left, mid, right);
        }
    }

    private static <E extends Comparable<E>> void merge(E[] array, int left, int mid, int right) {
        Comparable[] temp = new Comparable[right - left + 1];

        int i = left, j = mid + 1, k = 0;

        while (i <= mid && j <= right) {
            if (array[i].compareTo(array[j]) <= 0) {
                temp[k++] = array[i++];
            } else {
                temp[k++] = array[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = array[i++];
        }

        while (j <= right) {
            temp[k++] = array[j++];
        }

        for (int x = 0; x < temp.length; x++) {
            array[left + x] = (E) temp[x];
        }
    }
}
