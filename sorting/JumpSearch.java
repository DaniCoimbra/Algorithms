package sorting;

public class JumpSearch {
    public static int jumpSearch(int[] array, int target) {
        int jump = (int)Math.floor(Math.sqrt(array.length));
        int prev = 0;

        for (int step = Math.min(jump, array.length)-1; array[step] < target; step = Math.min(jump, array.length)-1)
        {
            prev = jump;
            jump += (int)Math.floor(Math.sqrt(array.length));
            if (prev >= array.length)
                return -1;
        }
        while(array[prev] < target) {
            prev ++;
            if (prev == Math.min(jump, array.length))
                return -1;
        }
        if (array[prev] == target) {
            return prev;
        }
        return -1;
    }
}
