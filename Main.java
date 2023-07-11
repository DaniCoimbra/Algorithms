import sorting.*;

public class Main {
    public static void main(String[] args){
        int[] array = {3,2,4,1,5};
        CountSort.countSort(array);
        for(int i = 0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
