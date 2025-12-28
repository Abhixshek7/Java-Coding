import java.util.*;

public class MergeInterval {

    public static int[][] mergeIntervals(int[][] arr){
        if (arr.length <= 1){
            return arr;
        }

        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        // Just printing the array to see sorted result
        for (int[] interval : arr) {
            System.out.print(Arrays.toString(interval));
        }

        return arr;
    }

    public static void main(String[] args) {
        int[][] arr1 = {{1,2}, {0,4}, {5,7}};
        mergeIntervals(arr1);
    }
}
