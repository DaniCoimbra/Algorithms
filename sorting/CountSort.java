package sorting;

public class CountSort {
    public static void countSort(int[] array) {
        int[] sorted = new int[array.length];
        int maxVal = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxVal) {
                maxVal = array[i];
            }
        }
        int[] count = new int[maxVal + 1];
        for (int i = 0; i < array.length; i++) {
            count[i] = 0;
        }

        for (int i = 0; i < array.length; i++) {
            count[array[i]] += 1;
        }

        for (int i = 1; i <= maxVal; i++) {
            count[i] += count[i - 1];
        }

        for (int i = array.length - 1; i >= 0; i--) {
            sorted[count[array[i]] - 1] = array[i];
            --count[array[i]];
        }
        for (int i = 0; i < array.length; ++i)
            array[i] = sorted[i];
    }
}
