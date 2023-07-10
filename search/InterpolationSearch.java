package search;

public class InterpolationSearch {
    public static int interpolationSearch(int[] array, int low, int high, int target) {
        int index;

        while(low <= high && target >= array[low] && target <= array[high]) {
            index = low + (target - array[low]) * (high - low)/(array[high] - array[low]);
            if (array[index] == target){
                return index;
            }
            if (array[index] > target){
                low = index+1;
            }
            else {
                high = index-1;
            }
        }
        return -1;
    }
}
