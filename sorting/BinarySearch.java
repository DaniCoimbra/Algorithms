package sorting;

public class BinarySearch {
    public static int binarySearch(int[] array, int low, int high, int target) {
        while(low<=high) {
            int mid = (low+high)/2;

            if(array[mid] == target) {
                return mid;
            }
            else if(array[mid] > target) {
                high = mid-1;
            }
            else {
                low = mid+1;
            }
        }
        return -1;
    }
}
