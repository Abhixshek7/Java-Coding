import java.util.*;
public class RotateArray {

    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the size of the array = ");
    int n = scan.nextInt();
    int[] arr = new int[n];
    System.out.print("Enter the elements of the array = ");
    for(int i = 0;i<n;i++){
        arr[i] = scan.nextInt();
    }
    System.out.print("Enter the type of rotation (L|R) : ");
    char a = scan.next().charAt(0);
    System.out.print("Enter the number of rotations = ");
    int x = scan.nextInt();
    if(a=='R'|| a=='r'){
        RightRotate(arr,x,n);
       

    }
    else if(a=='L'||a=='l'){
        LeftRotate(arr,x,n);
    }
    else{
        System.out.print("Enter the correct type of rotation.");
    }
   
   
    scan.close();
}

    private static void reverse(int[] nums,int left,int right){
        while(left<right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left ++;
            right--;
        }

    }
    private static void RightRotate(int[] nums,int x,int n){
    reverse(nums,0,n-1);
    reverse(nums,0,x-1);
    reverse(nums,x,n-1);
    }

    private static void LeftRotate(int[] nums,int x,int n){
    reverse(nums,0,x-1);
    reverse(nums,x,n-1);
    reverse(nums,0,n-1);
 }
//  private void PrintArr(int[] nums){
//     for(int i :nums){
//         System.out.print(i + " ");
//     }
//  }
 
    
}
