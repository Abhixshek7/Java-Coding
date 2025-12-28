import java.util.*;
public class CyclicPermutation {
    public static void cycPerm(int n){
        int digits = (int)Math.log10(n)+1;
        int powTen = (int) Math.pow(10,digits-1);  
        for(int i=0;i<digits;i++){
            System.out.println(n);
            int last = n%10;
            n = last * powTen + n/10;
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        cycPerm(n);
        scan.close();
    }
}
 

