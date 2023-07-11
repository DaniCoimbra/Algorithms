package sorting;

public class CombSort {
    public static void combSort(int[] array) {
        boolean swapped = true;
        int gap = array.length;
        while (gap > 1 || swapped == true) {
            gap = (gap*10)/13;
            if (gap < 1)
                gap = 1;
            swapped = false;

            for(int i = 0; i<array.length-gap; i++){
                if(array[i] > array[i+gap]) {
                    int temp = array[i];
                    array[i] = array[i+gap];
                    array[i+gap] = temp;

                    swapped = true;
                }
            }
        }
    }
}
