package sorting;

public class RadixSort {
    public static void radixSort(int[] array) {
        int maxVal = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxVal) {
                maxVal = array[i];
            }
        }
        for (int digit = 1; maxVal / digit > 0; digit *= 10) {
            sort(array, digit);
        }

    }

    private static void sort(int[] array, int digit) {
        int output[] = new int[array.length];
        int count[] = new int[10];

        for (int i = 0; i < 10; i++) {
            count[i] = 0;
        }

        for (int i = 0; i < array.length; i++)
            count[(array[i] / digit) % 10]++;

        for (int i = 1; i < 10; i++)
            count[i] += count[i - 1];

        for (int i = array.length - 1; i >= 0; i--) {
            output[count[(array[i] / digit) % 10] - 1] = array[i];
            count[(array[i] / digit) % 10]--;
        }

        for (int i = 0; i < array.length; i++)
            array[i] = output[i];
    }
}
