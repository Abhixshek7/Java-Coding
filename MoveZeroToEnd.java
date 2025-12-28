import java.util.*;
public class MoveZeroToEnd {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        int j = 0;
        for(int i =0;i<n;i++){
           
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        for(int i:arr){
            System.out.print(i + " ");
        }
        scan.close();
    }
}
