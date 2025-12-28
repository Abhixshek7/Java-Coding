
import java.util.*;
public class freqarr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }

        Map<Integer,Integer> freqArr = new HashMap<>();

        for(int num:arr){
            freqArr.put(num,freqArr.getOrDefault(num, 0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:freqArr.entrySet()){
            System.out.println(entry.getKey() +":"+ entry.getValue());
        }
        scan.close();
    }
}