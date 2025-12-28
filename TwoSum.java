import java.util.*;
public class TwoSum {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        System.out.print("Target = ");
        int x = scan.nextInt();
        int[] result = twoSum(arr, x);
        if(result.length==2){
            System.out.print(result[0] +" "+ result[1]);
        }
        else{
            System.out.print("No pairs");
        }
     
        scan.close();

    }
    public static int[] twoSum(int[] arr,int x){
        for(int i =0;i<arr.length;i++){
            for(int j =i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==x){
                    return new int[]{i,j};
                }
            }
        }
        return new int[] {};
    }
}
