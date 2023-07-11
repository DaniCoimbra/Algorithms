package sorting;

public class TimSort {
    public static void timSort(int[] array) {
        int run = 0;
        int n = array.length;
        while (n >= run) {
            run |= (n & 1);
            n >>= 1;
        }
        run += n;

        for (int i = 0; i < array.length; i += run) {
            insertionSort(array, i, Math.min((i + run - 1), (array.length - 1)));
        }
        for (int size = run; size < array.length; size = 2 * size) {
            for (int left = 0; left < array.length; left += 2 * size) {
                int mid = left + size - 1;
                int right = Math.min((left + 2 * size - 1), (array.length - 1));
                if (mid < right)
                    MergeSort.merge(array, left, right, mid);
            }
        }
    }


    private static void insertionSort(int[] array, int start, int end) {
        for (int i = start + 1; i < end; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= start && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }
}
