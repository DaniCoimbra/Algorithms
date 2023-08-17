package search;

public class QuickSelect {
    public static int quickSelect(int[] arr, int k) {
        return quickSelect(arr, 0, arr.length - 1, k);
    }

    private static int quickSelect(int[] arr, int i, int i1, int k) {
        if (i1 - i < 1) {
            return arr[i];
        }
        int pivot = arr[i1];
        int left = i;
        int right = i1 - 1;
        while (left <= right) {
            while (left <= right && arr[left] < pivot) {
                left++;
            }
            while (left <= right && arr[right] > pivot) {
                right--;
            }
            if (left <= right) {
                swap(arr, left, right);
                left++;
                right--;
            }
        }
        swap(arr, left, i1);
        if (left == k) {
            return arr[left];
        } else if (left < k) {
            return quickSelect(arr, left + 1, i1, k);
        } else {
            return quickSelect(arr, i, left - 1, k);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

}
