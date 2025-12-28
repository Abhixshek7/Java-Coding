import java.util.*;
public class swapfirstandlast {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int last = num%10;
        int digits =((int) Math.log10(num)+1);
        int first  = num/(int)Math.pow(10,digits-1);
        num%=(int)Math.pow(10,digits-1);
        num-=last;
        num +=first;
        num += (int)Math.pow(10,digits-1)*last;
        System.out.print(num);
        scan.close();
    }
}
