import java.util.*;
public class SecondLargest {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        for(int i:arr){
            if(i>largest){
                secondlargest =largest;
                largest = i;
            }
            else if(i>secondlargest && i!=largest){
                secondlargest = i;
            }
        }
        System.out.print(secondlargest);
        scan.close();
    }
}