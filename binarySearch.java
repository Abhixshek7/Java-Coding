import java.util.Scanner;
public class binarySearch {

    public static int binSearch(int[] arr,int target){
        int left = 0;
        int right = arr.length-1;
       
        while(left<=right){
            int mid = left +(right-left)/2;
            
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
           
        }
         return -1;
    }
    public static void main(String[] args){
       
        Scanner scan = new Scanner(System.in);
       
        int[] arr = {1,2,3,4,5,6,7};
        for(int n:arr){
            System.out.print(n + " ");
        }
        System.out.println();
        int target = scan.nextInt();

       int result =  binSearch(arr,target);
       if(result == -1){
        System.out.println("Element not found in the array");
       }
       else{
        System.out.println(result);
       }
        scan.close();
        
    }
}