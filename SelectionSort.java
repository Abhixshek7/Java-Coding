import java.util.*;
public class SelectionSort {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }

        selectionSort(arr);
        scan.close();
    }
    public static void selectionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int minIndex = i;
            for(int j = i;j<arr.length;j++){
                if(arr[minIndex]>arr[j]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
            if(minIndex!=i){
              for(int num:arr){
            System.out.print(num+ " ");
        }
        System.out.println();
        }
    }
      
    }
}