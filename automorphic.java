import java.util.*;

public class automorphic {

    public static void main(String[] args){
        Scanner scan  = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int num  = scan.nextInt();
        int sqr = num*num;
        int temp = num;
        boolean auto = true;
        while(temp>0){
            if(temp%10!=sqr%10){
                auto = false;
                System.out.print(num + " is not a automorphic number");
                
            }
            temp/=10;
            sqr/=10;
        }
        if(auto){
            System.out.print(num + " is a automorphic number");
        }
        scan.close();
    }
}