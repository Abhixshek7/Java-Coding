import java.util.*;
public class PrintUnique {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        for(int i=0;i<n;i++){
            boolean isUnique = true;
            for(int j=0;j<n;j++){
                if(i!=j&&arr[i]==arr[j]){
                    isUnique = false;
                    break;
                }
            }
            if(!isUnique){
                System.out.print(arr[i]+ " ");
            }
        }
        scan.close();
    }
}
