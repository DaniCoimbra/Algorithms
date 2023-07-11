package sorting;

public class MergeSort {
    public static void merge(int[] array, int l, int r, int m) {
        int half1 = m - l + 1;
        int half2 = r - m;

        int left[] = new int[half1];
        int right[] = new int[half2];

        for (int i = 0; i < half1; ++i)
            left[i] = array[l + i];
        for (int j = 0; j < half2; ++j)
            right[j] = array[m + 1 + j];

        int i = 0, j = 0, k = l;

        while (i < half1 && j < half2) {
            if (left[i] <= right[j]) {
                array[k] = left[i];
                i++;
            } else {
                array[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < half1) {
            array[k] = left[i];
            i++;
            k++;
        }

        while (j < half2) {
            array[k] = right[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);

            merge(array, left, right, mid);
        }
    }
}
