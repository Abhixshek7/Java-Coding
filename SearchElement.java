import java.util.*;
public class SearchElement {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        System.out.print("Enter the element to be found = ");
        int x = scan.nextInt();
        boolean isThere = false;
        for(int i=0;i<n;i++){
            if(x==arr[i]){
                System.out.print(x + " is found at index " + i);
                isThere = true;
                break;
            }
           
        }
    
        if(!isThere){
            System.out.print(x + " is not found");
        }
          
        scan.close();
    }
}
