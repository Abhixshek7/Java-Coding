import java.util.*;

public class subarr {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the array = ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
       }
       System.out.print("Enter the chunk size = ");
       int size = scan.nextInt();
       for(int i=0;i<n;i+=size){
        System.out.print('[');
        for(int j = i;j<i+size && j<n;j++){
            System.out.print(arr[j]);
            if(j<i+size-1&&j<n-1){
                System.out.print(',');
            }
        }
        System.out.print(']');
       }
       scan.close();
    }
}