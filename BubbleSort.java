import java.util.*;
public class BubbleSort {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        bubbleSort(arr);
        scan.close();
    }

    public static void bubbleSort(int[] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j = 0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
               
                
            }
            
              for(int num:arr){
                System.out.print(num+ " ");
            }
            System.out.println();
            
           
        }
       System.out.println();
        
    }
}
