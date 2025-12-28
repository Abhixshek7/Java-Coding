import java.util.*;

public class perfsqr {

    public static void main(String[] args){
        Scanner scan  = new Scanner(System.in);
        int start = scan.nextInt();
        int end = scan.nextInt();
        for(int i = start;i<=end;i++){
            double sqrt = Math.sqrt(i);
            if(sqrt ==(int)sqrt){
                System.out.print(i + " ");
            }
        }
        scan.close();
    }
}