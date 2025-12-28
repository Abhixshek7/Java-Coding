import java.util.*;

public class forlooop {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int range = scan.nextInt();
        for(int i =1; i<=range;i++){
            int original = i;
            int digits = (int)Math.log10(i)+1;
            int sum = 0;
            int temp = i;
            while(temp>0){
                int num = temp%10;
                sum += (int) Math.pow(num,digits);
                temp/=10;
            }
            if(original==sum){
                System.out.print(original + " ");
            }
        }
        scan.close();
    }
}