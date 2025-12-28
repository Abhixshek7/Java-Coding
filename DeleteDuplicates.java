import java.util.*;
public class DeleteDuplicates {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);
        for(int i =0;i<n;i++){
            if(i==0||arr[i]!=arr[i-1]){
                System.out.print(arr[i] + " ");
            }
        }
        scan.close();
    }
}
