import java.util.*;
public class KthLargest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        System.out.print("Enter the kth value: ");
        int k = scan.nextInt();
        int result = kthLargest(arr, k);
        System.err.println(result);
        scan.close();
    }
    
    public static int kthLargest(int[] arr,int k){
        Queue<Integer> minHeap = new PriorityQueue<>();
        for(int num:arr){
            minHeap.offer(num);
            if(minHeap.size()>k){
                minHeap.poll();
            }
        }
        return minHeap.peek();
        
    }
}