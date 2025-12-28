import java.util.*;
public class prime {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int end = scan.nextInt();
        for(int i=2;i<=end;i++){
            int isPrime = 1;
            if(i<=3){
                System.out.print(i + " ");
                continue;
            }
            for(int j = 2;j*j<=i;j++){
                
                     if(i%j==0){
                    isPrime=0;
                    break;
                }
               
            }
            if(isPrime ==1){
                System.out.print(i + " ");
            }
          


        }
        scan.close();
    }
    
}
