import java.util.*;

public class hcf {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int min = (num1<num2)?num1:num2;
        int hcf = 1;
        for(int i=min;i>=1;i--){
            if(num1%i==0 && num2%i == 0){
                hcf =i;
                break;
            }
        }
        System.out.printf("HCF of %d and %d = %d",num1,num2,hcf);
        scan.close();
    }
}