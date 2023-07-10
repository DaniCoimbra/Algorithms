package search;

public class TernarySearch {
    public static int ternarySearch(int[] array, int low, int high, int target) {
        while(low <= high){
            int midL = low + (high-low)/3;
            int midH = high - (high-low)/3;

            if(array[midL] == target) {
                return midL;
            }
            else if(array[midH] == target) {
                return midH;
            }

            if (array[midL] > target) {
                high = midL-1;
            }
            else if (array[midH] < target) {
                low = midH + 1;
            }
            else {
                low = midL+1;
                high = midH-1;
            }
        }
        return -1;
    }
}
