import java.util.*;
public class minop {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[4];
        for(int i=0;i<4;i++){
            arr[i] = scan.nextInt();
        }
        Map<Integer,Integer> map = new HashMap<>();
        for(int x:arr){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        int maxFreq = 0;
        for(int x: map.values()){
            maxFreq = Math.max(maxFreq,x);
        }
        System.out.println(4-maxFreq);
        scan.close();   

    }
}