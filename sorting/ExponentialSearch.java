package sorting;

public class ExponentialSearch {
    public static int exponentialSearch(int[] array, int low, int high, int target) {
        if (array[0] == target) {
            return 0;
        }

        int i = 1;
        while (i < array.length && array[i] <= target) {
            i = i * 2;
        }
        return BinarySearch.binarySearch(array,i/2,Math.min(i, array.length-1), target);
    }
}
