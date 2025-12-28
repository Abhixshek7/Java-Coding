import java.util.*;
public class revnum {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in); 
        int num = scan.nextInt();
        int rev =0;
        int originalNum = num;
        while(num!=0){
            rev= (rev*10)+(num%10);
            num/=10;
        }
        int diff = originalNum-rev;
        System.out.println(rev);
        System.out.print(diff);
        scan.close();
    }

}