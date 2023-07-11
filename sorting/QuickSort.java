package sorting;

public class QuickSort {
    public static void quickSort(int[] array, int low, int high) {
        while (low < high) {
            int part = partition(array, low, high);
            if(part - low < high - part) {
                quickSort(array, low, part - 1);
                low = part + 1;
            }
            else{
                quickSort(array, part+1, high);
                high = part - 1;
            }
        }
    }

    private static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low-1;
        for (int j = low; j<= high-1; j++) {
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i+1];
        array[i+1] = array[high];
        array[high] = temp;
        return i+1;
    }
}
